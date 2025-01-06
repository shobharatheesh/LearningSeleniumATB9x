package com.testingacademy.ex06_Webtables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeleniumProject9 {

    @Test(groups = "QA")
    @Description("Test case Description")

    public void test_webtables_login() throws Exception{

        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().window().maximize();

        //xpath
        //table[@id="customers"]/tbody/tr[5]/td[2]
        //first part -->//table[@id="customers"]/tbody/tr[
        //second part -->i
        //third part -->]/td[
        //fourth part---> j
        // fifth part---> ]

        ////table[@id="customers"]/tbody/tr[2]/td[2];

        String first_part =" //table[@id=\"customers\"]/tbody/tr[";
        String second_part="]/td[";
        String third_part ="]";



        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col= driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();

        System.out.println("number of rows:"+row);     //7
        System.out.println("number of columns:"+col);  //3

        for(int i = 2;i<=row;i++)    //for rows
        {
         for(int j=1;j<=col;j++)    //for columns
         {

             String dynamic_path = first_part+i+second_part+j+third_part;
             //System.out.println(dynamic_path);

             String data = driver.findElement(By.xpath(dynamic_path)).getText();
             //System.out.println(data);

             if(data.contains("Helen Bennett"))
             {
                 String country_path = dynamic_path+"/following-sibling::td";
                 String country_text = driver.findElement(By.xpath(country_path)).getText();
                 System.out.println("---------------");

                 System.out.println("Helen Bennett is in:" +country_text);



             }

         }
        }











    }

}
