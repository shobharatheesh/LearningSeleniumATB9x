package com.testingacademy.ex06_Webtables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeleniumProject11Task {

    @Test(groups ="QA")
    @Description("Automatate the webtable in the employee site https://awesomeqa.com/hr/web/index.php/pim/viewEmployeeList")

    public void Orangehrm() throws Exception{

        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        //<input class="oxd-input oxd-input--active" name="username" placeholder="Username" autofocus="" data-v-844e87dc="">

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("admin");

        //<input class="oxd-input oxd-input--active" type="password" name="password" placeholder="Password" data-v-844e87dc="">

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("Hacker@4321");

        //<button type="submit" class="oxd-button oxd-button--medium oxd-button--main orangehrm-login-button" data-v-7e88b27e="" data-v-30b9e6c4=""><!----> Login <!----></button>

        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();

        Thread.sleep(3000);

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        //page title ==> <h6 class="oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module" data-v-7588b244="" data-v-1c40f28d="">PIM</h6>

        WebElement pagetitle = driver.findElement(By.className("oxd-text--h6"));
        pagetitle.getText();
        System.out.println(pagetitle.getText());


        //print all the data elements in the table

        String first_part ="//div[@class=\"oxd-table-body\"]/div[";
        String second_part = "]/div[1]/div[";
        String third_part = "]";

        //row -- > //div[@class="oxd-table-card"]
        //col -->//div[@class="oxd-table-body"]/div[1]/div[1]/div[]

        int row = driver.findElements(By.xpath("//div[@class=\'oxd-table-card\']")).size();
        int col = driver.findElements(By.xpath("//div[@class=\'oxd-table-body\']/div[1]/div[1]/div")).size();

        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=col;j++)
            {
                String dynamic_path = first_part+i+second_part+j+third_part;
                //System.out.println(dynamic_path);

                String data = driver.findElement(By.xpath(dynamic_path)).getText();
                System.out.println(data);
            }
        }









    }
}
