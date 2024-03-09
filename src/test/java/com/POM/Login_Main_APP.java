package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_Main_APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://online.actitime.com/test26/login.do");
		
		Login_Script_For_Actitime page= new Login_Script_For_Actitime(driver);
		page.setLogin("Admin@124gmail.com", "Manager");
		page.clickonlogin();
		String text = page.geterrormsg();
		System.out.println(text);

	}

	
}
