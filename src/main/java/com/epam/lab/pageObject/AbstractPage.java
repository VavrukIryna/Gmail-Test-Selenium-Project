package com.epam.lab.pageObject;

import com.epam.lab.DriverThreadInit;
import com.epam.lab.decorator.MyDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public abstract class AbstractPage {
    public WebDriver driver = DriverThreadInit.getInstance().getDriver();


    public AbstractPage() {
        PageFactory.initElements(new MyDecorator(new DefaultElementLocatorFactory(driver)), this);
    }

}

