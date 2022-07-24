package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    @Given("user is on {word} login page")
    public void i_am_a_librarian(String word) {
        System.out.println("I am on " +word+ " login page");
    }
    @When("user enters {word} username")
    public void logged_in(String word) {
        System.out.println("I am logging in as " +word);
    }
    @When("user enters {word} password")
    public void user_enters_librarian_password(String word) {
        System.out.println("I enter " +word+ " password");
    }
    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        System.out.println("I logged in and see the dashboard");
    }

}
