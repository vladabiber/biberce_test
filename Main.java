package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        String URL ="http://biberce.rs/";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Roland\\OneDrive\\Desktop\\QA Automation\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get(URL);

        driver.findElement(By.xpath("//*[text()='kontakt']" )).click();
        driver.findElement(By.xpath("//a[contains(@href,'K')]/img")).click();
        Thread.sleep(6000);
        driver.close();
        //driver.findElement(By.xpath("//i[@class='x-icon-instagram']")).click();
        //driver.close();
        //driver.findElement(By.xpath("//i[@class='x-icon-facebook-square']")).click();
        //driver.close();
        //driver.findElement(By.xpath("//a[contains(@href,'#cenovnik')] ")).click();









    }
}
