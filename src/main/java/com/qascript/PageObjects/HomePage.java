package com.qascript.PageObjects;

import com.qascript.BaseClass;
import com.qascript.utils.BrowserUtils;
import org.openqa.selenium.By;

public class HomePage extends BaseClass {

    private static String myAccountText = "(//div[@id='content']/h2)[1]";
    private static String linkShowAllLaptopsAndNotebooks = "//a[text()='Show AllLaptops & Notebooks']";
    private static String linkLaptopsAndNotebooks = "(//a[text()='Laptops & Notebooks'])[1]";
    private static String linkShoppingCart = "//div[@id='cart']";
    private static String linkViewShoppingCart = "//i[@class='fa fa-shopping-cart']";
    private static String btnClearShoppingCart = "//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr/td[5]/button";
    public static void validateLogin(String expectedText){

        BrowserUtils.validateText(myAccountText, expectedText);
    }

    public static void clickAllLaptopsAndNotebooks(){
        BrowserUtils.hoverElement(linkLaptopsAndNotebooks, linkShowAllLaptopsAndNotebooks);
    }

    public static void clickShoppingCart(){
        BrowserUtils.clickElement(linkShoppingCart);
        BrowserUtils.clickElement(linkViewShoppingCart);
    }
    public static void clearCart() {
        BrowserUtils.clickElement(linkShoppingCart);
        Boolean isPresent = driver.findElements(By.xpath("//*[@id=\"cart\"]/ul/li/p")).size() > 0;
        if (!isPresent){
            BrowserUtils.clickElement(btnClearShoppingCart);
        }
        System.out.println("Cart already empty");
    }
}
