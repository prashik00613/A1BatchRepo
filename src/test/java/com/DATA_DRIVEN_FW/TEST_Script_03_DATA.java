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

public class TEST_Script_03_DATA {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream("../MAVEN_PROJECT/SampleSheet_2.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		Sheet s = wb.getSheet("Sheet1");
		int rowcount = s.getLastRowNum();
		System.out.println(rowcount);
		for( int rownum=0; rownum<=rowcount; rownum++) {
			Row r= s.getRow(rownum);
			int cellcount = r.getLastCellNum();
			for(int cellnum=0; cellnum<cellcount; cellnum++ ) {
				Cell data = r.getCell(cellnum);
				if(data!=null) {
					String data2=data.toString();
					System.out.println(data2 +" ");
		
			}
			System.out.println("  ");
		}
		
		}
	}

}
