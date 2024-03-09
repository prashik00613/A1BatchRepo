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

public class TEST_SCRIPT_04_DATA {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		String path="../MAVEN_PROJECT/Empty_Sheet.xlsx";
		FileInputStream file= new FileInputStream(path);	
		//Open Excel
		Workbook wb= WorkbookFactory.create(file);
		//Open sheet
		Sheet sh = wb.getSheet("Sheet1");
		int totalrows = sh.getLastRowNum();
		//identfiy each row
		for(int rownum=0; rownum<=totalrows;rownum++) {
		
			Row r= sh.getRow(rownum);
			short totalcell = r.getLastCellNum();
			
			//identify each cell
			for(int cellnum=0 ; cellnum<totalcell; cellnum++) {
				try {
					Cell c= r.getCell(cellnum);
					System.out.println(c.toString()+ " ");
				}catch(NullPointerException e){
						System.out.println();
			}
		}
	}

}
}
