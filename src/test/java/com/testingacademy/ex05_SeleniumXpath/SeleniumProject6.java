package com.testingacademy.ex05_SeleniumXpath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumProject6 {

    @Description("Verify that the free trial message is visible")
    @Test
    public void drive360() throws Exception {



        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.idrive360.com/enterprise/login");
        Thread.sleep(2000);


        //Find the Username and then enter the email id

       //<input
        // _ngcontent-qnl-c4=""
        // autofocus=""
        // class="id-form-ctrl ng-pristine ng-valid ng-touched"
        // id="username"
        // name="username"
        // type="email">


        WebElement email = driver.findElement(By.id("username"));
        email.sendKeys("augtest_040823@idrive.com");
        Thread.sleep(2000);



        //Find the Password and then enter the password

        //<input _ngcontent-qnl-c4=""
        // class="id-form-ctrl ng-pristine ng-valid ng-touched"
        // id="password"
        // maxlength="20"
        // name="password"
        // tabindex="0"
        // type="password">

        //WebElement password = driver.findElement(By.id("password"));
        //password.sendKeys("123456");


       WebElement password = driver.findElement(By.name("password"));
       password.sendKeys("123456");
       Thread.sleep(2000);

        //Click on sign in button
       //<button _ngcontent-qnl-c4=""
        // class="id-btn id-info-btn-frm"
        // id="frm-btn"
        // type="submit">
        // Sign in
        // </button>

        WebElement login = driver.findElement(By.xpath("//button[@id='frm-btn']"));
        login.click();
        Thread.sleep(20000);

        //Verify that the free trial message is visible.

        //<h5 _ngcontent-gaa-c10=""
        // class="id-card-title">
        // Your free trial has expired
        // </h5>

        WebElement free_trial = driver.findElement(By.className("id-card-title"));
        free_trial.getText();
        System.out.println("The title is: "+free_trial.getText());

       Assert.assertEquals(driver.getCurrentUrl(),"https://www.idrive360.com/enterprise/account?upgradenow=true");
       System.out.println("Current URL is :"+driver.getCurrentUrl());

      if(free_trial.getText().contains("Your free trial has expired"))
      {
          System.out.println("Your free trial has expired is visible");
          Assert.assertTrue(true);
      }
      else{

          System.out.println("Your free trial has expired is not visible");
      }


      Thread.sleep(5000);
      driver.quit(); // It will close all the tabs. - session id == null

    }


}
