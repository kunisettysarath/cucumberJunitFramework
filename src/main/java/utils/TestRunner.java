package utils;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features/FIrstFeatureFile.feature", glue = { "stepFiles", "utils" }, plugin = {
		"pretty", "html:target/html", "json:target/json/cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/extentReport/report.html" }, monochrome = true, dryRun = false)
public class TestRunner {

}
