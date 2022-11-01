package com.runnerUtils;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/features", 
glue = { "src/test/java/stepDefinitions" }, 
monochrome = true,
plugin = "json:target/cucumber-reports/CucumberTestReport.json")

public class TestRunner {

}
