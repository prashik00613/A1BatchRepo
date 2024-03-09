package com.DATA_DRIVEN_FW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TEST_PROPETIERS_SCRIPT_01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Copy file from ROM to RAM
		FileInputStream file= new FileInputStream("../MAVEN_PROJECT/sample.propertie");
		//Open File
		Properties p = new Properties();
		p.load(file);
		//Read data 
		String url = p.getProperty("URL");
		//Open Browser
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//open url
		driver.get(url);
		//Enter username
		String username = p.getProperty("un");
		driver.findElement(By.name("username")).sendKeys(username);
		//Enter pwd
		String pass = p.getProperty("pwd");
		driver.findElement(By.name("password")).sendKeys(pass);
		//ClickonLogin
		driver.findElement(By.xpath(".//button[text()=' Login ']")).click();
		//verify loginpage
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("OrangeHRM"));
		System.out.println("Home page Dispalyed---------------");
	
		

	}

}
