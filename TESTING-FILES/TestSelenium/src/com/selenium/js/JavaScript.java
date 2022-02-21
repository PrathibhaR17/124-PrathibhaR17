package com.selenium.js;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
public class JavaScript {
	
		
		private static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "D:/Testing/Newversion/chromedriver.exe");
//		driver = new ChromeDriver();
		System.setProperty("webdriver.edge.driver","D:/Testing/msedgedriver.exe");
		driver = new EdgeDriver();
		
		// create javascript executor interface
				JavascriptExecutor js =(JavascriptExecutor)driver;
				
				// launch the site
				driver.get("https://demo.guru99.com/test/newtours/");
				
				
				// save the submit button as a web element
				WebElement button = driver.findElement(By.name("submit"));
				
//	Implicit wait method	 applicable for driver level or all statement
				driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
				
				
				driver.findElement(By.name("userName")).sendKeys("admin");
//		adding sleep method
				Thread.sleep(5000);
				
				driver.findElement(By.name("password")).sendKeys("admin");
				
//adding explicit wait statement
				WebDriverWait wait =new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(("submit"))));
				
				// click on submit button using java script executor
				js.executeScript("arguments[0].click();", button);
					
				
				// display alert message using java script executor
				js.executeScript("alert('Login Successful');");
				
				Thread.sleep(2000);
				
//				handle the alert using accept()
				driver.switchTo().alert().accept();
				
//				getTEXT()method
				String alertmessage =driver.switchTo().alert().getText();
				
//				print the alert message in the console
				System.out.println("" + alertmessage);
//				String txt = driver.switchTo().alert().getText();
//				System.out.println("The Alert text is" + txt);
				Thread.sleep(2000);
				

			
		}
		}

