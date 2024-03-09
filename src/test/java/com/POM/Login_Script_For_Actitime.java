package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Script_For_Actitime {
	//Declration
		private WebElement username;
		private WebElement password;
		private WebElement loginbutton;
		private WebElement errormsg;
		
		//initilization ----------->identify elements
		public Login_Script_For_Actitime(WebDriver driver) {
			username= driver.findElement(By.id("username"));
			password= driver.findElement(By.name("pwd"));
			loginbutton=driver.findElement(By.id("loginButton"));
			errormsg= driver.findElement(By.xpath(".//span[text()='Username or Password is invalid. Please try again.']"));
		}
		// utlize ----------->perfrom action
		public void setLogin(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		}
		public void clickonlogin() {
			loginbutton.click();
		}
		public String geterrormsg() {
			return errormsg.getText();
					
			
		}
		
		

}
