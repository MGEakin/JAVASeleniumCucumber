package com.qascript.StepDefs;

import com.qascript.PageObjects.CheckoutPage;
import com.qascript.PageObjects.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class CheckoutSteps {
    @Given("User clicks on Checkout button")
    public void userClicksOnCheckoutButton() {
        ShoppingCartPage.clickCheckout();
    }

    @And("User clicks on Continue button")
    public void userClicksOnContinueButton() {
    }

    @And("User clicks on Agree checkbox")
    public void userClicksOnAgreeCheckbox() {
    }

    @And("User enters Billing Details")
    public void userEntersBillingDetails() throws InterruptedException {
        CheckoutPage.selectNewAddress();
        CheckoutPage.enterFirstName("Matt");
        CheckoutPage.enterLastName("Eakin");
        CheckoutPage.enterAddress1("Address 1 Here");
        CheckoutPage.enterCity("Columbus");
        CheckoutPage.enterPostal("43235");
        CheckoutPage.selectCountry("United States");
        CheckoutPage.selectRegion("Ohio");
        CheckoutPage.clickPaymentAddressContinueButton();

    }
}
