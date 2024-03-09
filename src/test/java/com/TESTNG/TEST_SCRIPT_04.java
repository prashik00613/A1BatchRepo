package com.TESTNG;

import static org.testng.Assert.fail;

import org.openqa.selenium.devtools.v119.css.model.CSSStyleSheetHeader;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class TEST_SCRIPT_04 {
	@Test(invocationTimeOut = 2000 , expectedExceptions = ThreadTimeoutException.class)
	public void Singup() throws InterruptedException {
		Thread.sleep(4000);
		Reporter.log("Singup method executed",true);
	
	}
	

}
