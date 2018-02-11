package com.epam.lab.pageObject;

import com.epam.lab.decorator.MyButton;
import com.epam.lab.decorator.MyTextInput;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {
    final static Logger LOG = Logger.getLogger(LoginPage.class);

    @FindBy(xpath = "//input[@type=\'email\']")
    private MyTextInput loginInput;

    @FindBy(xpath = "//span[text()='Next']")
    private MyButton nextButton;

    public LoginPage() {
        super();
    }

    public void typeLogin(String login) {
        LOG.info("Type login and submit");
        loginInput.sendKeys(login);
        nextButton.click();

    }


}
