package com.selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


@Test
public class Script {
	private static WebDriver driver;
  public void Test1() {
	 	  driver.get("http://www.amazon.in");
  }
 
  public void Test3() {
	 	  driver.get("http://www.flipkart.com");
  }
  public void Test2() {
	 	  driver.get("http://www.opera.com");
	 	  
  }
	
  public void Test4() {
	// open the page
				driver.get("http://www.google.com");
	 
				String expectedtitle ="opera";
				String actualtitle = driver.getTitle();
				
				//assert equals
				Assert.assertEquals(expectedtitle, actualtitle);
	 
	  
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
