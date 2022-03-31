package com.stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class RegistrationSteps {

	
	@When("user able to register with the following details")
	public void successRegisterUser(Map<String, Object> data) {
		Utils.request.body(data);
		Utils.response = Utils.request.post();
	}

	@When("user should not register with the following details")
	public void validateRegisterUser(Map<String, Object> data) {
		Utils.request.body(data);
		Utils.response = Utils.request.post();
	}
	
	
}
