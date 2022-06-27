package com.testdemo.testCases;


import org.junit.Assert;
import org.testng.annotations.Test;
import com.testdemo.pageObject.LoginPage;

public class TC_Logintest_001 extends BaseClass
{
	
	
	public void loginTest()
	{
		
		driver.get("baseURL");
		
			
		LoginPage lp=new LoginPage (driver);
		lp.setUserName(username);
		lp.setPssword("password");		
		
		lp.clickSubmit();
		
		 
		if(driver.getTitle().equals("Guru 99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			     		
		}
		else
		{
			Assert.assertTrue(false);
			
		}
			
	
			
					
	}
	
	

}
