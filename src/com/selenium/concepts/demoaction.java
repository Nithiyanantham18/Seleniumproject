package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demoaction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
	
         WebElement name = driver.findElement(By.xpath("//input[@id='fname']"));
         name.sendKeys("Nithi");
         Thread.sleep(2000);
         
        WebElement b = driver.findElement(By.xpath("//button[@id='idOfButton']"));
        WebElement dbc = driver.findElement(By.xpath("//button[@id='dblClkBtn']"));

        Actions ac = new Actions(driver);
        ac.click(b).perform();
         Thread.sleep(2000);
        ac.doubleClick(dbc).perform();
         

	}

}
