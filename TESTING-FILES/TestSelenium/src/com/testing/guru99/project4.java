package com.testing.guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class project4 {
	private static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		// set the path of the web driver
				System.setProperty("webdriver.chrome.driver","D:/Testing/chromedriver.exe");
				driver=new ChromeDriver();
				//open the webpage
				  driver.get("https://www.bigbasket.com/ ");
				  driver.findElement(By.xpath("//input[@id='input']")).sendKeys("Onions");
					 Thread.sleep(3000);
					
					  driver.findElement(By.xpath("//body/div[1]/div[1]/div[8]/div[1]/div[3]/div[1]/div[1]/button[1]/i[1]")).click();
				   	 System.out.println("Search");
	}

}
