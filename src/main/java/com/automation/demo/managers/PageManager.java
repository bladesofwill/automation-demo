package com.automation.demo.managers;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.demo.pages.*;

public class PageManager {
    
    private WebDriver driver;
    private CommonFunctions commonFunctions;
    String searchText;

    HashMap<String, String> selectorMap = new HashMap<String, String>() {{
        put("search", ".gLFyf");
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
        WebElement target = driver.findElement(By.cssSelector(selectorMap.get(elementName)));
        commonFunctions.setElementField(target, text);
    }

    public void clickOnElement(String elementName) {
        WebElement target = driver.findElement(By.cssSelector(selectorMap.get(elementName)));
        commonFunctions.clickElement(target);
    }
  
}
