package com.stepdefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UserIdAvailabilitySteps {

	private static final String USERID = "Zyan99";
	private static final String BASE_URL = "http://localhost:9090";
	private static Response response;
	RequestSpecification request;

	@Given("GET userID availability API")
	public void get_user_id_availability_api() {
		RestAssured.baseURI = BASE_URL;
		request = RestAssured.given();
		request.header("Content-Type", "application/json");
	}

	@When("Provide Valid userID")
	public void provide_valid_user_id() {
		response = request.body("{ \"userName\":\"" + USERID + "\"}").get("/checkUserIDAvailability/" + USERID);
	}

	@Then("Status_code equals {int}")
	public void status_code_equals(int code) {
		Assert.assertEquals(code, response.getStatusCode());
	}

	@Then("response contains the message {string}")
	public void response_contains_the_message(String message) {
		Assert.assertEquals(message, getJsonPath(response, "response"));
	}

	@When("Provide different userID {string}")
	public void provide_different_user_id(String userId) {
		response = request.body("{ \"userName\":\"" + userId + "\"}").get("/checkUserIDAvailability/" + userId);
	}

	public String getJsonPath(Response response, String key) {
		String resp = response.asString();
		JsonPath js = new JsonPath(resp);
		return js.get(key).toString();
	}

}