package com.qascript.PageObjects;

import com.qascript.BaseClass;
import com.qascript.utils.BrowserUtils;

public class ShoppingCartPage extends BaseClass {
    private static String btnCheckOut = "//a[text()='Checkout']";
    private static String btnContinueShopping = "//a[text()='Continue Shopping']";
    private static String linkProduct = "(//div[@id='content']//table)[1]//tbody//tr[1]/td[2]/a";
    private static String txtboxQuantity = "//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input";
    private static String txtPrice = "//*[@id=\"content\"]/form/div/table/tbody/tr/td[5]";
    private static String txtTotalPrice = "//*[@id=\"content\"]/form/div/table/tbody/tr/td[6]";

    public static void clickCheckout() {
        BrowserUtils.clickElement(btnCheckOut);
    }

    public static void clickContinueShopping() {
        BrowserUtils.clickElement(btnContinueShopping);
    }

    public static void validateProductName(String expectedProductName) {
        BrowserUtils.validateText(linkProduct, expectedProductName);
    }

    public static void validateQuantity(String expectedQuantity) {
        BrowserUtils.validateValue(txtboxQuantity, expectedQuantity, "value");
    }

    public static void validatePrice(String expectedPrice) {
        BrowserUtils.validateText(txtPrice, expectedPrice);
    }

    //    public static void validateTotalPrice(String expectedPrice, String expectedQuantity){
//        int expectedTotalPrice = Integer.parseInt(expectedPrice) * Integer.parseInt(expectedQuantity);
//        BrowserUtils.validateText(txtTotalPrice, String.valueOf(expectedTotalPrice));
    public static void validateTotalPrice(String expectedTotalPrice) {
        BrowserUtils.validateText(txtTotalPrice, expectedTotalPrice);
    }

}
