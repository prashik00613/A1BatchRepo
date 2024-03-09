package com.DATA_DRIVEN_FW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericCode {
	static Workbook book;
	static int row;
	static int cell;

	
	public static Workbook getworkbookData() throws IOException {
		try {
			FileInputStream file= new FileInputStream("../MAVEN_PROJECT/ExcelWithSelenium.xlsx");
			book= WorkbookFactory.create(file);
		}catch (EncryptedDocumentException e) {
			// TODO: handle exception
		}catch(FileNotFoundException e) {
			
		}
		return book;
		
	}
	public static int getrow() {
		return row=book.getSheet("Sheet4").getLastRowNum();
		
	}
	public static int getcell() {
		return cell= book.getSheet("Sheet4").getRow(0).getLastCellNum();
		
	}

}
