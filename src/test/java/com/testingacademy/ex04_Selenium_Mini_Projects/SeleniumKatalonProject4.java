package com.testingacademy.ex04_Selenium_Mini_Projects;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumKatalonProject4 {

    @Description("Open the Katalon URL")
    @Test

    public void test__free_trial() throws Exception{

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        //find the make appoinment button and click on the button
        //<a
        // id="btn-make-appointment"
        // href="./profile.php#login"
        // class="btn btn-dark btn-lg">
        // Make Appointment
        // </a>

        WebElement make_appointment = driver.findElement(By.linkText("Make Appointment"));
        make_appointment.click();

        //Find the Username and then enter the email id

       // <input
        // type="text"
        // class="form-control"
        // id="txt-username"
        // name="username"
        // placeholder="Username"
        // value="" autocomplete="off">

        WebElement username = driver.findElement(By.id("txt-username"));
        username.sendKeys("John Doe");

        //Find the Password and then enter the password

        //<input type="password"
        // class="form-control"
        // id="txt-password"
        // name="password"
        // placeholder="Password"
        // value="" autocomplete="off">

        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");

        //Click on login button
        // <button
        // id="btn-login"
        // type="submit"
        // class="btn btn-default">
        // Login
        // </button>

        WebElement login = driver.findElement(By.id("btn-login"));
        login.click();

        //Verify the current URL is https://katalon-demo-cura.herokuapp.com/#appointment

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
        System.out.println("Current URL is :"+driver.getCurrentUrl());

        //or

        if(driver.getCurrentUrl().contains("https://katalon-demo-cura.herokuapp.com/#appointment"))
        {
            System.out.println("Make Appointment page is visible");
            Assert.assertTrue(true);
        }
        else
        {
            System.out.println("Make Appointment is not visible");
        }


        Thread.sleep(3000);
        driver.quit(); // It will close all the tabs. - session id == null

    }


}
