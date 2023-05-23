package com.qascript.PageObjects;

import com.qascript.BaseClass;
import com.qascript.utils.BrowserUtils;

import java.util.concurrent.TimeUnit;

public class CheckoutPage extends BaseClass {
    private static String radioNewAddress = "//input[@name='payment_address'][@value='new']";
//    private static String radioNewAddress = "//*[@id='collapse-payment-address']/div/form/div[3]/label/input";
    private static String txtFirstName = "//input[@id='input-payment-firstname']";
    private static String txtLastName = "//input[@id='input-payment-lastname']";
    private static String txtAddress1 = "//input[@id='input-payment-address-1']";
    private static String txtCity = "//input[@id='input-payment-city']";
    private static String txtPostCode = "//input[@id='input-payment-postcode']";
    private static String selCountry = "//*[@id=\"input-payment-country\"]";
    private static String selRegion = "//*[@id=\"input-payment-zone\"]";
    private static String btnPaymentAddressContinue = "//*[@id=\"button-payment-address\"]";

    public static void selectNewAddress() throws InterruptedException {
        BrowserUtils.clickRadio(radioNewAddress);
    }
    public static void enterFirstName(String firstName){
        BrowserUtils.enterText(txtFirstName, firstName);
    }
    public static void enterLastName(String lastName){
        BrowserUtils.enterText(txtLastName, lastName);
    }
    public static void enterAddress1(String address1){
        BrowserUtils.enterText(txtAddress1, address1);
    }
    public static void enterCity(String city){
        BrowserUtils.enterText(txtCity, city);
    }
    public static void enterPostal(String postal){
        BrowserUtils.enterText(txtPostCode, postal);
    }
    public static void selectCountry(String country){
        BrowserUtils.selectElement(selCountry, country);
    }
    public static void selectRegion(String region) throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        BrowserUtils.selectElement(selRegion, region);
    }
    public static void clickPaymentAddressContinueButton() {
        BrowserUtils.clickElement(btnPaymentAddressContinue);
    }
}
