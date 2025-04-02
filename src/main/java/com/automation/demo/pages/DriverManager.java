package com.automation.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    WebDriver driver;

    public WebDriver createDriver() {
        WebDriver driver = new ChromeDriver();
        return driver;
    }
}
