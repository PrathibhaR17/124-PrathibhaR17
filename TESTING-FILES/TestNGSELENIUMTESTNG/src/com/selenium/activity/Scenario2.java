package com.selenium.activity;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;


public class Scenario2 {
	
	private static WebDriver driver;
	
	
	  @Test
	  public void Testcase() {
		  
//		  launch web site
		  driver.navigate().to("https://www.facebook.com/");
	
		  WebElement btnclick = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/a[1]"));
			btnclick.click();

//			driver.findElement(By.xpath("//body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		WebElement txt1  = driver.findElement(By.xpath("//input[@id='u_q_b_95']"));
			txt1.sendKeys("Mithali");
						driver.findElement(By.name("lastname")).sendKeys("Partha");
			driver.findElement(By.name("reg_email__")).sendKeys("adcd@gmail.com");
			driver.findElement(By.id("password")).sendKeys("pass123");
			
		 
			WebElement day = driver.findElement(By.name("birthday_day"));
			Select dropdown = new Select(day);
			
			WebElement month = driver.findElement(By.name("birthday_month"));
			Select dropdown1 = new Select(month);
			WebElement year = driver.findElement(By.name("birthday_year"));
			Select dropdown2 = new Select(year);
			WebElement radiobutton = driver.findElement(By.xpath("//input[@id='u_6_2_WF']"));
			radiobutton.click();
			
			  driver.findElement(By.name("websubmit")).submit();
			
//		
			
		  
		  
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
