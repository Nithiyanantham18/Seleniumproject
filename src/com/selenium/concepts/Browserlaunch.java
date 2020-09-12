 package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browserlaunch {
	public static void chromelaunch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url is"+currentUrl);
		String title = driver.getTitle();
		System.out.println("the title is"+title);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		//driver.navigate().back();
		Thread.sleep(2000);
		//driver.navigate().forward();
     	Thread.sleep(2000);
		//driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("nithicse033@gmail.com");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Nithi@0917");
		Thread.sleep(2000);
		WebElement loginbutton = driver.findElement(By.id("u_0_b"));
		loginbutton.click();
		Thread.sleep(2000);

		
		
		
	

		

	}
	private static void ielaunch() {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\HP\\workspace\\SeleniumProject\\Driver\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.amazon.in/");
	}
	

	public static void main(String[] args) throws InterruptedException {
		chromelaunch();
		//ielaunch();
		
	}

}
