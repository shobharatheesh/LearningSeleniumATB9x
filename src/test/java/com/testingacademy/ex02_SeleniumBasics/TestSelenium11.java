package com.testingacademy.ex02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium11 {

    @Description("Open the app")
    @Test

    public void test_Selenium11()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        //use navigation methods
        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        
    }
}
