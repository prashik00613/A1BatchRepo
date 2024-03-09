package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.dynamic.loading.ByteArrayClassLoader.ChildFirst;

public class FaceBook_SingUp_Page {
	
	private WebElement firtname;
	private WebElement lastname;
	private WebElement mobilenumber;
	private WebElement password;
	private WebElement date;
	private WebElement month;
	private WebElement year;
	private WebElement femaleoption;
	private WebElement maleoption;
	private WebElement cutomeoption;
	private WebElement singup;
	
	public  FaceBook_SingUp_Page (WebDriver driver) {
		firtname= driver.findElement(By.name("firstname"));
		lastname= driver.findElement(By.name("lastname"));
		mobilenumber= driver.findElement(By.name("reg_email__"));
		password= driver.findElement(By.name("reg_passwd__"));
		date= driver.findElement(By.id("day"));
		month= driver.findElement(By.id("month"));
		year= driver.findElement(By.id("year"));
		femaleoption= driver.findElement(By.xpath(".//input[@value='1']"));
		maleoption= driver.findElement(By.xpath(".//input[@value='2']"));
		cutomeoption= driver.findElement(By.xpath(".//input[@value='-1']"));
		singup= driver.findElement(By.name("websubmit"));
	}
	public void setName(String F_Name, String L_Name) {
		firtname.sendKeys(F_Name);
		lastname.sendKeys(L_Name);
	}
	 public void setMobileNumber(String number) {
		 mobilenumber.sendKeys(number);
	 }
	 public void setpassword(String pwd) {
		 password.sendKeys(pwd);
	 }
	 public void selectDOB(String day, String monthindex, String yearindex) {
		 Select s= new Select(date);
		 s.selectByVisibleText(day);
		 Select s1= new Select(month);
		 s1.selectByVisibleText(monthindex);
		 Select s2= new Select(year);
		 s2.selectByVisibleText(yearindex); 
	 }
	 public void FemaleOption() {
		 femaleoption.click();
	 }
	public void maleOption() {
		maleoption.click();
	}
	public void SingupButton() {
		singup.click();
	}

}
