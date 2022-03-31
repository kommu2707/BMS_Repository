package com.testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/Registration.feature" }, glue = {
		"com.stepdefinitions" }, plugin = { "json:target/Myreports/report.json",
				"junit:target/Myreports/report.xml" }, dryRun = true, monochrome = true)
public class TestRunner {
	
	private void Syso() {
		System.out.println("Hi");

	}

}
