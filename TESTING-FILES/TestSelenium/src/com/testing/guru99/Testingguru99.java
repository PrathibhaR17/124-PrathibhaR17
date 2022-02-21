package com.testing.guru99;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testingguru99 {
	// driver initialization
		private static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		// set the path of the web driver
				System.setProperty("webdriver.chrome.driver","D:/Testing/chromedriver.exe");
				driver=new ChromeDriver();
				//open the webpage
				driver.get("https://demo.guru99.com/test/newtours/register.php");
				driver.manage().window().maximize();
				//Thread.sleep(3000);
				driver.findElement(By.name("firstName")).sendKeys("Arjun");
				driver.findElement(By.name("lastName")).sendKeys("Partha");
				driver.findElement(By.name("phone")).sendKeys("9876543210");
				driver.findElement(By.id("userName")).sendKeys("arjun#5partha@gmail.com");
				
				driver.findElement(By.name("address1")).sendKeys("Anekal");
				driver.findElement(By.name("city")).sendKeys("Banaglore");
				driver.findElement(By.name("state")).sendKeys("Karnataka");
				driver.findElement(By.name("postalCode")).sendKeys("562106");
			
				
		
				
				driver.findElement(By.id("email")).sendKeys("arjun#5partha@gmail.com");
				driver.findElement(By.name("password")).sendKeys("partha17");
				driver.findElement(By.name("confirmPassword")).sendKeys("partha17");
				driver.findElement(By.name("submit")).submit();
				
				
				
	}

}
