package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class xpathcreation {
 
	private static WebDriver driver;
	
@Test
public void xpath() {
	driver.get("https://demo.guru99.com/test/newtours/");
	
//	locate username by creating baxic xpath
//	xpath=//input[@name='userName']//basic xpath
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Arjuna");
	//xpath using contains
	driver.findElement(By.xpath("//*[contains(@name,'pass')]")).sendKeys("partha");
	//xpath using or
	driver.findElement(By.xpath("//*[@type='submit'or name='submit1234']")).submit();
	//xpath using and
//	driver.findElement(By.xpath("//input[@type='submit'and @name='submit']")).submit();
}
	
	

	
	
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("open the browser");
			System.setProperty("webdriver.chrome.driver","D:/Testing/chromedriver.exe");
			driver = new ChromeDriver();

	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("close the browser");
	  }

	}