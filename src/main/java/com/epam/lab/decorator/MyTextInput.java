package com.epam.lab.decorator;


import org.openqa.selenium.WebElement;

public class MyTextInput extends MyWebElement {

    public MyTextInput(WebElement element) {
        super(element);
    }

    public void sendKeys(String s) {

        super.sendKeys(s);
    }

    public void click() {

        super.click();
    }
}



