package com.stepdefinitions;

import java.util.Map;

import io.cucumber.java.en.When;

public class LogoutSteps {

@When("user able to logout with following username")
public void Successfullogout(Map<String, Object> data) {
Utils.request.body(data);
Utils.response = Utils.request.post();
}

@When("user unable to logout with following username")
public void Unsuccessfullogout(Map<String, Object> data) {
Utils.request.body(data);
Utils.response = Utils.request.post();
}
}