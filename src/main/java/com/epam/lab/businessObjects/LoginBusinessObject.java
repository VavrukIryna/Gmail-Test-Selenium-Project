package com.epam.lab.businessObjects;

import com.epam.lab.pageObject.LoginPage;
import com.epam.lab.pageObject.PasswordPage;


public class LoginBusinessObject {
    private LoginPage loginPage;
    private PasswordPage passwordPage;

    public LoginBusinessObject() {
        this.loginPage = new LoginPage();
        this.passwordPage = new PasswordPage();
    }

    public void loginUser(String login, String password) {
        loginPage.typeLogin(login);
        passwordPage.typePassword(password);
    }
}
