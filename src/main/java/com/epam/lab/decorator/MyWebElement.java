package com.epam.lab.decorator;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MyWebElement implements WebElement {

    private WebElement element;


    public MyWebElement(WebElement element) {
        this.element = element;
    }


    @Override
    public void click() {
        element.click();
    }


    @Override
    public String getAttribute(String s) {
        return element.getAttribute(s);
    }

    @Override
    public boolean isSelected() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public String getText() {
        return null;
    }

    @Override
    public List<WebElement> findElements(By by) {
        return null;
    }

    @Override
    public WebElement findElement(By by) {
        return null;
    }

    @Override
    public boolean isDisplayed() {
        return false;
    }

    @Override
    public Point getLocation() {
        return null;
    }

    @Override
    public Dimension getSize() {
        return null;
    }

    @Override
    public Rectangle getRect() {
        return null;
    }

    @Override
    public String getCssValue(String s) {
        return null;
    }

    @Override
    public void submit() {
        element.submit();
    }

    @Override
    public void sendKeys(CharSequence... charSequences) {
        element.sendKeys(charSequences);
    }

    @Override
    public void clear() {

    }

    @Override
    public String getTagName() {
        return null;
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        return null;
    }

    public boolean exists() {
        try {
            String innerHTML = element.getAttribute("innerHTML");
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
