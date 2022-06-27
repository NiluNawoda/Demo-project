package com.testdemo.testCases;

import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseURL="https://demo.guru99.com/V4/";
	public String username="mngr403610";
	public String password="rYbYher";
    public static WebDriver driver;
	
    public static Logger logger;
    
    
	@BeforeClass 
	public void setUp()
	{
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://demo.guru99.com/V4/");
	  driver.manage().window().maximize();
	 }
		
	@AfterClass
	public void tearDown()
	{
	  driver.quit();
	}
	
	
}	
	
	
	


