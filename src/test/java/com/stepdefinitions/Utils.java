package com.stepdefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Utils {
		
	protected static RequestSpecification request;
	protected static Response response;

	@Given("set application URI {string}")
	public void applicationUtils(String uri) {
		RestAssured.baseURI = uri;
		RestAssured.given().contentType(ContentType.JSON);
	}
	
	@Given("goto {string}")
	public void gotoURL(String path) {
		RestAssured.basePath = path;
		request = RestAssured.given();
	}
	
	@Then("Receives Response Status as {int} with Message as {string}")
	public void responseValidation(int statusCode, String message) {
		System.out.println("Response Code --->" + response.getStatusCode());
		System.out.println("Response Body --->" + response.asString());
		Assert.assertEquals("Invalid Response Status", statusCode, response.getStatusCode());
		Assert.assertTrue("Invalid Message", response.asString().contains(message));
	}
	
}
