package com.TESTNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verifiaction_TEST03 {
	@Test
	public void Test01() {
		SoftAssert s = new SoftAssert();
		Reporter.log("Test 01 Method execution is Started",true);
		String str1 = "Prashik";
		String str2="Prashik";
		Reporter.log("Verification 01 started",true);
		s.assertEquals(str1, str2);
		Reporter.log("Verification 02 started",true);
		String str3="Prashik";
		s.assertEquals(str1, str3);
		Reporter.log("TEST 01 Method execution is end",true);
		s.assertAll();
		
	}
	@Test
	public void TEST02() {
		Reporter.log("TEST02 ",true);
	}

}
