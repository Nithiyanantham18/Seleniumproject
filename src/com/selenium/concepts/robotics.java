package com.selenium.concepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robotics {
		public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\workspace\\SeleniumProject\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
			WebElement bestsellers = driver.findElement(By.xpath("(//a[contains(@class ,'nav-a  ')])[1]"));
			Actions ac = new Actions(driver);
			ac.contextClick(bestsellers).perform();
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			
			WebElement mobiles = driver.findElement(By.xpath("(//a[contains(@class,'nav-a  ')])[2]"));
			ac.contextClick(mobiles).perform();r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			
			WebElement amazonpay = driver.findElement(By.xpath("(//a[contains(@class,'nav-a  ')])[3]"));
			ac.contextClick(amazonpay).perform();r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			
			
			WebElement pantry = driver.findElement(By.xpath("(//a[contains(@class,'nav-a  ')])[4]"));
			ac.contextClick(pantry).perform();r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			
			WebElement newreleases = driver.findElement(By.xpath("(//a[contains(@class,'nav-a  ')])[5]"));

			ac.contextClick(newreleases).perform();r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			
			WebElement signin = driver.findElement(By.xpath("(//span[(@class ='nav-line-1')])[2]"));
			ac.contextClick(signin).perform();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			
			
			//WINDOW HANDLE AND WINDOW HANDLES
			String pid = driver.getWindowHandle();
			System.out.println(pid);
			
			Set<String> allid = driver.getWindowHandles();
			System.out.println(allid);
			for (String id : allid) {
				driver.switchTo().window(id);
				System.out.println(driver.getTitle());
			}
			
			String actualtittle="Amazon Sign In";
			for (String id : allid) {
				if(driver.switchTo().window(id).getTitle().equals(actualtittle))	
					{
					break;
						}
			}}}
				
				
			
			
			

	


