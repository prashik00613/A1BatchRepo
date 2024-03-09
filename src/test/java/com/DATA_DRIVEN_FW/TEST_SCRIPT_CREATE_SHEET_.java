package com.DATA_DRIVEN_FW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TEST_SCRIPT_CREATE_SHEET_ {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		String path="../MAVEN_PROJECT/Empty_Sheet.xlsx";
		FileInputStream file= new FileInputStream(path);
		//open excel
		Workbook wb= WorkbookFactory.create(file);
		//Create sheet
		Sheet sh = wb.createSheet("SampleSheet");
		//create  2nd row
		Row r = sh.createRow(1);
		//create cell
		Cell c = r.createCell(0);
		//Add data
		c.setCellValue("TESTNG");
		//save changes
		FileOutputStream out= new FileOutputStream(path);
		wb.write(out);
		

	}

}
