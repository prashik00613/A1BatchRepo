package com.DATA_DRIVEN_FW;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MainApp_Script_For_Utility {
@Test
	public void login() throws IOException {
	WebDriver driver = new FirefoxDriver();
	UtilityMethod un = new UtilityMethod();
	driver.get(un.getDataFromExcel("Sheet3", 0, 0));
		
	}
}