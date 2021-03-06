package com.crm.qa.generic;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {
		static String filepath=".\\testData\\testData.xlsx";
		
	public static String readData(String sheetName,int rowNum,int cellNum) 
	{
		String value=null;
		
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(new File(filepath)));
			value=wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		}
		 catch(EncryptedDocumentException |InvalidFormatException | IOException e)
		{
			e.printStackTrace();
		} 
		  return value; 
	}
	} 

