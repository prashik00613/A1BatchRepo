package com.OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriver driver = new FirefoxDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			//Enter username
			driver.findElement(By.name("username")).sendKeys("Admin");
			//Enter password
			driver.findElement(By.name("password")).sendKeys("admin123");
			//click on login buttton
			driver.findElement(By.xpath(".//buntton[text()=' Login ']")).click();
			//verify home page is dispalyed or not
			WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.titleContains("OrangeHRM"));
			System.out.println("Home page is Displayed");
	}

}
