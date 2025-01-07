package com.testingacademy.ex07_ActionClass;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium16FileUpload {

    //makemytrip example

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("---guest");
        driver = new EdgeDriver(edgeOptions);
    }


    @Description
    @Test
    public void test_actions() throws Exception{

        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();

        WebElement file_upload = driver. findElement(By.id("file-upload"));

        String working_dir = System.getProperty("user.dir");
        System.out.println(working_dir);

        file_upload.sendKeys(working_dir + "/src/test/java/com/testingacademy/ex07_ActionClass/AdBlock.crx");
        driver.findElement(By.id("file-submit")).click();

        Thread.sleep(3000);

        WebElement text = driver.findElement(By.className("example"));
        text.getText();
        System.out.println(text.getText());

        if(text.getText().contains("File Uploaded!"))
        {
            System.out.println("Text is visible");
        }
        else
        {
            System.out.println("Text is not visible");
        }


    }










   @AfterTest
    public void closeBrowser(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();


    }


}
