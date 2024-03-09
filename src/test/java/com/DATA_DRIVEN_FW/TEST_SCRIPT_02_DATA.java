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

public class TEST_SCRIPT_02_DATA {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		String path="../MAVEN_PROJECT/SampleSheet_1.xlsx";
		FileInputStream file= new FileInputStream(path);
		//Open execl 
		Workbook wb= WorkbookFactory.create(file);
		//identify sheet
		Sheet sh = wb.getSheet("Sheet1");
		//identify each row
		for(int rownum =0; rownum<=1; rownum++) {
			Row r = sh.getRow(rownum);
			//identify each cell 
			for(int cellnum=0; cellnum<=1; cellnum++) {
				Cell c = r.getCell(cellnum);
				System.out.println(c.toString() + " ");
			}
			System.out.println(" ");
		}

	}

}
