package com.selenium.activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity1 {
	private static WebDriver driver;
 
  @Test(dataProvider = "dp")
  public void Testcase(String emailid, String pwd) {
	  
//	  launch web site
	  driver.get("http://practice.automationtesting.in/my-account/");
//	  driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
	  driver.findElement(By.xpath("//h2[contains(text(),'Register')]"));
	  driver.findElement(By.name("email")).sendKeys(emailid);
	  WebElement txt1  = driver.findElement(By.xpath("//input[@id='reg_password']"));
		txt1.sendKeys("pwd");

	  driver.findElement(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-36']/div[1]/div[1]/div[1]/div[1]/form[1]/p[3]/input[3]"));
 System.out.println("User Registered");
  }

@DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Krishna@gmail.com", "Mk#17hg@" },
    
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

  
  

