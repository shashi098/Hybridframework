package com.Levantar.methods;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Levantar.generic.Elements;

public class SelectClassMethods extends Elements {
	
	public void selectbyIndex(WebDriver driver,String object,int index)
	{
		WebElement element = ComMethods.webEle(driver, object);
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	
	public void selectbyValue(WebDriver driver,String object,String value)
	{
		WebElement element = ComMethods.webEle(driver, object);
		Select s=new Select(element);
		s.selectByValue(value);
	}
	
	public void selectbyVisibleText(WebDriver driver,String object,String value)
	{
		WebElement element = ComMethods.webEle(driver,object);
		Select s=new Select(element);
		s.selectByVisibleText(value);
	}
	
	public void deslectbyIndex(WebDriver driver,String object,int index)
	{
		WebElement element = ComMethods.webEle( driver,object);
		Select s=new Select(element);
		s.deselectByIndex(index);
	}
	
	public void deselectbyValue(WebDriver driver,String object,String value)
	{
		WebElement element = ComMethods.webEle(driver, object);
		Select s=new Select(element);
		s.deselectByValue(value);
	}
	
	public void deselectbyVisibleText(WebDriver driver,String object,String value)
	{
		WebElement element = ComMethods.webEle(driver, object);
		Select s=new Select(element);
		s.deselectByVisibleText(value);
	}
	
	public void deselectall(WebDriver driver,String object)
	{
		WebElement element = ComMethods.webEle(driver,object);
		Select s=new Select(element);
		s.deselectAll();
	}
	
	public  ArrayList<String> getallSelectedoption(WebDriver driver,String object)
	{
		WebElement element = ComMethods.webEle(driver,object);
		Select s=new Select(element);
		List<WebElement> as = s.getAllSelectedOptions();
		
		ArrayList<String> ls = new ArrayList<String>();
		for(int i=0;i<as.size();i++)
		{
			String str = ls.get(i).toString();
			ls.add(str);
		}
		return ls;
	}
	
	public ArrayList<String> getoption(WebDriver driver,String object)
	{
		WebElement element = ComMethods.webEle(driver, object);
		Select s=new Select(element);
		List<WebElement> option = s.getOptions();
		ArrayList<String> ls = new ArrayList<String>();
		for(int i=0;i<option.size();i++)
		{
			String str = ls.get(i).toString();
			ls.add(str);
		}
		
		
		return ls;
		
	}
	
	public String getwrappedElememt(WebDriver driver,String object)
	{
		WebElement element = ComMethods.webEle(driver,object);
		Select s=new Select(element);
		
		WebElement ele = s.getWrappedElement();
		
		return ele.getText();
	}
	
	
	public String getfirstOption(WebDriver driver,String object)
	{
		WebElement element = ComMethods.webEle(driver,object);
		Select s=new Select(element);
		
		WebElement opt = s.getFirstSelectedOption();
		return opt.getText();
		
	}
	
	public boolean ismultiple(WebDriver driver,String object)
	{
		WebElement element = ComMethods.webEle(driver,object);
		Select s=new Select(element);
		s.isMultiple();
		
		return s.isMultiple();
		
	}

}
