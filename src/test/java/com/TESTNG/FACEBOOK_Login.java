package com.TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenrClass.class)
public class FACEBOOK_Login {
	@Test
	public void Login() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//to login
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Admin123");
		driver.findElement(By.xpath(".//button[text()='Log in']")).submit();// click on login button
		
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		
	}
	@Test
	public void TestFail() {
		Reporter.log("Failed Test Case",true);
		Assert.assertTrue(false);
		
	}
	@Test
	public void TestSkipped() {
		Reporter.log("Skiped Test Case",true);
		//exeption thrown using throw new 
		throw new SkipException("Skip Execution Thrwon-------");
		
	}
	

}
