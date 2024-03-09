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

public class TEST_Script1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		String path= "../MAVEN_PROJECT/SampleSheet_2.xlsx";
		FileInputStream file= new FileInputStream(path);
		//Open Ecel
		Workbook wb= WorkbookFactory.create(file);
	
		//remove row
		Sheet sh = wb.getSheet("Sheet1");
		Row tgt = sh.getRow(0);
		sh.removeRow(tgt);
		//Remove cell
		Row r = sh.getRow(3);
		Cell tgt_cell = r.getCell(1);
		r.removeCell(tgt_cell);
		FileOutputStream out= new FileOutputStream("../MAVEN_PROJECT/SampleSheet_2.xlsx");
		wb.write(out);

	}

}
