package com.automation.demo.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// This class serves as a collection of commonly used functions for interacting with web pages
// It's goal is to standardize test execution, reduce code duplication, and act as a quick reference for how to perform common actions or work around frequent issues
public class CommonFunctions {

    // clicks on a specified element
    public void clickElement(WebElement targetElement) {
        targetElement.click();
    }

    // clicks on a specified element using javascript when element.click() does not work
    public void jsClickElement(WebDriver driver, WebElement targetElement) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", targetElement);
    }

    // sets values in fields
    public void setElementField(WebElement targetElement, String value) {
        targetElement.clear();
        targetElement.sendKeys(value);
    }

    
}
