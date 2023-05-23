package com.qascript.StepDefs;

import com.qascript.PageObjects.HomePage;
import com.qascript.PageObjects.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSteps {
    @Given("user clicks on Show All Notebooks and Laptops")
    public void userClicksOnShowAllNotebooksAndLaptops() {
        HomePage.clickAllLaptopsAndNotebooks();
    }

    @When("user clicks on Add to Cart button for Macbook")
    public void userClicksOnAddToCartButtonForMacbook() {
        ProductPage.validateProduct("MacBook");
        ProductPage.validatePrice("$602.00");
        ProductPage.clickAddToCart();
    }

    @Then("Macbook is added to the shopping cart")
    public void macbookIsAddedToTheShoppingCart() {
        ProductPage.clickAddToCart();
    }

    @And("user clicks on Macbook")
    public void userClicksOnMacbook() {
        ProductPage.clickProduct();
    }

    @And("user enters quantity")
    public void userEntersQuantity() {
        ProductPage.enterQuantity("2");
    }

    @And("user clicks on Shopping Cart link")
    public void userClicksOnShoppingCartLink() {
        ProductPage.clickShoppingCartLink();
    }
}
