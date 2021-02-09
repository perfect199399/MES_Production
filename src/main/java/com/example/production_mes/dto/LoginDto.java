package com.example.production_mes.dto;


import java.io.Serializable;

/**
 * 用户登录信息
 */
public class LoginDto implements Serializable {

    private String login_name;

    private String password;

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
