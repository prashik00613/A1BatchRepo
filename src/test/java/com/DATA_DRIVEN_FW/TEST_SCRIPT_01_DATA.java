package com.DATA_DRIVEN_FW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class TEST_SCRIPT_01_DATA {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		String path="../MAVEN_PROJECT/Sample.xlsx";
		// Copy from Rom to Ram
		FileInputStream file= new FileInputStream(path);
		//Open Excel
		Workbook wb= WorkbookFactory.create(file);
		//Open Sheet
		Sheet sh = wb.getSheet("Sheet1");
		//Identify Row
		Row r = sh.getRow(1);
		//Identify Cell
		Cell c = r.getCell(0);
		//Identify cell data
		//String data = c.getStringCellValue();
		//System.out.println(data);
		
		org.apache.poi.ss.usermodel.CellType datatype= c.getCellType();
		if(datatype == org.apache.poi.ss.usermodel.CellType.STRING) {
		String data = c.getStringCellValue();
		System.out.println(data);
	}else {
		double data1=c.getNumericCellValue();
		System.out.println(data1);
	}
		//total rows used in sheet
		int rowcount = sh.getLastRowNum();
		System.out.println(rowcount);
		//total cell used in row
	short cellcount = sh.getRow(0).getLastCellNum();
	System.out.println(cellcount);
		

}
}
