package com.TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v119.network.model.Request.ReferrerPolicy;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PARAMETERS {
	
	@Parameters({"email","pwd"})
	@Test
	public void Loggin(String email, String pwd) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//Enter username
		driver.findElement(By.id("email")).sendKeys(email);
		//Enter password
		driver.findElement(By.id("pass")).sendKeys(pwd);
		Reporter.log(email, true);
		Reporter.log(pwd , true);
		
	}

}
