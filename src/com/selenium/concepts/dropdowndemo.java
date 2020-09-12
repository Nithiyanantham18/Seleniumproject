 package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowndemo {
	public static void chromelaunch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	WebElement day = driver.findElement(By.id("day"));
	Select d = new Select(day);
	d.selectByIndex(9);
	Thread.sleep(2000);
	
	WebElement month = driver.findElement(By.id("month"));
	Select m = new Select(month);
	m.selectByValue("9");
	Thread.sleep(2000);
	
	WebElement year = driver.findElement(By.id("year"));
	Select y = new Select(year);
	y.selectByVisibleText("1997");
			
	
	
	
	
	
	
	
	
	


}
}