package com.testingacademy.ex02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium07 {

    @Description("Open the app  vwo.com  and get the title")
    @Test

    public void test_Selenium07()
    {

        WebDriver  driver = new EdgeDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

       // driver.manage().window().maximize();
        driver.manage().window().minimize();





    }
}
