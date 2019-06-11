package com.utailerProject.Utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("This test is started : " + result.getName());	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("This test is failed : " + result.getName());	
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("this Test is skipped" + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
	
		System.out.println("This test is about to start : " + context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("This test is finished now : " + context.getName());
		
	}

}
