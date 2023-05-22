package com.qascript.StepDefs;

import com.qascript.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSteps extends BaseClass {

    @Given("User enters valid username in the username field")
    public void userEntersValidUsernameInTheUsernameField() {
        driver.findElement(By.id("input-email")).sendKeys("patebij@gmail.com");
    }

    @And("User enters valid password in the password field")
    public void userEntersValidPasswordInThePasswordField() {
        driver.findElement(By.id("input-password")).sendKeys("test@123");
    }

    @When("User clicks the login button")
    public void userClicksTheLoginButton() {
        driver.findElement(By.xpath("//input[@value='Login']")).click();
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
