package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WithoutusingPageFactory_Script {
	//with using pagefactory
	
	WebDriver driver;
	
	public WithoutusingPageFactory_Script(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	//identify element
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(name="pwd")
	WebElement pass;
	
	@FindBy(xpath = ".//div[text()='Login ']")
	WebElement loginbutton;
	
	 public void enterusername(String user) {
		username.sendKeys(user);
	 }
	 public void enterpassword(String pwd) {
		pass.sendKeys(pwd);
	 }
	 public void ClickonLoginbutton() {
		loginbutton.click();
	 }

}
