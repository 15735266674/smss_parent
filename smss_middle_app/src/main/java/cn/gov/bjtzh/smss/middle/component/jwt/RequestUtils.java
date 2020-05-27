package cn.gov.bjtzh.smss.middle.component.jwt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * All rights Reserved, Designed By YangJingRui
 *
 * @Package cn.gov.bjtzh.smss.middle.component.jwt
 * @Description: smss_parent
 * @Author: YangJingRui
 * @Email: arui83428@126.com
 * @Date: 2020-05-08 16:00
 * @Version V1.0
 * @Copyright: 2020@www.guodatou.com All rights reserved.
 */
public class RequestUtils {

    private static final Logger log = LoggerFactory.getLogger(RequestUtils.class);
    public static final ThreadLocal<ServletRequest> store = new ThreadLocal();

    private RequestUtils() {
    }

    public static Map<String, String> convertToMap(HttpServletRequest request) {
        HashMap<String, String> paramMap = new HashMap();
        Enumeration names = request.getParameterNames();

        while(names.hasMoreElements()) {
            String name = (String)names.nextElement();
            paramMap.put(name, request.getParameter(name));
        }

        return paramMap;
    }

    public static int getInt(Map<String, String[]> paramMap, String paramName, int defaultValue) {
        String[] paramValue = (String[])paramMap.get(paramName);
        int value = defaultValue;

        try {
            if (paramValue != null && paramValue.length > 0) {
                value = Integer.valueOf(paramValue[0]);
            }
        } catch (NumberFormatException var6) {
            log.debug("{}", var6);
        }

        return value;
    }

    public static String getString(Map<String, String[]> paramMap, String paramName, String defaultValue) {
        String[] paramValue = (String[])paramMap.get(paramName);
        String value = defaultValue;

        try {
            if (paramValue != null && paramValue.length > 0) {
                value = paramValue[0];
            }
        } catch (Exception var6) {
            value = defaultValue;
            log.debug("{}", var6.getMessage(), var6);
        }

        return value;
    }

    public static void setRequest(ServletRequest request) {
        store.set(request);
        log.debug("ThreadLocal store request,IP={}", request.getRemoteAddr());
    }

    public static HttpServletRequest getRequest() {
        ServletRequest request = (ServletRequest)store.get();
        return request == null ? null : (HttpServletRequest)request;
    }

    public static HttpServletRequest getHttpServletRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }

}
