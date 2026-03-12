package com.thetestingacademy.ex_00_SeleniumTasks;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.qameta.allure.Description;

import static com.thetestingacademy.ex_00_SeleniumTasks.WaitHelper.closeBrowser;
import static com.thetestingacademy.ex_00_SeleniumTasks.WaitHelper.waitJVM;


public class Task9Mar_DynamicDropDown {
    @Test
    @Description("Dynamic dropdown using Booking.com")
    public void testDynamicDropDown(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.booking.com/");
        driver.manage().window().maximize();
        waitJVM(8);

        WebElement modalPopUp=driver.findElement(By.xpath("//button[@aria-label=\"Dismiss sign-in info.\"]"));
        modalPopUp.click();

        WebElement flightsLink=driver.findElement(By.xpath("//a[@id=\"flights\"]"));
        flightsLink.click();

        WebElement goingTo=driver.findElement(By.xpath("(//span[text()=\"Going to\"])[1]"));
        goingTo.click();
        waitJVM(6);

        WebElement selectCity= driver.findElement(By.xpath("//input[@data-ui-name=\"input_text_autocomplete\"]"));
        selectCity.sendKeys("DEL");
        waitJVM(6);
        selectCity.sendKeys(Keys.TAB);
        selectCity.sendKeys(Keys.ENTER);

        WebElement search= driver.findElement(By.xpath("//button[@data-ui-name=\"button_search_submit\"]"));
        search.click();

        //closeBrowser(driver);

    }
}
