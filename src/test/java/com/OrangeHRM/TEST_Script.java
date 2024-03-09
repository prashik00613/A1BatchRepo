package com.OrangeHRM;

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

public class TEST_Script {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		String path="../MAVEN_PROJECT/DEMO.xlsx";
		FileInputStream file=new FileInputStream(path);
		//Open Sheet
		Workbook wb= WorkbookFactory.create(file);
		//Create Sheet
		Sheet sh = wb.createSheet("SampleSheet");
		//Create 2nd row
		Row r = sh.createRow(1);
		//Create cell
		Cell c = r.createCell(0);
		//Add data
		c.setCellValue("TESTNG");
		//save Changes
		FileOutputStream out= new FileOutputStream(path);
		wb.write(out);

	}

}
