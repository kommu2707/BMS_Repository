package com.stepdefinitions;

import java.util.Map;

import io.cucumber.java.en.When;

public class ViewLoanSteps {

	@When("user able view with the following details")
	public void user_able_view_with_the_following_details(Map<String, Object> data) {
		Utils.request.body(data);
		Utils.response = Utils.request.get();
	}

	@When("user unable to view with the following details")
	public void user_unable_to_view_with_the_following_details(Map<String, Object> data) {
		Utils.request.body(data);
		Utils.response = Utils.request.get();
	}

}