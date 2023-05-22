package com.qascript.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("User enters valid username in the username field")
    public void userEntersValidUsernameInTheUsernameField() {
    }

    @And("User enters valid password in the password field")
    public void userEntersValidPasswordInThePasswordField() {
    }

    @When("User clicks the login button")
    public void userClicksTheLoginButton() {
    }

    @Then("User is logged in successfully")
    public void userIsLoggedInSuccessfully() {
    }

    @Given("User enters invalid username in the username field")
    public void userEntersInvalidUsernameInTheUsernameField() {
    }

    @And("User enters invalid password in the password field")
    public void userEntersInvalidPasswordInThePasswordField() {
    }

    @Then("User is NOT logged into the application")
    public void userIsNOTLoggedIntoTheApplication() {
    }
}
