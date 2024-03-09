package com.POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MAINAPP_FOR_FACEBOOK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		FaceBookLoginPage page= new FaceBookLoginPage(driver);
		page.setLogin("Admin@1234", "Manager");
		page.clickonLoginbutton();
		page.clickonCreateAccount();
	}
	
	public class TestAccount{
		@Test
		public void TestLogin() {
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			FaceBookLoginPage page= new FaceBookLoginPage(driver);
			page.clickonCreateAccount();
			FaceBook_SingUp_Page page1 = new FaceBook_SingUp_Page(driver);
			page1.setName("Admin", "Manager");
			page1.setMobileNumber("Admin@123gmail.com");
			page1.setpassword("Manager12");
			page1.selectDOB("6", "Oct", "1997");
			
			
		}
	}
	
		
	}
	
		 



