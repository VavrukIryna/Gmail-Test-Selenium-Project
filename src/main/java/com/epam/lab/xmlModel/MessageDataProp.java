package com.epam.lab.xmlModel;

public class MessageDataProp {


    private String correctMail;
    private String incorrectMail;
    private String testSubject;
    private String testMessage;


    public MessageDataProp() {
    }

    public MessageDataProp(String correctMail, String incorrectMail, String testSubject, String testMessage) {
        super();

        this.correctMail = correctMail;
        this.incorrectMail = incorrectMail;
        this.testMessage = testMessage;
        this.testSubject = testSubject;
    }


    public String getTestSubject() {
        return testSubject;
    }

    public void setTestSubject(String testSubject) {
        this.testSubject = testSubject;
    }

    public String getCorrectMail() {
        return correctMail;
    }

    public void setCorrectMail(String correctMail) {
        this.correctMail = correctMail;
    }

    public String getIncorrectMail() {
        return incorrectMail;
    }

    public void setIncorrectMail(String incorrectMail) {
        this.incorrectMail = incorrectMail;
    }

    public String getTestMessage() {
        return testMessage;
    }

    public void setTestMessage(String testMessage) {
        this.testMessage = testMessage;
    }
}