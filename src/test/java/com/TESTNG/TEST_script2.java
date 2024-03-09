package com.TESTNG;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TEST_script2 {
	@Test
	public void SingUP() {
		Reporter.log("SingUp Method is Executed",true);
		//fail();
		
	}
	@Test(dependsOnMethods = "SingUP")
	public void LoginPage() {
		Reporter.log("LoginPage Method executed",true);
	}

}
