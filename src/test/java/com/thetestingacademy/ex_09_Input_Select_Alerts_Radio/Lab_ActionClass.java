package com.thetestingacademy.ex_09_Input_Select_Alerts_Radio;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.security.Key;

import static com.thetestingacademy.ex_00_SeleniumTasks.WaitHelper.closeBrowser;

public class Lab_ActionClass {
    @Test
    public void test_actions(){
        //Key down means press the shift key and key up means release the key after typing done
        WebDriver driver=new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        WebElement firstName=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));

        Actions action=new Actions(driver);
        //perform is complsory(action will not perform without it) here and build is optional
        //perform is internally calling the build method
        action.keyDown(Keys.SHIFT).sendKeys(firstName,"the testing academy")
                .keyUp(Keys.SHIFT).build().perform();

        //closeBrowser(driver);
    }
}
