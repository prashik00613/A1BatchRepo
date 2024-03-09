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

public class TEST_SCRIPT_REMOVE_SHEET {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		String path="../MAVEN_PROJECT/SampleSheet_2.xlsx";
		FileInputStream file= new FileInputStream(path);
		//open excel
		Workbook wb= WorkbookFactory.create(file);
		//Remove row
		Sheet sh = wb.getSheet("Sheet1");
		Row tgt = sh.getRow(0);
		sh.removeRow(tgt);
		//Remove cell
		Row r = sh.getRow(3);
		Cell tgt_cell = r.getCell(0);
		r.removeCell(tgt_cell);
		FileOutputStream out = new FileOutputStream(path);
		wb.write(out);

	}

}
