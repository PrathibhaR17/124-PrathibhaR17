package com.selenium.assertion;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Assertions {
	private static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			System.setProperty("webdriver.chrome.driver","D:/Testing/chromedriver.exe");
			driver = new ChromeDriver();
			
			// open the page
			driver.get("http://www.google.com");
			
			String expectedtitle ="opera";
			String actualtitle = driver.getTitle();
			
			//assert equals
			Assert.assertEquals(expectedtitle, actualtitle);
			
			//assertnotequals
//			Assert.assertNotEquals(expectedtitle, actualtitle);
			

		
	    
	    		
//	    		// assert true
	    	WebElement element1 = driver.findElement(By.name("q"));
	    	Assert.assertTrue(element1.isDisplayed());
	    	Assert.assertTrue(element1.isEnabled());
//	    	Assert.assertTrue(element.isSelected());

		

	
}
}
