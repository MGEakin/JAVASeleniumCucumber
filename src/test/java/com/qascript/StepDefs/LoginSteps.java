package com.qascript.StepDefs;

import com.qascript.BaseClass;
import com.qascript.PageObjects.HomePage;
import com.qascript.PageObjects.LoginPage;
import com.qascript.utils.PropertyUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class LoginSteps extends BaseClass {
    Properties userProperties = PropertyUtil.loadUserProperties();

    @Given("User enters valid username in the username field")
    public void userEntersValidUsernameInTheUsernameField() {
        String username = userProperties.getProperty("username");
        LoginPage.enterUserName(username);
    }

    @And("User enters valid password in the password field")
    public void userEntersValidPasswordInThePasswordField() {
        String password = userProperties.getProperty("password");
        LoginPage.enterPassword(password);
    }

    @When("User clicks the login button")
    public void userClicksTheLoginButton() {
        LoginPage.clickLogin();
    }

    @Then("User is logged in successfully")
    public void userIsLoggedInSuccessfully() {
        HomePage.validateLogin("My Account");
    }

    @Given("^User enters invalid (.*) in the username field$")
    public void userEntersInvalidUsernameInTheUsernameField(String badUsername) {
//        String badUsername = userProperties.getProperty("badUsername");
        LoginPage.enterBadUserName(badUsername);
    }

    @And("^User enters invalid (.*) in the password field$")
    public void userEntersInvalidPasswordInThePasswordField(String badPassword) {
//        String badPassword = userProperties.getProperty("badPassword");
        LoginPage.enterBadPassword(badPassword);
    }

    @Then("^error (.*) is displayed$")
    public void userIsNOTLoggedIntoTheApplication(String errorMessage) {
        LoginPage.validateErrorMessage(errorMessage);
    }
}
