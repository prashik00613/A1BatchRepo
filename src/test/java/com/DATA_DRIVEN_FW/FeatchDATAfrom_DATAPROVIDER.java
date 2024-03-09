package com.DATA_DRIVEN_FW;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FeatchDATAfrom_DATAPROVIDER {
	@DataProvider
	public String [][] login() throws EncryptedDocumentException{
		String [][] data= null;
		try {
			
			FileInputStream fis = new FileInputStream("../MAVEN_PROJECT/ExcelWithSelenium.xlsx");
			Workbook wb= WorkbookFactory.create(fis);
			int rows= wb.getSheet("Sheet2").getLastRowNum();
			int cell= wb.getSheet("Sheet2").getRow(0).getLastCellNum();
			System.out.println(rows+" "+cell);
			data= new String[rows][cell];
			for (int i=0; i<rows; i++) {
				for(int j=0; j<cell;j++) {
					data[i][j]=wb.getSheet("Sheet2").getRow(i).getCell(j).toString();
				}
			}
					}catch (Exception e) {
						// TODO: handle exception
					
		return data;
		
	}
	@Test(dataProvider = "login")
	public void fetchdata(String[] d) {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Register")).click();
		if(d[0].equalsIgnoreCase("male"))
			driver.findElement(By.id("gender-male")).click();
		else
			driver.findElement(By.id("gender-female")).click();
				driver.findElement(By.id("FirstName")).sendKeys(d[1]);
				driver.findElement(By.id("LastName")).sendKeys(d[2]);
				driver.findElement(By.id("Email")).sendKeys(d[3]);
				driver.findElement(By.id("Password")).sendKeys(d[4]);
				driver.findElement(By.id("ConfirmPassword")).sendKeys(d[4]);
				driver.findElement(By.id("register-button")).click();
		
	}

}
