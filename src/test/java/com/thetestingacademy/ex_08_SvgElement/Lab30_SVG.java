package com.thetestingacademy.ex_08_SvgElement;

import com.thetestingacademy.ex_00_SeleniumTasks.WaitHelper;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

import static com.thetestingacademy.ex_00_SeleniumTasks.WaitHelper.closeBrowser;

public class Lab30_SVG {
    ChromeDriver driver;
    @Description("vrify that on serach with svg icon results are visible")
    @Test
    public void test_flipkart_search_SVG_icon(){
        driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/search");
        WebElement search_input= driver.findElement(By.name("q"));
        search_input.sendKeys("macmini");

        List<WebElement>svgElements=driver.findElements(By.xpath("//*[local-name()='svg']"));
        svgElements.get(0).click();
        WaitHelper.waitJVM(5000);
        //WaitHelper.closeBrowser(driver);

List<WebElement>titleResult=driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]"));
for (WebElement title:titleResult){
    System.out.println(title);
}

    }
}
