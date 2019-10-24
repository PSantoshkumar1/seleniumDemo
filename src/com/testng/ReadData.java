package com.testng;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadData {
	@DataProvider
	public String [][] CreateUser() throws Exception {
		String[][] s;
		String path="";
		Workbook excel=WorkbookFactory.create(new FileInputStream(path));
		org.apache.poi.ss.usermodel.Sheet sheet =excel.getSheet("sheet1");
		s=new String[sheet.getPhysicalNumberOfRows()-1][sheet.getRow(0).getLastCellNum()];
		for(int i=1;i<sheet.getPhysicalNumberOfRows();i++)
		{
			for(int j=0;i<sheet.getRow(i).getFirstCellNum();j++)
			{
				Cell value  =sheet.getRow(i).getCell(j);
				s[i  -1 ][j]=value.toString();
				System.out.println(s[i  -1][j]);
			}
			
		}

		return s;
	}

}
