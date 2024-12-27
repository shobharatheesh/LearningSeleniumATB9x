package com.testingacademy.ex02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium10 {

    @Description("Open the app")
    @Test

    public void test_Selenium10()
    {
        ChromeDriver driver  = new ChromeDriver();
        WebDriver driver1 = new ChromeDriver();
        driver1 = new FirefoxDriver();

    }
}
