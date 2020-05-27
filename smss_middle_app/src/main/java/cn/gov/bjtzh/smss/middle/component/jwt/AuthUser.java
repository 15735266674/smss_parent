package cn.gov.bjtzh.smss.middle.component.jwt;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;

/**
 * All rights Reserved, Designed By YangJingRui
 *
 * @Package cn.com.picc.vdcamt.applet.component.jwt.vo
 * @Description: microservice_vdcamt
 * @Author: YangJingRui
 * @Email: yangjingrui@sinosoft.com.cn
 * @Date: 2020-01-19 16:35
 * @Version V1.0
 * @Copyright: 2020@www.picc.com All rights reserved.
 */
public class AuthUser implements Serializable {

    private static final long serialVersionUID = 1L;
    private final String id;
    /**
     * 用户类型：0管理员 1 巡店员 2 驻点员
     */
    private final String usertype;
    private final String usercode;
    private final String username;
    private final String comcode;
    private final String password;
    private final Date lastPasswordResetDate;

    public AuthUser(String id, String usertype, String usercode, String username, String comcode, String password, Date lastPasswordResetDate) {
        this.id = id;
        this.usertype = usertype;
        this.usercode = usercode;
        this.username = username;
        this.comcode = comcode;
        this.password = password;
        this.lastPasswordResetDate = lastPasswordResetDate;
    }
    @JsonIgnore
    public String getId() {
        return id;
    }

    public String getUsercode() {
        return usercode;
    }

    public String getUsername() {
        return username;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    // 账户是否未过期
    @JsonIgnore
    public boolean isAccountNonExpired() {
        return true;
    }

    // 账户是否未锁定
    @JsonIgnore

    public boolean isAccountNonLocked() {
        return true;
    }

    // 密码是否未过期
    @JsonIgnore

    public boolean isCredentialsNonExpired() {
        return true;
    }

    // 账户是否激活
    @JsonIgnore
    public boolean isEnabled() {
        return true;
    }

    // 获取上次密码重置日期
    @JsonIgnore
    public Date getLastPasswordResetDate() {
        return lastPasswordResetDate;
    }

    public String getUsertype() {
        return usertype;
    }

    public String getComcode() {
        return comcode;
    }
}
