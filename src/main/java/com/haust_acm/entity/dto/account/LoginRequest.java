package com.haust_acm.entity.dto.account;

import java.io.Serializable;

/**
 * @FileName LoginRequest
 * @Description
 * @Author ouyu
 * @Date 2025-09-17
 **/
public class LoginRequest implements Serializable {
     private String email ;
     private String password ;
     private String checkCode;

    public LoginRequest(String email, String password, String loginCheckCode) {
        this.email = email;
        this.password = password;
        this.checkCode = loginCheckCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }
}
