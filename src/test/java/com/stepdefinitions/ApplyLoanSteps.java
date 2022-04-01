package com.stepdefinitions;

import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class ApplyLoanSteps {

	@When("user provides the valid details to apply loan ")
	public void SuccessfulapplyLoan(Map<String, Object> data) {
		Utils.request.body(data);
		Utils.response = Utils.request.post();
	}

	@When("user provied null values")
	public void NullValues(Map<String, Object> data) {
		Utils.request.body(data);
		Utils.response = Utils.request.post();
	}
}	