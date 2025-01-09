package com.testingacademy.ex08_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumElementClickInterceptedException {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice");

        //implicit wait

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement username = driver.findElement(By.id("inputUsername"));
        username.sendKeys("Shobha");

        WebElement password = driver.findElement(By.name("inputPassword"));
        password.sendKeys("admin");

        WebElement signup = driver.findElement(By.className("signInBtn"));
        signup.click();

        //Explicit wait

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("error")));


        //WebElement errormessage = driver.findElement(By.cssSelector("p.error"));
        WebElement errormessage = driver.findElement(By.className("error"));
        System.out.println(errormessage.getText());

        WebElement forgot_pass = driver.findElement(By.linkText("Forgot your password?"));
        forgot_pass.click();

        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(60));
        wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@placeholder='Name']")));

        WebElement Name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
        Name.sendKeys("John");

        WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        email.sendKeys("john@rsa.com");

        WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(60));
        wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@placeholder='Email']")));
        email.clear();

        //WebDriverWait wait3 = new WebDriverWait(driver,Duration.ofSeconds(60));
        //wait3.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@type='text'][2]")));

        driver.findElement(By.xpath("//input[@type='text'][2]"));
        email.sendKeys("john@gmail.com");

        WebElement phone_num = driver.findElement(By.xpath("//form/input[3]"));
        phone_num.sendKeys("98765432");

        WebElement reset_login = driver.findElement(By.xpath("//button[@class='reset-pwd-btn']"));
        reset_login.click();

        Thread.sleep(3000);

        //WebElement reset_login = driver.findElement(By.cssSelector(".reset-pwd-btn"));
        //reset_login.click();

        WebElement error_message = driver.findElement(By.xpath("//p[@class='infoMsg']"));
        System.out.println(error_message.getText());


        WebElement go_to_login = driver.findElement(By.xpath("//button[@class='go-to-login-btn']"));
        go_to_login.click();

       //When page is getting transition to another page after the click , then if wait is not applied ,
        // we get this ElementClickInterceptedException , so add the explicit wait or thread.sleep
        //Thread.sleep(3000);


        WebElement username1 = driver.findElement(By.id("inputUsername"));
        username1.sendKeys("Shobha");

        WebElement password1 = driver.findElement(By.name("inputPassword"));
        password1.sendKeys("rahulshettyacademy");

        WebElement check_box = driver.findElement(By.xpath("//input[@id='chkboxOne']"));
        check_box.click();

        WebElement agree_condition = driver.findElement(By.xpath("//input[@id='chkboxTwo']"));
        agree_condition.click();

        WebElement signup1 = driver.findElement(By.className("signInBtn"));
        signup1.click();



        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.quit();



















    }

}


