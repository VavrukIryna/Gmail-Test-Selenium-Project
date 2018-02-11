package com.epam.lab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverThreadInit {

    private DriverThreadInit() {

    }

    private static DriverThreadInit instance = new DriverThreadInit();

    public static DriverThreadInit getInstance() {
        return instance;
    }

    public ThreadLocal<WebDriver> threadDriver = new ThreadLocal<WebDriver>() // thread local driver object for webdriver
    {
        @Override
        protected WebDriver initialValue() {
            WebDriver driver;
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            return driver;
        }

    };

    public WebDriver getDriver() {
        return threadDriver.get();
    }

    public void removeDriver() {
        threadDriver.get().close();
        threadDriver.get().quit();
        threadDriver.remove();
    }
}