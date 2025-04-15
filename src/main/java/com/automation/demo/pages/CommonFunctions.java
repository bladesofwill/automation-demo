package com.automation.demo.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

// This class serves as a collection of commonly used functions for interacting with web pages
// It's goal is to standardize test execution, reduce code duplication, and act as a quick reference for how to perform common actions or work around frequent issues
public class CommonFunctions {

    // clicks on a specified element
    public static void clickElement(WebElement targetElement) {
        targetElement.click();
    }

    // clicks on a specified element using javascript when element.click() does not work
    public static void jsClickElement(WebDriver driver, WebElement targetElement) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", targetElement);
    }

    // sets values in fields
    public static void setElementField(WebElement targetElement, String value) {
        targetElement.clear();
        targetElement.sendKeys(value);
    }

    public static void checkElementVisibility(WebDriver driver, By elementLocator) {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
    }

    public static void elementInteractableWait(WebDriver driver, By elementLocator) {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
    }

}
