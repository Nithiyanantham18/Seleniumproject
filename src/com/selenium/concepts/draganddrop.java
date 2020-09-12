package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	
	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
	
		WebElement amount1 = driver.findElement(By.xpath("//li[@id='fourth']"));
		WebElement amount2 = driver.findElement(By.xpath("//li[@id='fourth"));
		WebElement bank = driver.findElement(By.xpath("//li[@id='credit2']"));
		WebElement sales = driver.findElement(By.xpath("//li[@id='credit1']"));
		WebElement bankacc = driver.findElement(By.xpath("//ol[@id='bank']"));
		WebElement debitamnt = driver.findElement(By.xpath("//ol[@id='amt7']"));
		WebElement creditacc = driver.findElement(By.xpath("//ol[@id='loan']"));
		WebElement creditamnt = driver.findElement(By.xpath("//ol[@id='amt8']"));
		
		Actions ac = new Actions(driver);
		ac.dragAndDrop(bank, bankacc).perform();
		Thread.sleep(2000);
		ac.dragAndDrop(amount1, debitamnt).perform();
		Thread.sleep(2000);
		ac.dragAndDrop(sales, creditacc).perform();
		Thread.sleep(2000);
		ac.dragAndDrop(amount2, creditamnt).perform();
		Thread.sleep(2000);

}
}