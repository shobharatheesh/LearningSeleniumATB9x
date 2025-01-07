package com.testingacademy.ex07_ActionClass;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium18FileUpload {

    //makemytrip example

    ChromeDriver driver;

    @BeforeTest
    public void openBrowser(){

        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("---guest");
        driver = new ChromeDriver(chromeOptions);
    }


    @Description
    @Test
    public void test_actions() throws Exception{

        driver.get("https://app-automate.browserstack.com/dashboard/v2/getting-started");
        driver.manage().window().maximize();

        WebElement email = driver.findElement(By.id("user_email_login"));
        email.sendKeys("shobhaname13@gmail.com");

        WebElement pass = driver.findElement(By.id("user_password"));
        pass.sendKeys("Showmethename");

        WebElement login = driver.findElement(By.id("user_submit"));
        login.click();

        Thread.sleep(5000);









          }










   //@AfterTest
    //public void closeBrowser(){
    //    try {
       //     Thread.sleep(3000);
      //  } catch (InterruptedException e) {
         //   throw new RuntimeException(e);
       // }
      //  driver.quit();


    //}


}
