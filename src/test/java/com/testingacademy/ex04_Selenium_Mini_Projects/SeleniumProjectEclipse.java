package com.testingacademy.ex04_Selenium_Mini_Projects;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumProjectEclipse {

    @Description("Verify that with invalid email, pass, error message is shown on the https://rahulshettyacademy.com/locatorspractice")
    @Test

    public void test_negative_login() throws Exception{

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://rahulshettyacademy.com/locatorspractice");


        // 1. Find the email inputbox and enter the email


        WebElement emailInputBox = driver.findElement(By.id("inputUsername"));
        emailInputBox.sendKeys("Shobha");


        //2.Find the password inputbox and enter the password


       //WebElement passwordInputBox = driver.findElement(By.id("login-password"));
       WebElement passwordInputBox = driver.findElement(By.name("inputPassword"));
       passwordInputBox.sendKeys("admin");

       //3.Find the Signin button and Click on sign in button


        WebElement signinButton = driver.findElement(By.xpath("//button[@class='submit signInBtn']"));
        signinButton.click();

        Thread.sleep(3000);


        //4.Find the invalid error message and verify

        WebElement errorMessage = driver.findElement(By.className("error"));
        String message = errorMessage.getText();
        System.out.println("Error message :" +message);

        Assert.assertEquals(errorMessage.getText(),"* Incorrect username or password");


        Thread.sleep(3000);
        driver.quit(); // It will close all the tabs. - session id == null

    }


}
