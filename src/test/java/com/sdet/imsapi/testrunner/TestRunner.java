package com.sdet.imsapi.testrunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/program/"},
		glue = {"com.sdet.imsapi.stepdefinition"},
		plugin = {
				"pretty", "json:target/Cucumber.json",
				"html:target/Cucumber-html-report"
		},
		dryRun = false,
		tags = "@test"
	)
public class TestRunner {
	
	
	
}
