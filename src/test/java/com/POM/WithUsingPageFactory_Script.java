package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WithUsingPageFactory_Script {
	//without page factory
	WebDriver driver;
	
	public WithUsingPageFactory_Script(WebDriver d) {
		driver=d;
		
	}

	//locate elemnet
	 By username= By.id("username");
	 By passsword= By.name("pwd");
	 By loginbutton =  By.xpath(".//div[text()='Login ']");
	 
	 
	 
	 public void enterusername(String user) {
		 driver.findElement(username).sendKeys(user);
	 }
	 public void enterpassword(String pwd) {
		 driver.findElement(passsword).sendKeys(pwd);
	 }
	 public void ClickonLoginbutton() {
		 driver.findElement(loginbutton).click();
	 }
}
