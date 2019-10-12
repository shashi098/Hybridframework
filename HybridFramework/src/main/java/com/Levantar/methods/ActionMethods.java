package com.Levantar.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Levantar.generic.Elements;

public class ActionMethods extends Elements{
	
	
	
	public  void mouseHover(WebDriver driver,String object)
	{
		WebElement webElement = ComMethods.webEle(driver,object);
		Actions ac=new Actions(driver);
		ac.moveToElement(webElement).perform();
		
	}
	

	public void dragAndDrop(WebDriver driver,String object1,String object2)
	{
		WebElement webElement1 = ComMethods.webEle(driver,object1);
		WebElement webElement2 = ComMethods.webEle(driver,object2);
		
		Actions ac=new Actions(driver);
		ac.dragAndDrop(webElement1,webElement2).perform();
		
	}
	public void rightClick(WebDriver driver,String object)
	{
		WebElement webElement = ComMethods.webEle(driver,object);
		Actions ac=new Actions(driver);
		ac.contextClick(webElement).perform();
		
	}
	
	public void doubleClick(WebDriver driver,String object)
	{
		WebElement webElement = ComMethods.webEle(driver,object);
		Actions ac=new Actions(driver);
		ac.doubleClick(webElement).perform();
		
	}
	
	
}
