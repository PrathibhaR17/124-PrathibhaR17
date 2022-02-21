package com.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


@Test
public class TestCase1{
	private static WebDriver driver;
	private String expectedtitle;
	private String actualtitle;
  public void Test1() {
	  System.out.println("Welcome to TestNG");
	  driver.get("http://www.amazon.in");
  }
 
  public void Test3() {
	 	  driver.get("http://www.flipkart.com");
  }
  public void Test2() {
	 	  driver.get("http://www.google.com");
	 	  
  }
  public void Test4() {
	// open the page
				driver.get("http://www.google.com");
	  expectedtitle = "Google";
		actualtitle = driver.getTitle();

		//assert equals
	Assert.assertEquals(expectedtitle, actualtitle);
		
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("connect DB");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Disconnect DB");
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
