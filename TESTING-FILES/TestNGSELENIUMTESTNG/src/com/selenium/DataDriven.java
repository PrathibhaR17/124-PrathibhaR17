package com.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DataDriven {
	private static WebDriver driver;
	
	
  @Test(dataProvider = "dp")
  public void Testcase(String user, String pwd) {
	  
//	  launch web site
	  driver.get(" https://demo.guru99.com/test/newtours/");
	  
	  driver.findElement(By.name("userName")).sendKeys(user);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.name("submit")).submit();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Krishna", "Madava" },
      new Object[] { "Arjuna", "Partha" },
      new Object[] { "Radhe", "Radhe" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:/Testing/chromedriver.exe");
		driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
