package com.thetestingacademy.ex_09_Input_Select_Alerts_Radio;

import com.thetestingacademy.ex_00_SeleniumTasks.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestSelenium_SelectClass extends CommonToAll {
    @Test
    @Description("This is description")
    public void test_HTMLTags() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        Thread.sleep(5000);
        WebElement selectCountry=driver.findElement(By.id("dropdown"));
        Select select=new Select(selectCountry);
        //select.selectByVisibleText("Option 2");
        //select.selectByIndex(2);
        select.selectByValue("1");



    }
}
