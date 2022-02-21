package com.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragandDrop {
	private static WebDriver driver;
  @Test
  public void Test1() {
//	  launch website
	  driver.get("http://demo.automationtesting.in/Static.html");
	  
//	  drag function 
	  WebElement from =driver.findElement(By.xpath("//img[@id='angular']"));
	  
//  object dropped
			  WebElement to =driver.findElement(By.xpath("//div[@id='droparea']"));	 
			  
// create an object of action class
			  Actions act = new Actions(driver);
			  
//			  perform the drag and drop
			  act.dragAndDrop(from, to).build().perform();
			
			  System.out.println("Drag & Drop done");
  
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
