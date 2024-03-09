package com.TESTNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenrClass implements ITestListener {
	//it is basically used to store and share data across the tests in selenium by using TestNG
		// it simply helps to share data within the test case are in single java file or same class0. 
		public void onStart(ITestContext reuslt) {
			Reporter.log("On Start method invoked------",true);

		}
		public void onFinish(ITestContext result) {
			Reporter.log("On Finish method invoked------",true);
			
		}
		// When Test Case get failed, this method is called
		public void onTestFailure(ITestResult result) {
			Reporter.log("Name of Test method failed:" + result.getName(),true);
		}
		//When Test Case get Skipped , this method id called
		public void onTestSkipped(ITestResult result) {
			Reporter.log("Name of Test method skipped:"+ result.getName(),true);
			
		}
		//When Test Case get started , this method is called.
		public void onTestStart(ITestResult result) {
			Reporter.log("Name of Test Method started:"+ result.getName(),true);
		}
		public void onTestSuccess(ITestResult result) {
			Reporter.log("Name of Thet Method Success"+ result.getName(),true);
		}
		public void onTestFailedButWithSuccessPercentage(ITestResult result) {
		}

	}



