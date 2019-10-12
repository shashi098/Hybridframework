package com.Levantar.methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Levantar.generic.Elements;
import com.Levantar.generic.Fluctuating;

public class ComMethods extends Elements{
	
	
	public static WebElement webEle(WebDriver driver, String object)
	{
		
	
		By by = null;
		
		String[] locator = Fluctuating.locatorsvalue.getProperty(object).split("-");
		
		if(locator[0].equalsIgnoreCase("id"))
		{
		 by=By.id(locator[1]);
		}
		else if (locator[0].equalsIgnoreCase("name")) 
		{
			by=By.name(locator[1]);
		}
		else if (locator[0].equalsIgnoreCase("tagName")) 
		{
			by=By.tagName(locator[1]);
		}
		else if (locator[0].equalsIgnoreCase("className")) 
		{
			by=By.className(locator[1]);
		}
		else if (locator[0].equalsIgnoreCase("linkText")) 
		{
			by=By.linkText(locator[1]);
		}
		else if (locator[0].equalsIgnoreCase("partialLinkText")) 
		{
			by=By.partialLinkText(locator[1]);
		}
		else if (locator[0].equalsIgnoreCase("cssSelector")) 
		{
			by=By.cssSelector(locator[1]);
		}
		else if (locator[0].equalsIgnoreCase("xpath")) 
		{
			by=By.xpath(locator[1]);
		}
		
		return driver.findElement(by);
		
	}
	
	
	
	
	public static List<WebElement> listWeb(WebDriver driver,String object)
    {
		Fluctuating f=new Fluctuating();
		
		By by = null;
		
		String[] locator = Fluctuating.locatorsvalue.getProperty(object).split("-");
		
		if(locator[0].equalsIgnoreCase("id"))
		{
		 by=By.id(locator[1]);
		}
		else if (locator[0].equalsIgnoreCase("name")) 
		{
			by=By.name(locator[1]);
		}
		else if (locator[0].equalsIgnoreCase("tagName")) 
		{
			by=By.tagName(locator[1]);
		}
		else if (locator[0].equalsIgnoreCase("className")) 
		{
			by=By.className(locator[1]);
		}
		else if (locator[0].equalsIgnoreCase("linkText")) 
		{
			by=By.linkText(locator[1]);
		}
		else if (locator[0].equalsIgnoreCase("partialLinkText")) 
		{
			by=By.partialLinkText(locator[1]);
		}
		else if (locator[0].equalsIgnoreCase("cssSelector")) 
		{
			by=By.cssSelector(locator[1]);
		}
		else if (locator[0].equalsIgnoreCase("xpath")) 
		{
			By.xpath(locator[0]+locator[1]);
		}
		return driver.findElements(by);
		
	}
	
	public static void enterData(WebDriver driver,String object,String data)
	{

		//WebDriverWait wait=new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.);
		webEle(driver,object).sendKeys(data);
	}
	
	public static void clickOnWebElement(WebDriver driver,String object)
	{
	
		WebElement element = webEle(driver,object);
		WebDriverWait wait=new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.);
		element.click();
	}
	
	public static boolean elementDisplayed(WebDriver driver,String object)
	{
	
		WebElement element = webEle(driver,object);
		WebDriverWait wait=new WebDriverWait(driver,10);
	
	    boolean dis = element.isDisplayed();
		return dis;
	}
	
	public static void clearAndEnterData(WebDriver driver,String object,String data)
	{
		
		webEle(driver,object).clear();
		webEle(driver,object).sendKeys(data);
	}
	
	
	
	public static void elementIsClickable(WebDriver driver,String object)
	{
		
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		try
		{
		wait.until(ExpectedConditions.elementToBeClickable(webEle(driver,object)));
		System.out.println("element can be clickable");
		}
		
		catch(Exception e)
		{
			System.out.println("element is not clickable");
		}
	}
	
	

}
