package com.TESTNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TEST_Script1 {
	@Test(invocationCount = 10)
	public void CreateAccount() {
	 
		Reporter.log("Create Account method executed",true);
	}
	@Test( enabled = false)
	public void upDateAccount() {
		Reporter.log("Update Account method executed",true);
	}
	@Test
	public void DeleteAccount() {
		Reporter.log("Delete Account method executed",true);
	}
	@Test(priority = 2)
	public void ReadAccount() {
		Reporter.log("Read Account method executed",true);
	}
	@Test(priority = 1)
	public void EditAccount() {
		Reporter.log("Edit Account method executed",true);
	}

}
