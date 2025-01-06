package com.testingacademy.ex05_SeleniumXpath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumProject7Waits {

    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test

    public void test_negative_vwo_login() throws Exception{

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");


        // 1. Find the email inputbox and enter the email

         // <input
        //type="email"
        //class="text-input W(100%)"
        //name="username"
        //id="login-username"
        //data-qa="hocewoqisi">


        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");


        //2.Find the password inputbox and enter the password

        //<input
        // type="password"
        // class="text-input W(100%)"
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe">

       //WebElement passwordInputBox = driver.findElement(By.id("login-password"));
       WebElement passwordInputBox = driver.findElement(By.name("password"));
       passwordInputBox.sendKeys("admin");

       //3.Find the Signin button and Click on sign in button

        //<button
        // type="submit"
        // id="js-login-btn"
        // class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)"
        // onclick="login.login(event)"
        // -qa="sibequkica">

        WebElement signinButton = driver.findElement(By.id("js-login-btn"));
        signinButton.click();

        //Thread.sleep(3000);

        //4.Find the invalid error message and verify

        //<div
        // class="notification-box-description"
        // id="js-notification-box-msg"
        // data-qa="rixawilomi">Your email, password, IP address or location did not match</div>

        //WebElement errorMessage = driver.findElement(By.id("js-notification-box-msg"));
        WebElement errorMessage = driver.findElement(By.className("notification-box-description"));

        //visibility of the error message is visible or element should be visible
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait1.until((ExpectedConditions.visibilityOf(errorMessage)));

        //condition -->Explicit wait untill message is displayed or element should have the text
        WebDriverWait wait2 =  new WebDriverWait(driver, Duration.ofSeconds(3));
        wait2.until(ExpectedConditions.textToBePresentInElement(errorMessage,"Your email, password, IP address or location did not match"));

      //or
        //WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(3));
        //wait1.until((ExpectedConditions.visibilityOf(errorMessage)));
        //wait2.until(ExpectedConditions.textToBePresentInElement(errorMessage,"Your email, password, IP address or location did not match"));



        Assert.assertEquals(errorMessage.getText(),"Your email, password, IP address or location did not match");

        Thread.sleep(3000);
        driver.quit(); // It will close all the tabs. - session id == null

    }


}
