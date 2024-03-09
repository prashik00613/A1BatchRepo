package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaceBookForgotPass {
	private WebElement emailfield;
	private WebElement cancelbutton;
	private WebElement serachfiled;
	
	public FaceBookForgotPass (WebDriver driver) {
		emailfield= driver.findElement(By.id("identify_email"));
		serachfiled= driver.findElement(By.name("did_submit"));
		cancelbutton= driver.findElement(By.linkText("Cancel"));
		
		
	}
	public void setEmail(String email) {
		emailfield.sendKeys(email);
		
	}
	public void clickonserachButton() {
		serachfiled.click();
	}
	public void clickonCancelButton() {
		cancelbutton.click();
	}
}
