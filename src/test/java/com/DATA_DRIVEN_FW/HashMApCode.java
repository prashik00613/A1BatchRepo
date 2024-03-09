package com.DATA_DRIVEN_FW;

import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Workbook;

public class HashMApCode {
	public static HashMap<String , String>hasmapdata;
	
	public static void test() throws IOException {
		hasmapdata = new HashMap<String, String>();
		Workbook book = GenericCode.getworkbookData();
		int row = GenericCode.getrow();
		int cell = GenericCode.getcell();
		System.out.println(cell+"\t"+row);
		//for rows
		for(int i= 0; i<=row ; i++) {
		 	String key = null, value=null;
			int  j =0;
			key = book.getSheet("Sheet4").getRow(i).getCell(j).toString();
			for(; j<cell ; j++) {
				value= book.getSheet("Sheet4").getRow(i).getCell(j).toString();
			}
			hasmapdata.put(key, value);
			
		}
	}

}
