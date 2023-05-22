package com.qascript.StepDefs;

import com.qascript.BaseClass;
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
        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://tutorialsninja.com/demo/index.php?route=account/account", url);
    }

    @Given("User enters invalid username in the username field")
    public void userEntersInvalidUsernameInTheUsernameField() {
        String badUsername = userProperties.getProperty("badUsername");
        LoginPage.enterBadUserName(badUsername);
    }

    @And("User enters invalid password in the password field")
    public void userEntersInvalidPasswordInThePasswordField() {
        String badPassword = userProperties.getProperty("badPassword");
        LoginPage.enterBadPassword(badPassword);
    }

    @Then("User is NOT logged into the application")
    public void userIsNOTLoggedIntoTheApplication() {
        String url = driver.getCurrentUrl();
        Assert.assertNotEquals("https://www.saucedemo.com/inventory.html", url);
    }
}
