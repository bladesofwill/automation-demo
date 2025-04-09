package com.automation.demo.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    WebDriver driver;

    public WebDriver createDriver() {
        WebDriver driver = new ChromeDriver();
        return driver;
    }
}
