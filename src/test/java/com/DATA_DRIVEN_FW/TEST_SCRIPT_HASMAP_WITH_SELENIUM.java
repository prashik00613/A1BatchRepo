package com.DATA_DRIVEN_FW;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TEST_SCRIPT_HASMAP_WITH_SELENIUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> ref= new HashMap<>();
		// to add data in hasmap we use put method
		ref.put("URL", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		ref.put("Username", "Admin");
		ref.put("Password", "admin123");
		// open browser
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String url = ref.get("URL");
		driver.get(url);
		//Enter username
		String un = ref.get("Username");
		driver.findElement(By.name("username")).sendKeys(un);
		//Enter password
		String pass = ref.get("Password");
		driver.findElement(By.name("password")).sendKeys(pass);
		//click on login buttln
		driver.findElement(By.xpath(".//button[text()=' Login ']")).click();
		//create new hasmap
		HashMap<String,String> ref1= new HashMap<>();
		// to add data in hasmap we use put method
		ref1.put("URL", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		ref1.put("Username", "Admin");
		ref1.put("Password", "admin123");
		

	}

}
