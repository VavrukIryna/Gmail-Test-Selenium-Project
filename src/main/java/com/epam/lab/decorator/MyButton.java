package com.epam.lab.decorator;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;


public class MyButton extends MyWebElement {
    private WebElement element;

    public MyButton(WebElement element) {
        super(element);
    }

    public void click() {
        super.click();
    }
}
