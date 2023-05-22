package com.qascript.PageObjects;

import com.qascript.BaseClass;
import com.qascript.utils.BrowserUtils;
import org.openqa.selenium.By;

public class LoginPage extends BaseClass {
    private static String txtEmail = "//input[@id='input-email']";
    private static String txtPassword = "//input[@id='input-password']";
    private static String btnLogin = "//input[@value='Login']";
    private static String linkForgottenPassword = "(//a[@text()='Forgotten Password'])[1]";

    public static void enterUserName(String username){
        BrowserUtils.enterText(txtEmail, username);
    }

    public static void enterBadUserName(String badUsername){
        BrowserUtils.enterText(txtEmail, badUsername);
    }

    public static void enterPassword(String password){
        BrowserUtils.enterText(txtPassword, password);
    }
    public static void enterBadPassword(String badPassword){
        BrowserUtils.enterText(txtPassword, badPassword);
    }

    public static void clickLogin(){
        BrowserUtils.clickElement(btnLogin);
    }

    public static void clickForgottenPassword(){
        driver.findElement(By.xpath(linkForgottenPassword)).click();
    }
}
