package com.TESTNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TEST_SCript3 {
	@Test(groups = "Sample")
	public void m1() {
		Reporter.log("M1 Method is Executed",true);
	}
	@Test(groups = "Sample")
	public void m2() {
		Reporter.log("M2 Method is Executed",true);
	}

	@Test(groups = "Sample")
	public void m3() {
		Reporter.log("M3 Method is Executed",true);
	}

	@Test(groups = "Sample")
	public void m4() {
		Reporter.log("M4 Method is Executed",true);
	}

	
	@Test(dependsOnGroups = "Sample")
	public void m5() {
		Reporter.log("M5 Method is Executed",true);
	}


}
