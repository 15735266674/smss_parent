package cn.gov.bjtzh.smss.middle.component.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.DefaultClaims;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Date;
import java.util.Map;

/**
 * All rights Reserved, Designed By YangJingRui
 *
 * @Package cn.gov.bjtzh.smss.middle.component.jwt
 * @Description: smss_parent
 * @Author: YangJingRui
 * @Email: arui83428@126.com
 * @Date: 2020-05-08 13:58
 * @Version V1.0
 * @Copyright: 2020@www.guodatou.com All rights reserved.
 */
@Slf4j
@Component
public class JwtTokenTools implements Serializable {


    private static final int MILLISECOND = 1000;
    private static final long serialVersionUID = -3301605591108950415L;
    public static final String CLAIM_KEY_COMCODE = "comcode";
    public static final String CLAIM_KEY_USERCODE = "usercode";
    public static final String CLAIM_KEY_USERNAME = "username";
    public static final String CLAIM_KEY_CREATED = "created";

    @Value("${jwt.secret}")
    private String secret;
    @Value("${jwt.header}")
    private String header;
    @Value("${jwt.expiration}")
    private Long expiration;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    /**
     * 获得jwt中的内容
     *
     * @param attribute 属性名
     * @return
     */
    public Object getAttribute(String attribute) {
        HttpServletRequest req = RequestUtils.getHttpServletRequest();
        String authHeader = req.getHeader(header);
        final String authToken = authHeader.substring(tokenHead.length());
        final Claims claims = getClaimsFromToken(authToken);
        return claims.get(attribute);
    }

    /**
     * 根据用户信息生成token
     *
     * @param user  用户信息
     * @param props 其它属性信息
     * @return
     */
    /*public String generateToken(CDUser user, Map<String, Object> props) {
        Map<String, Object> claims = new HashMap<>();
        claims.putAll(props);
        claims.put(CLAIM_KEY_COMCODE, user.getComcode());
        claims.put(CLAIM_KEY_USERCODE, user.getUsercode());
        claims.put(CLAIM_KEY_USERNAME, user.getUsername());
        claims.put(CLAIM_KEY_CREATED, new Date());
        return generateToken(claims);
    }*/

    /**
     * 获得当前登录用户的代码
     *
     * @return
     */
    public String getUsercode() {
        HttpServletRequest req = RequestUtils.getHttpServletRequest();
        String authHeader = req.getHeader(header);
        String usercode = "";
        if (!StringUtils.isEmpty(authHeader)) {
            final String authToken = authHeader.substring(tokenHead.length());
            usercode = this.getUsercodeFromToken(authToken);
        }
        return usercode;
    }

    public String getUsercodeFromToken(String token) {
        String usercode;
        try {
            final Claims claims = getClaimsFromToken(token);
            usercode = (String) claims.get(CLAIM_KEY_USERCODE);
        } catch (Exception e) {
            usercode = null;
            log.warn("{}", e.getMessage(), e);

        }
        return usercode;
    }

    public String getUsernameFromToken(String token) {
        String username;
        try {
            final Claims claims = getClaimsFromToken(token);
            username = (String) claims.get(CLAIM_KEY_USERNAME);
        } catch (Exception e) {
            username = null;
            log.warn("{}", e.getMessage(), e);
        }
        return username;
    }

    private Date getCreatedDateFromToken(String token) {
        Date created;
        try {
            final Claims claims = getClaimsFromToken(token);
            created = new Date((Long) claims.get(CLAIM_KEY_CREATED));
        } catch (Exception e) {
            created = null;
            log.warn("{}", e.getMessage(), e);
        }
        return created;
    }

    private Date getExpirationDateFromToken(String token) {
        Date expirationDate;
        try {
            final Claims claims = getClaimsFromToken(token);
            expirationDate = claims.getExpiration();
        } catch (Exception e) {
            expirationDate = null;
            log.warn("{}", e.getMessage(), e);
        }
        return expirationDate;
    }

    private Claims getClaimsFromToken(String token) {
        Claims claims;
        try {
            claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
        } catch (Exception e) {
            claims = new DefaultClaims();
            log.warn("{}", e.getMessage(), e);
        }
        return claims;
    }

    private Date generateExpirationDate() {
        return new Date(System.currentTimeMillis() + expiration * MILLISECOND);
    }

    private Boolean isTokenExpired(String token) {
        final Date expirationDate = getExpirationDateFromToken(token);
        if (expirationDate == null) {
            return false;
        }
        return expirationDate.before(new Date());
    }

    private static Boolean isCreatedBeforeLastPasswordReset(Date created, Date lastPasswordReset) {
        return (lastPasswordReset != null && created.before(lastPasswordReset));
    }

    private String generateToken(Map<String, Object> claims) {
        return Jwts.builder().setClaims(claims).setExpiration(generateExpirationDate())
                .signWith(SignatureAlgorithm.HS512, secret).compact();
    }

    public Boolean canTokenBeRefreshed(String token, Date lastPasswordReset) {
        final Date created = getCreatedDateFromToken(token);
        return !isCreatedBeforeLastPasswordReset(created, lastPasswordReset) && !isTokenExpired(token);
    }

    /**
     * 刷新token
     *
     * @param token
     * @return
     */
    public String refreshToken(String token) {
        String refreshedToken;
        try {
            final Claims claims = getClaimsFromToken(token);
            claims.put(CLAIM_KEY_CREATED, new Date());
            refreshedToken = generateToken(claims);
        } catch (Exception e) {
            refreshedToken = null;
            log.warn("{}", e.getMessage(), e);
        }
        return refreshedToken;
    }

    public Boolean validateTokenByName(String token, AuthUser userDetails) {
        AuthUser user = userDetails;
        final String username = getUsernameFromToken(token);
        final Date created = getCreatedDateFromToken(token);
        return (username.equals(user.getUsername()) && !isTokenExpired(token)
                && !isCreatedBeforeLastPasswordReset(created, user.getLastPasswordResetDate()));
    }


    public Boolean validateTokenByCode(String token, AuthUser userDetails) {
        AuthUser user = userDetails;
        final String usercode = getUsercodeFromToken(token);
        return (usercode.equals(user.getUsercode()));
    }

    /**
     * @throws
     * @Description: 判断Controller上是否有某个注解
     * @param: @param handler
     * @param: @param a
     * @param: @return
     * @return: boolean
     */
    public <A extends Annotation> boolean existAnnotation(Object handler, Class<A> a) {
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            A methodAnnotation = handlerMethod.getMethodAnnotation(a);
            if (methodAnnotation != null) {
                return true;
            }
        }
        return false;
    }


    public static void returnJson(HttpServletResponse response, String json) throws Exception {
        PrintWriter writer = null;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        try {
            writer = response.getWriter();
            writer.print(json);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    public static RestMessage returnErrorMessage() throws Exception {
        RestMessage restMessage = new RestMessage();
        restMessage.setData("");
        restMessage.setSuccess(false);
        restMessage.setMessage("接口异常");
        restMessage.setErrCode(1);
        return restMessage;
    }
}
