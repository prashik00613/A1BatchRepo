package com.DATA_DRIVEN_FW;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainApp_For_Exel_Hashmap {
	public static void main(String[] args) throws IOException {
		HashMApCode.test();
		HashMap<String , String> data = HashMApCode.hasmapdata;
		System.out.println(data);
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		if(data.get("Gender").equals("Gender-male"))
			driver.findElement(By.id("gender-male")).click();
		else
			driver.findElement(By.id("gender-female")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys(data.get("fname"));
		driver.findElement(By.id("LastName")).sendKeys(data.get("lname"));
		driver.findElement(By.id("Email")).sendKeys(data.get("emailID"));
		driver.findElement(By.id("Password")).sendKeys(data.get("password"));
		driver.findElement(By.id("ConfirmPassword")).sendKeys(data.get("password"));
	}
	

}
