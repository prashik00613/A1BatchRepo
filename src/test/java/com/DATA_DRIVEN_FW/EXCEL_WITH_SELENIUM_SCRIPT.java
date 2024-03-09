package com.DATA_DRIVEN_FW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EXCEL_WITH_SELENIUM_SCRIPT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("../MAVEN_PROJECT/ExcelWithSelenium.xlsx");
		Workbook wb= WorkbookFactory.create(file);
		Sheet s = wb.getSheet("Sheet1");
		String EmailID = s.getRow(1).getCell(0).toString();
		String Pwd = s.getRow(1).getCell(1).toString();
		//selenium code
		WebDriver driver = new FirefoxDriver();
		driver.get("https://online.actitime.com/test26/login.do");
		driver.findElement(By.name("username")).sendKeys(EmailID);
		driver.findElement(By.name("pwd")).sendKeys(Pwd);
		
		
	}

}
