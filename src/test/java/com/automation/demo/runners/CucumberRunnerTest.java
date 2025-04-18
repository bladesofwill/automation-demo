package com.automation.demo.runners;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"src/test/java/com/automation/demo/features"},
    plugin = {"pretty",
            "html:target/cucumber-reports/homepage.html",
            "json:target/cucumber-reports/homepage.json"
    },
    glue = {"com.automation.demo.steps"}
)

public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
