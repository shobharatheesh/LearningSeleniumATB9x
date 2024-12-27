package com.testingacademy.ex02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium05 {

    @Description("Open the app  vwo.com  and get the title")
    @Test

    public void test_Selenium05()
    {

        WebDriver  driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");



    }
}
