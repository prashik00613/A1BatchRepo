package com.TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DATA_PROVIDER_TEST_SCRIPT {
	@DataProvider
	
	public Object[][] TESTDATA() {
		Object [][] obj = new Object[1][2];
		obj[0][0] = "Admin@1234";
		obj [0][1]= "Admin!23";
		return obj;
		
		
	}
	@Test(dataProvider = "TESTDATA")
	public void TestLogin(String eamil, String pwd) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//Enter username
		driver.findElement(By.id("email")).sendKeys(eamil);
		//Enter password
		driver.findElement(By.id("pass")).sendKeys(pwd);
	}
		
	

}
