package com.automation.demo.steps;

import java.io.IOException;

import com.automation.demo.pages.*;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class CommonSteps {
    
    public PageManager pageManager;

    TestManager testManager;

    @After
    public void closeDriver() {
        WebDriver driverToClose = pageManager.getDriver();
        driverToClose.quit();
    }

    public CommonSteps(TestManager context) {
        testManager = context;
        pageManager = testManager.getPageManager();
    }

    @Given("^I am on the page \"([^\"]*)\"$")
    public void navigateToPage(String urlString) throws IOException {
        pageManager.navigateToPage(urlString);
    }

    @When("^I enter the text \"([^\"]*)\" in the \"([^\"]*)\" text field$")
    public void fillTextField(String text, String elementName) {}

    @When("^I click on the \"([^\"]*)\" element$")
    public void clickOnElement(String elementName) {}
}
