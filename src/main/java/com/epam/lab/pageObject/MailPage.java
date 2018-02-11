package com.epam.lab.pageObject;

import com.epam.lab.decorator.MyButton;
import com.epam.lab.decorator.MyTextInput;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.FindBy;

public class MailPage extends AbstractPage {
    final static Logger LOG = Logger.getLogger(MyButton.class);
    @FindBy(xpath = "//*[@class='z0']")
    private MyButton composeButton;

    @FindBy(name = "to")
    private MyTextInput senderMailField;

    @FindBy(name = "subjectbox")
    private MyTextInput subjectMailField;

    @FindBy(xpath = "//*[@role=\"textbox\"]")
    private MyTextInput messageMailField;

    @FindBy(xpath = "//div[@class='J-J5-Ji btA']")
    private MyButton submitButton;

    @FindBy(xpath = "//button[text()='OK']")
    private MyButton warningOkButton;

    @FindBy(xpath = "//div[@class='aoD hl']")
    private MyTextInput composeMailField;

    @FindBy(css = ".vM")
    private MyButton closeSenderMailButton;

    @FindBy(css = ".ag")
    private MyButton sentMailFolderButton;

    @FindBy(css = ".g2")
    private MyButton lastMessageButton;

    public MailPage() {
        super();
    }

    public void typeMessage(String... count) {

        if (count.length == 1) {
            LOG.info("Close incorrect sender email");
            composeMailField.click();
            closeSenderMailButton.click();
            LOG.info("Enter correct email address");
            senderMailField.sendKeys(count[0]);
        } else {
            LOG.info("Click on compose button");
            composeButton.click();
            LOG.info("Enter incorrect email, fill subject and message fields");
            senderMailField.sendKeys(count[0]);
            subjectMailField.sendKeys(count[1]);
            messageMailField.sendKeys(count[2]);
        }
    }

    public boolean verifyWarningMessageExists() {
        LOG.info("Verify that warning message appears");
        return warningOkButton.exists();
    }

    public void clickWarningMessage() {
        LOG.info("Click button to close warning message");
        warningOkButton.click();
    }


    public void submitMessage() {
        LOG.info("Submit message");
        submitButton.click();
    }

    public String checkSentMail() {
        LOG.info("Verify that message is moved to correct folder");
        sentMailFolderButton.click();
        lastMessageButton.click();
        return lastMessageButton.getAttribute("email");
    }
}
