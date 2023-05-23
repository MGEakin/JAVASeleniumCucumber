package com.qascript.PageObjects;

import com.qascript.BaseClass;
import com.qascript.utils.BrowserUtils;

public class ProductPage extends BaseClass {

    private static String linkMacbook = "//a[text()='MacBook']";
    private static String btnAddToCart = "//button[@id='button-cart']";
    private static String txtProductHeading = "//*[@id=\"content\"]/div/div[2]/h1";
    private static String txtPrice = "//*[@id=\"content\"]/div/div[2]/ul[2]/li[1]/h2";
    private static String txtQuantity = "//input[@id='input-quantity']";
    private static String btnShoppingCart = "//div[@id='cart']";

    public static void clickProduct(){
        BrowserUtils.clickElement(linkMacbook);
    }
    public static void validateProduct(String expectedProduct){
        BrowserUtils.validateText(txtProductHeading, expectedProduct);
    }
    public static void validatePrice(String expectedPrice){
        BrowserUtils.validateText(txtPrice, expectedPrice);
    }
    public static void clickAddToCart(){
        BrowserUtils.clickElement(btnAddToCart);
    }
    public static void enterQuantity(String quantity){
        BrowserUtils.enterText(txtQuantity, quantity);
    }
    public static void clickShoppingCartLink(){
        BrowserUtils.clickElement(btnShoppingCart);
    }
}
