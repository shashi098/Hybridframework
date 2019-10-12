package com.Levantar.generic;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Fluctuating {
	
	public static Properties link;
	
	public static String userDir=System.getProperty("user.dir");
	
	public WebDriver driver;
	
	public static Properties locatorsvalue;
	
	public static ExtentHtmlReporter report ;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static  String photoPath="./photo/";
	
	public static String path="C:\\Users\\HP\\Desktop\\ExtentsReports\\extet.html";

}
