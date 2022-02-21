package com.selenium.activity;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Scenario1 {
	
	private static WebDriver navigate;

@Test
public static class TestCase1{
	private static WebDriver driver;
	private String expectedtitle;
	private String actualtitle;
	


  public void Test1() {
	// open the page
	  driver.navigate().to("https://qatechhub.com/");
//	  driver.manage().window().maximize();
	  expectedtitle = "QA Automation Tools Trainings and Tutorials | QA Tech Hub";
		actualtitle = "QA Automation Tools Trainings and Tutorials | QA Tech Hub";

		//assert equals
	Assert.assertEquals(expectedtitle, actualtitle);
  }
  public void Test2() {
 	  driver.navigate().to("https://www.facebook.com");
// 	 driver.manage().window().maximize();
}
public void Test3() {
 	  driver.navigate().to("https://qatechhub.com/");
// 	 driver.manage().window().maximize();
 	 System.out.println("URL=https://qatechhub.com/");
 	  
 	  
}
  

  @BeforeTest
  public void beforeTest() {
	  System.out.println("open the browser");
		System.setProperty("webdriver.chrome.driver","D:/Testing/Newversion/chromedriver.exe");
		driver = new ChromeDriver();

  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  System.out.println("close the browser");
  }

		  

}
}
