package com.automation.demo.steps;

import com.automation.demo.managers.*;

import io.cucumber.java.en.*;

public class HomepageSteps {
    
    public PageManager pageManager;

    TestManager testManager;

    public HomepageSteps(TestManager context) {
        testManager = context;
        pageManager = testManager.getPageManager();
    }

    @Then("I should see google search results")
    public void checkGoogleSearchResults() {}
}
