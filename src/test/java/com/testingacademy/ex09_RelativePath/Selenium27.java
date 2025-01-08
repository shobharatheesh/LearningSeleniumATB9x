package com.testingacademy.ex09_RelativePath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium27 {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);
    }

    @Description("Verify RL")
    @Test

    public void relative_path() throws Exception{

        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement experience = driver.findElement(By.xpath("//span[normalize-space()='Years of Experience']"));

        driver.findElement(By.xpath("//input[@id='exp-1']")).click();




    }








public void closeBrowser(){
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    driver.quit();

}




}
