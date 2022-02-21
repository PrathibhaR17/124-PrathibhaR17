package com.seleniumtestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


@Test(priority=3)
public class NewTestcase2{
	private static WebDriver driver;
	private String expectedtitle;
	private String actualtitle;
  public void Test1() {
	  System.out.println("Welcome to TestNG");
	  System.out.println("open the browser");
		System.setProperty("webdriver.chrome.driver","D:/Testing/chromedriver.exe");
		driver = new ChromeDriver();

	  driver.get("http://www.amazon.in");
  }
  @Test(priority=1)
  public void Test3 (){
	  System.out.println("open the browser");
		System.setProperty("webdriver.chrome.driver","D:/Testing/chromedriver.exe");
		driver = new ChromeDriver();

	 	  driver.get("http://www.flipkart.com");
  }
  @Test(priority=2)
  public void Test2() {
	  System.out.println("open the browser");
		System.setProperty("webdriver.chrome.driver","D:/Testing/chromedriver.exe");
		driver = new ChromeDriver();

	 	  driver.get("http://www.google.com");
	 	  
  }
  @Test(priority=4)
  public void Test4() {
	// open the page
	  System.out.println("open the browser");
		System.setProperty("webdriver.chrome.driver","D:/Testing/chromedriver.exe");
		driver = new ChromeDriver();

				driver.get("http://www.google.com");
	  expectedtitle = "Google";
		actualtitle = driver.getTitle();

		//assert equals
	Assert.assertEquals(expectedtitle, actualtitle);
		
  }
  @BeforeClass
  public void beforeClass() {
//	  System.out.println("connect DB");
  }

  @AfterClass
  public void afterClass() {
//	  System.out.println("Disconnect DB");
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
