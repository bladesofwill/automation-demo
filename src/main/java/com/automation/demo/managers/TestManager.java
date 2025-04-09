package com.automation.demo.managers;

public class TestManager {
    
    private DriverManager driverManager;
    private PageManager pageManager;

    public TestManager() {
        driverManager = new DriverManager();
        pageManager = new PageManager(driverManager.createDriver());
    }

    public PageManager getPageManager() {
        return pageManager;
    }
}
