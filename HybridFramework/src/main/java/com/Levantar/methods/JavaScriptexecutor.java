package com.Levantar.methods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Levantar.generic.Elements;
import com.Levantar.generic.Fluctuating;

public class JavaScriptexecutor extends Elements {
	
	
	public void toHandleDisableElement(WebDriver driver,String object)
	{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String[] executor = Fluctuating.locatorsvalue.getProperty(object).split("-");
		
		if(executor[0].equalsIgnoreCase("document.getElementById"))
		{
			js.executeAsyncScript(executor[0]+executor[1]);
		}
		else if(executor[0].equalsIgnoreCase("document.getElementsByname"))
		{
			js.executeAsyncScript(executor[0]+executor[1]);
		}
		
		else if(executor[0].equalsIgnoreCase("document.getElementsByClassname"))
		{
			js.executeAsyncScript(executor[0]+executor[1]);
		}
		else if(executor[0].equalsIgnoreCase("document.getElementsByTagname"))
		{
			js.executeAsyncScript(executor[0]+executor[1]);
		}
	}
	
	public void toScrollto(WebDriver driver,String object)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement ele = ComMethods.webEle( driver,object);
		int x = ele.getLocation().getX();
		int y = ele.getLocation().getY();
		js.executeAsyncScript("window.scrollTO("+x+","+y+")");
	}
	
	

}
