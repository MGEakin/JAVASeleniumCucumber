package com.qascript.PageObjects;

import com.qascript.BaseClass;
import com.qascript.utils.BrowserUtils;

public class HomePage extends BaseClass {

    private static String myAccountText = "(//div[@id='content']/h2)[1]";
    private static String linkShowAllLaptopsAndNotebooks = "//a[text()='Show All Laptops & Notebooks']";
    private static String linkLaptopsAndNotebooks = "(//a[text()='Laptops & Notebooks'])[1]";

    public static void validateLogin(String expectedText){

        BrowserUtils.validateText(myAccountText, expectedText);
    }

    public static void clickAllLaptopsAndNotebooks(){
        BrowserUtils.hoverElement(linkShowAllLaptopsAndNotebooks, linkLaptopsAndNotebooks);
    }
}
