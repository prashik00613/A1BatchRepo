package com.TESTNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verification_TEST01 {
	@Test
	public void M1() {
		String str1= "Prashik";
		String str2="PRASHIK";
		Assert.assertNotEquals(str1, str2);//if both are not same then verification pass
		Reporter.log("Verfication is passs",true);
		
	}

}
