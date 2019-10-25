package com.assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		int count = -1;
		String path = "c:\\Users\\sai\\Desktop\\Book1.xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		int coll = wb.getSheet("Sheet1").getRow(0).getLastCellNum();
		System.out.println(coll);
		Row row = wb.getSheet("Sheet1").getRow(0);
		for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
			Cell cell = row.getCell(i);
			if (cell.toString().equalsIgnoreCase("bye")) {
				count = i;
				System.out.println(count);
			}
		}
		System.out.println(count);
		int j = wb.getSheet("Sheet1").getLastRowNum();
		int c = 1;
		for (int i = 0; i < coll; i++)

		{
			
			if (wb.getSheet("Sheet1").getRow(0).getCell(i).toString().equalsIgnoreCase("un"))
				while (c <= j) {
					System.out.println(wb.getSheet("Sheet1").getRow(c).getCell(count));
					c++;
				}

		}
	}

}
