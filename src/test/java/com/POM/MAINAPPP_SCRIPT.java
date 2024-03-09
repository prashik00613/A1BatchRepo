package com.POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MAINAPPP_SCRIPT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://online.actitime.com/test26/login.do");
		WithoutusingPageFactory_Script page= new WithoutusingPageFactory_Script(driver);
		page.enterusername("Admin");
		page.enterpassword("Amdmin123");
		page.ClickonLoginbutton();
		

	}

}