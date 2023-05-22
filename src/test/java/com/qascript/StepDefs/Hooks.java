package com.qascript.StepDefs;

import com.qascript.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends BaseClass {

    @Before
    public void setup(){
        initializeDriver();
    }

    @After
    public void close(){
        closeDriver();
    }
}
