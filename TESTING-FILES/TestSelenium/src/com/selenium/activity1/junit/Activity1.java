package com.selenium.activity1.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;
class Activity1 {
private static WebDriver driver;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		System.setProperty("webdriver.chrome.driver","D:/Testing/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://webapps.tekstac.com/InvoiceUpdates/");
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void test() throws InterruptedException {
//		fail("Not yet implemented");
		driver.get("http://webapps.tekstac.com/InvoiceUpdates/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("name")).sendKeys("Rakesh");
		driver.findElement(By.id("number")).sendKeys("123");
		driver.findElement(By.id("oldUser")).sendKeys("123");
		
		//checkbox
		
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='oldUser']"));
		checkbox.click();
		
		//radio button
		
		
		WebElement radiobutton = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[2]"));
		radiobutton.click();
		
		//drop down
		
		
		WebElement invoicedropdown = driver.findElement(By.xpath("//tbody//tr//td//select"));
		
		//for selecting the dropdown value
		Select dropdown = new Select(invoicedropdown);
		dropdown.selectByValue("utility invoice");
		//amount
		driver.findElement(By.name("amount")).sendKeys("3000");
		
		//mobile number
		
		
		driver.findElement(By.name("num")).sendKeys("987654321");
		driver.findElement(By.name("comments")).sendKeys("New user");
		
	}

}
