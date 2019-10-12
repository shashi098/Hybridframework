package com.Levantar.generic;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import com.Levantar.methods.Mylistner;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(Mylistner.class)
public class Elements extends Fluctuating {

	
	public void initilize() throws Exception
	{
		Fluctuating.link=new Properties();
		Fluctuating.link.load(new FileInputStream(Fluctuating.userDir+"/src/main/resources/link.properties"));
		
		Fluctuating.locatorsvalue=new Properties();
		Fluctuating.locatorsvalue.load(new FileInputStream(Fluctuating.userDir+"/src/main/resources/locatorsvalue.properties"));
		
	}
	
	
	@BeforeTest
	public void setProperties() throws Exception
	{
		initilize();
	}
	
	
	public void enterUrl()
	{
	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url = Fluctuating.link.getProperty("URL");
		driver.get(url);
	}
	
	
	
	
	@BeforeMethod
	public void openApp()
	{
		String b = Fluctuating.link.getProperty("browser");
		 if(b.equalsIgnoreCase("chrome"))
		 {
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 enterUrl();
		 }
		 
		 else if (b.equalsIgnoreCase("firefox")) 
		 {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			enterUrl();
		}
	}
	
	
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}

}
