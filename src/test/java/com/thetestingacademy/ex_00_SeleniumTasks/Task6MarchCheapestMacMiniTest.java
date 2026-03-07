package com.thetestingacademy.ex_00_SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Task6MarchCheapestMacMiniTest {

    @Test
    public void printCheapestPrice() throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/search?q=Mac%20Mini&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");

        Thread.sleep(5000);

        List<WebElement> svgElements = driver.findElements(By.xpath("//*[local-name()='svg']"));
        svgElements.get(0).click();


        List<WebElement> prices = driver.findElements(By.xpath("//div[@class='hZ3P6w']"));


        int minPrice = Integer.MAX_VALUE;


        for (WebElement priceElement : prices) {

            try {
                String priceText = priceElement.getText();

                priceText = priceText.replace("₹","").replace(",","");
                int price = Integer.parseInt(priceText);

                if(price < minPrice){
                    minPrice = price;
                }

            } catch (Exception e) {
                // ignore non-price text
            }
        }

        System.out.println("Cheapest Price: ₹" + minPrice);

        //driver.quit();
    }
}
