package com.testingacademy.ex06_Webtables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeleniumProject10 {

    @Test(groups = "QA")
    @Description("Test case Description")

    public void test_webtables_login() throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");
        driver.manage().window().maximize();

        //table[@summary='Sample Table']/tbody/tr[1]/td[1]

        String first_part =" //table[@summary='Sample Table']/tbody/tr[";
        String second_part="]/td[";
        String third_part ="]";


        //WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));

        int row = driver.findElements(By.xpath("//table[@summary=\"Sample Table\"]/tbody/tr")).size();
        int col= driver.findElements(By.xpath("//table[@summary=\"Sample Table\"]/tbody/tr[1]/td")).size();

        System.out.println("number of rows:"+row);
        System.out.println("number of columns:"+col);

        //List<WebElement> rows = table.findElements(By.tagName("tr"));

        for(int i = 1;i<=row;i++)    //for rows
        {
            for(int j=1;j<=col;j++)    //for columns
            {

                String dynamic_path = first_part+i+second_part+j+third_part;
                //System.out.println(dynamic_path);

                String data = driver.findElement(By.xpath(dynamic_path)).getText();
                System.out.println(data);
            }
        }


    }
}
