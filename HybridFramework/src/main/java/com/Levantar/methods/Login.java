package com.Levantar.methods;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Levantar.generic.Elements;

public class Login extends Elements {
	
	@Test(priority = 1)
	public void loginPAgetest()
	{
	
		
		ComMethods.enterData(driver, "username", "admin");
		ComMethods.enterData(driver, "password", "manager");
		ComMethods.clickOnWebElement(driver, "login");
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("actiTIME"));
		String actual = driver.getTitle();
		
		String expected="actiTIME - Enter Time-Track";
		Assert.assertEquals(actual, expected);
		System.out.println(expected);
		
		
	}
	
	
	

}

