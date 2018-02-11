package com.epam.lab.decorator;

import org.openqa.selenium.support.pagefactory.DefaultFieldDecorator;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import java.lang.reflect.Field;

public class MyDecorator extends DefaultFieldDecorator {

    public MyDecorator(ElementLocatorFactory factory) {
        super(factory);
    }

    @Override
    public Object decorate(ClassLoader loader, Field field) {

        ElementLocator locator = factory.createLocator(field);

        if (MyButton.class.isAssignableFrom(field.getType())) {
            final MyButton myButton = new MyButton(proxyForLocator(loader, locator));
            return myButton;
        } else if (MyTextInput.class.isAssignableFrom(field.getType())) {
            final MyTextInput myTextInput = new MyTextInput(proxyForLocator(loader, locator));
            return myTextInput;
        } else if (MyWebElement.class.isAssignableFrom(field.getType())) {
            final MyWebElement myWebElement = new MyWebElement(proxyForLocator(loader, locator));
            return myWebElement;
        } else {
            return super.decorate(loader, field);
        }

    }
}
