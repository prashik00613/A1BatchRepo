package com.TESTNG;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.IAssert;

public  class iTestResult extends Assert {
	@Test
	public void TestCaseFail() {
		fail();
		//assertTrue(true);
		
	}
	@Test
	public void TestCasePass() {
		assertTrue(true);
		
	}
	@AfterMethod
	public void GetStatusd(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			Reporter.log("Success = Method Status :" +result.getStatus() +"Method Name :" +result.getName(),true);
			
		}
		if (result.getStatus() == ITestResult.FAILURE) {
			Reporter.log("Success = Method Status :" +result.getStatus() +"Method Name :" +result.getName(),true);
			
		}
	}
	

}
