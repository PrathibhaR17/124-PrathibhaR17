package com.selenium.apache;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
		
//		path
		//path of the file
		FileInputStream  fis = new FileInputStream("C:\\Users\\Prathi\\OneDrive\\Documents\\TESTDATA1.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheet("Sheet1");
		
//		create a new row
		Row row = sh1.createRow(2);
		
//		create column
		Cell cell = row.createCell(0);
		
//		
		cell.setCellValue("Arjun");
		
		FileOutputStream fos = new 	FileOutputStream("C:\\Users\\Prathi\\OneDrive\\Documents\\TESTDATA1.xlsx");
		wb.write(fos);
		fos.close();
		System.out.println("End of writing file");
		
		
		
		
		// TODO Auto-generated method stub

	}

}
