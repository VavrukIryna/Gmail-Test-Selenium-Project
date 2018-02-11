package com.epam.lab.pageObject;

import com.epam.lab.decorator.MyButton;
import com.epam.lab.decorator.MyTextInput;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.FindBy;

public class PasswordPage extends AbstractPage {
    final static Logger LOG = Logger.getLogger(MyButton.class);
    @FindBy(xpath = ".//*[@id='password']//descendant::input")
    private MyTextInput passwordInput;

    @FindBy(xpath = "//span[text()='Next']")
    private MyButton nextButton;

    public PasswordPage() {
        super();
    }

    public void typePassword(String password) {
        LOG.info("Type password and submit");
        passwordInput.sendKeys(password);
        nextButton.click();
    }


}

