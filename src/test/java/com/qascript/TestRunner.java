package com.qascript;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/Login.feature",
                "src/test/resources/features/ShoppingCart.feature",
                "src/test/resources/features/Checkout.feature"},
        plugin = {
                "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json"
        },
        tags = "@functional"
//        publish = true
)
public class TestRunner {
}
