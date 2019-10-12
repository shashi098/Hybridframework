package com.Levantar.methods;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Levantar.generic.Elements;
import com.Levantar.generic.Fluctuating;
import com.aventstack.extentreports.Status;

public class Mylistner extends Elements implements ITestListener {

	
	public void onTestStart(ITestResult result) 
	{
	
		Fluctuating.test=Fluctuating.extent.createTest(result.getTestClass().getName().toString());
		
	}

	public void onTestSuccess(ITestResult result) 
	{
		
		Fluctuating.test.log(Status.PASS,"pass" );
		
		
		String name = Fluctuating.photoPath+result.getName()+".png";
		System.out.println(name);
		ToTakeScreenShot tss = new ToTakeScreenShot();
		tss.takeScreenShot(driver,name);
		
	}

	public void onTestFailure(ITestResult result) {
		Fluctuating.test.log(Status.FAIL, "fail");
		
		String name = Fluctuating.photoPath+result.getName()+".png";
		System.out.println(name);
		ToTakeScreenShot tss = new ToTakeScreenShot();
		tss.takeScreenShot(driver,name);
		
	}

	public void onTestSkipped(ITestResult result) 
	{
		Fluctuating.test.log(Status.SKIP, "skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		
		xtentReport.extentReports(Fluctuating.path);
	}

	public void onFinish(ITestContext context) {
		
		Fluctuating.extent.flush();
	}

}
