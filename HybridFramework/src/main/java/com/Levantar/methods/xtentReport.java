package com.Levantar.methods;

import java.io.File;

import com.Levantar.generic.Elements;
import com.Levantar.generic.Fluctuating;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class xtentReport extends Elements{
	
	public static void extentReports(String path)
	{
		
		
	  Fluctuating.report=new ExtentHtmlReporter(new File("C:\\Users\\HP\\Desktop\\ExtentsReports\\extet.html"));
	   
	  Fluctuating.extent= new ExtentReports();
	  
	  Fluctuating.extent.attachReporter(Fluctuating.report);
	  
	  ExtentTest test = Fluctuating.extent.createTest("extentreport");
	   
	  
	  
			
	
	}
	

}
