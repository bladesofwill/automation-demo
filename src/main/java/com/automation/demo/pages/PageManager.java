package com.automation.demo.pages;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class PageManager {
    
    private WebDriver driver;

    public PageManager(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void navigateToPage(String urlString) throws IOException {
        driver.get(urlString);
    }
  
}
