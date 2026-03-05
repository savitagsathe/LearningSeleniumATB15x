package com.thetestingacademy.ex_00_SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task2March_Webtable {
    @Test
    public void testOrangHrmWebTable() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement user_name=driver.findElement(By.name("username"));
        user_name.sendKeys("admin");

        WebElement pass=driver.findElement(By.name("password"));
        pass.sendKeys("Hacker@4321");

        WebElement loginButton=driver.findElement(By.xpath("//button"));
        loginButton .click();

        Thread.sleep(2000);
        WebElement deleteBtn = driver.findElement(
                By.xpath("(//div[@role='row'][.//div[text()='Terminated']]//button)[1]")
        );

        deleteBtn.click();
        //driver.quit();





    }
}
