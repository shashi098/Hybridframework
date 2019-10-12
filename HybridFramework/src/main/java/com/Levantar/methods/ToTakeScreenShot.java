package com.Levantar.methods;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Levantar.generic.Elements;

public class ToTakeScreenShot extends Elements{
	
	public void takeScreenShot(WebDriver driver,String path)
	{
		
		try {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des=new File(path);
		FileUtils.copyFile(src,des);
		}
		
		catch(Exception e)
		{
			System.out.println("photo not taken");
		}
	}

}
