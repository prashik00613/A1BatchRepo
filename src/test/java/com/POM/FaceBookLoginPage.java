package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaceBookLoginPage {
	
		private WebElement emailfiled;
		private WebElement passwordfiled;
		private WebElement forgotfiled;
		private WebElement loginbutton;
		private WebElement CreatenewAcccount;
			
		public FaceBookLoginPage (WebDriver driver) {
			emailfiled= driver.findElement(By.id("email"));
			passwordfiled= driver.findElement(By.name("pass"));
			forgotfiled= driver.findElement(By.linkText("Forgotten password?"));
			loginbutton= driver.findElement(By.name("login"));
			CreatenewAcccount= driver.findElement(By.linkText("Create new account"));
		}
		//utlizze ----->perfrom action
		public void setLogin(String user, String pwd) {
			emailfiled.sendKeys(user);
			passwordfiled.sendKeys(pwd);	
		}
		public void clickonLoginbutton() {
			loginbutton.click();
			
		}
		public void clickonForgotpassword() {
			forgotfiled.click();
		}
		public void clickonCreateAccount() {
			CreatenewAcccount.click();
		}
}
