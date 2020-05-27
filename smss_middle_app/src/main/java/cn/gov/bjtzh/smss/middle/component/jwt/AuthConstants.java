package cn.gov.bjtzh.smss.middle.component.jwt;

/**
 * All rights Reserved, Designed By YangJingRui
 *
 * @Package cn.gov.bjtzh.smss.middle.component.jwt
 * @Description: smss_parent
 * @Author: YangJingRui
 * @Email: arui83428@126.com
 * @Date: 2020-05-08 13:56
 * @Version V1.0
 * @Copyright: 2020@www.guodatou.com All rights reserved.
 */
public class AuthConstants {

    public static final String COMCODE = "comcode";
    public static final String USERTYPE = "usertype";
    public static final String USERCODE = "usercode";
    public static final String USERNAME = "username";
    public static final String NICKNAME = "nickname";
    public static final String TOKEN = "smss-token";

    // 不验证URL anon：不验证/authc：受控制的
    public static final String NO_INTERCEPTOR_PATH =".*/((.css)|(.js)|(images)|(login)|(anon)).*";


    private AuthConstants() {

    }

}
