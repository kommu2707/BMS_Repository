package com.testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features/Registration.feature" }, glue = {
		"com.stepdefinitions" }, plugin = { "pretty", "html:target/Myreports/cucumber-report.html","json:target/Myreports/report.json",
				"junit:target/Myreports/report.xml" }, monochrome = true)
public class TestRunner {
	
	private void Syso() {
		System.out.println("Hi");

	}

}
