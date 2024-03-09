package com.TESTNG;

import org.testng.Assert;
import org.testng.Reporter;

public class Verifiaction_TEST02 {
	@org.testng.annotations.Test
	
	public void Test() {
		String str1="PRASHIK";
		String str2="PRAshik";
		Assert.assertNotEquals(str1, str2);
		
	}
	@org.testng.annotations.Test(dependsOnMethods = "Test")
	public void TEST02() {
		Reporter.log("TEST02 method Pass",true);
		
	}
	@org.testng.annotations.Test
	public void TEST03() {
		Reporter.log("TEST03 method Pass",true);
		
	}

}
