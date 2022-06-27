package com.testdemo.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\eclipse_workspace\\Maven_Test_Project\\Drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifier id")).sendKeys("nawodanilu@gmail.com");
		driver.findElement(By.className("Cwak9")).click();
		String at = driver.getTitle();
		String et = "gmail";
		driver.close();
		
		if(at.equalsIgnoreCase(et))
		{
			System.out.print("Test Successful");
		}
		
	
	
		
		
		
		

		
		
		
		
		
		
		
	}

}
