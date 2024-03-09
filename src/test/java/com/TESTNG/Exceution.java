package com.TESTNG;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Exceution {
  @Test(invocationTimeOut = 2000, expectedExceptions = ThreadTimeoutException.class)
  public void f() {
	
	  Reporter.log("Test Method execution ",true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("Before Method Execution ",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("After Method Execution ",true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("BeforeClass Method Execution ",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("AfterClass Method Execution ",true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("BeforeTest Execution ",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("AfterTest Execution ",true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("BeforeSuit Execution ",true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("AfterSuit Execution ",true);
  }

}
