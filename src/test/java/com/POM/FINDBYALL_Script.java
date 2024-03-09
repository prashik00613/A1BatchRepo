package com.POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FINDBYALL_Script {
	WebDriver driver ;
	
	@FindAll({
		
		@FindBy(xpath = ".//img")
	})
	private List<WebElement> elementlist;
	
	public FINDBYALL_Script() {
		driver= new FirefoxDriver();
		PageFactory.initElements(driver, this);
	}
	@Test
	public void ele() {
		driver.get("https://www.flipkart.com/");
		Reporter.log("Elemnts lis -----"+ elementlist.size(),true);
	}

}
