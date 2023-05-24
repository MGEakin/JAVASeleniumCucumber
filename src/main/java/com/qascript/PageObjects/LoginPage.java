package com.qascript.PageObjects;

import com.qascript.BaseClass;
import com.qascript.utils.BrowserUtils;
import com.qascript.utils.ExcelUtils;
import org.openqa.selenium.By;

import java.util.List;

public class LoginPage extends BaseClass {
    private static String txtEmail = "//input[@id='input-email']";
    private static String txtPassword = "//input[@id='input-password']";
    private static String btnLogin = "//input[@value='Login']";
    private static String linkForgottenPassword = "(//a[@text()='Forgotten Password'])[1]";
    private static String alterLoginError = "//div[contains(@class, 'alert-danger')]";
    private static ExcelUtils excelUtils = new ExcelUtils("src/test/resources/testData/sample.xlsx");

    public static void enterUserName(String email){
        List<String> usernames = getUserName();
        String username = usernames.get(0);
        System.out.println("email:"+email);
        System.out.println("username:"+username);
        BrowserUtils.enterText(txtEmail, username);
    }

    public static void enterBadUserName(String badUsername){
        BrowserUtils.enterText(txtEmail, badUsername);
    }

    public static void enterPassword(String old_password){
        List<String> passwords = getPassword();
        String password = passwords.get(1);
        System.out.println("old_password:"+old_password);
        System.out.println("password:"+password);

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

    public static void validateErrorMessage(String expectedText){
        System.out.println(expectedText);
        BrowserUtils.validateText(alterLoginError, expectedText);

    }

    public static List<String> getUserName(){
        return excelUtils.readExcelData("Login", "Username");
    }
    public static List<String> getPassword(){
        return excelUtils.readExcelData("Login", "Password");
    }
}
