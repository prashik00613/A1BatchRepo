package com.DATA_DRIVEN_FW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityMethod {
	
	public String getDataFromPropertyFile(String Key) throws IOException {
		FileInputStream file = new FileInputStream("../MAVEN_PROJECT/sample.propertie");
		Properties p = new Properties();
		p.load(file);
		
		return p.getProperty(Key);
		
	}
	public String getDataFromExcel(String sheetname, int rownum, int cellnum) throws IOException {
		FileInputStream file = new FileInputStream("../MAVEN_PROJECT/ExcelWithSelenium.xlsx");
		Workbook book=null;
		try {
			book= WorkbookFactory.create(file);
		}catch (EncryptedDocumentException e) {
			// TODO: handle exception
		}
		Sheet sh = book.getSheet(sheetname);
		return sh.getRow(rownum).getCell(cellnum).toString();
		
	}

}
