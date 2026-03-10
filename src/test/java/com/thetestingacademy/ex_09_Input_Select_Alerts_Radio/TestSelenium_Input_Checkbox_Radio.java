package com.thetestingacademy.ex_09_Input_Select_Alerts_Radio;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium_Input_Checkbox_Radio {
    @Test
    @Description("radio,checkbox and textbox")
    public void test_HTMLTags() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        WebElement input_bos=driver.findElement(By.name("firstname"));
        input_bos.sendKeys("The testing academy");

        WebElement check_box= driver.findElement(By.id("profession-1"));
        check_box.click();

        WebElement radio_box= driver.findElement(By.id("exp-1"));
        check_box.click();


    }
}
