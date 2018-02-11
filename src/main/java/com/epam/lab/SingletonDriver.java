package com.epam.lab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class SingletonDriver {


    private static WebDriver driver = null;

    private static WebDriver InitDriver() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        return driver;
    }

    public static WebDriver getDriver() {
        driver = InitDriver();
        return driver;
    }


}

