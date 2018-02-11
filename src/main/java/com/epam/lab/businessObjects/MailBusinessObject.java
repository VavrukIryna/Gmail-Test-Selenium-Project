package com.epam.lab.businessObjects;

import com.epam.lab.pageObject.MailPage;


public class MailBusinessObject {

    private MailPage mailPage;


    public MailBusinessObject() {
        this.mailPage = new MailPage();
    }


    public void writeMessage(String... arg) {
        mailPage.typeMessage(arg);
        mailPage.submitMessage();
    }

    public boolean verifyWarningMessageExists() {
        return mailPage.verifyWarningMessageExists();
    }

    public void closeWarningMessage() {
        mailPage.clickWarningMessage();
    }

    public String checkMail() {
        return mailPage.checkSentMail();
    }
}
