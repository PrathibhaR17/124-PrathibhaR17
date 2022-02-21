package com.selenium.junitannotation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

class JunitTestcase1 {
	private static WebDriver driver;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		System.setProperty("webdriver.chrome.driver","D:/Testing/chromedriver.exe");
		driver = new ChromeDriver();
		
		// open the page
		driver.get("http://www.google.com");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		//close the browser
	
	driver.close();
			
	}

	@Test
	void test() {
//		fail("Not yet implemented");
		driver.get("http://www.google.com");
		String expectedvalue="Google";
		String actualvalue=driver.getTitle();
		Assert.assertEquals(expectedvalue, actualvalue);
		driver.findElement(By.name("q")).sendKeys("Selenium");		
	}

		
	}


	
