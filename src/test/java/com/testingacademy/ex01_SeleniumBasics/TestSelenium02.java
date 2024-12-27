package com.testingacademy.ex01_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium02 {

    @Description("Open the app vwo.com and get the title")
    @Test

    public void test_Selenium02()
    {

        //open the url
        //print the title

        EdgeDriver  driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        String a = driver.getTitle();
        System.out.println(a);


    }
}
