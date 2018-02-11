package com.epam.lab.xmlModel;

public class LoginDataProp {


    private String loginData;
    private String passwordData;

    public LoginDataProp() {
    }

    public LoginDataProp(String loginData, String passwordData) {
        super();

        this.loginData = loginData;
        this.passwordData = passwordData;
    }

    public String getLoginData() {
        return loginData;
    }

    public void setLoginData(String loginData) {
        this.loginData = loginData;
    }

    public String getPasswordData() {
        return passwordData;
    }

    public void setPasswordData(String passwordData) {
        this.passwordData = passwordData;
    }

}