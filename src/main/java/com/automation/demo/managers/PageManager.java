package com.automation.demo.managers;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.demo.pages.*;

public class PageManager {
    
    private WebDriver driver;
    String searchText;

    HashMap<String, String> selectorMap = new HashMap<String, String>() {{
        put("search", ".gLFyf");
        put("google search button", "body > div > div > form > div:nth-child(1) > div > div > div > div > center > input.gNO89b");
    }};

    public PageManager(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void navigateToPage(String urlString) throws IOException {
        driver.get(urlString);
    }

    public void fillTextField(String text, String elementName) {
        searchText = text;
        WebElement target = driver.findElement(By.cssSelector(selectorMap.get(elementName)));
        CommonFunctions.setElementField(target, text);
    }

    public void clickOnElement(String elementName) {
        WebElement target = driver.findElement(By.cssSelector(selectorMap.get(elementName)));
        CommonFunctions.clickElement(target);
    }

    public void elementVisibilityWait(String elementName) {
        By target = By.cssSelector(selectorMap.get(elementName));
        CommonFunctions.checkElementVisibility(driver, target);
    }

    public void elementInteractableWait(String elementName) {
        By target = By.cssSelector(selectorMap.get(elementName));
        CommonFunctions.elementInteractableWait(driver, target);
    }

    public void checkGoogleSearchResults() {
        By target = By.cssSelector("#rso > div:nth-child(2)");
        CommonFunctions.checkElementVisibility(driver, target);
        WebElement targetElement = driver.findElement(target);
        assert targetElement.getText().contains(searchText);
    }
  
}
