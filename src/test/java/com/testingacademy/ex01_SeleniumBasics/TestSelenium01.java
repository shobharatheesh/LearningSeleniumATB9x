package com.testingacademy.ex01_SeleniumBasics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Test

    public void test_Selenium01()
    {

        //open the url
        //print the title

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());




    }
}
