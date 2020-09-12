package com.selenium.concepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertdemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();

		WebElement simple = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		simple.click();
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
         button.click();
		Thread.sleep(2000);
		Alert salert = driver.switchTo().alert();
		salert.accept();
		Thread.sleep(2000);
		
		WebElement cnfrm = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		cnfrm.click();
		Thread.sleep(2000);
		WebElement button1= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		button1.click();
		Alert calert = driver.switchTo().alert();
		calert.dismiss();
		Thread.sleep(2000);
		
		WebElement prompt = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		prompt.click();
		Thread.sleep(2000);
		WebElement button2= driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		button2.click();
		Thread.sleep(2000);
		Alert palert = driver.switchTo().alert();
		palert.sendKeys("Nithi");
		Thread.sleep(2000);
        palert.accept(); 
		
		
		
		
	}

}
