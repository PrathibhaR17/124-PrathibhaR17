package com.selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testingdropdown {

	private static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:/Testing/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		
		// identify the dropdown and save as a web element
		WebElement citydropdown = driver.findElement(By.name("fromPort"));
		Select dropdown = new Select(citydropdown);
		
		
//		 select the city from the dropdown
		dropdown.selectByIndex(4);
		
		
//		dropdown.selectByValue("Frankfurt");
		
//		dropdown.selectByVisibleText(text);
		
		
		
		
	}

}



