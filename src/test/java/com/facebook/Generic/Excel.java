package com.facebook.Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	
		public static int getRowCount(String xlPath, String sheet)
		{
			int rc=0;
				try
				{
					FileInputStream fis= new FileInputStream("xlPath");
					org.apache.poi.ss.usermodel.Workbook wb = WorkbookFactory.create(fis);
					rc=wb.getSheet(sheet).getLastRowNum();
				}
				catch(Exception e)
				{
				}
				return rc;
				}//end of method1
		
	//=============================================================================
	public static String getCellValue(String xlPath, String sheet, int r, int c)
	{
		String v="";
			try
			{
				FileInputStream fis= new FileInputStream("xlPath");
				org.apache.poi.ss.usermodel.Workbook wb = WorkbookFactory.create(fis);
				v=wb.getSheet(sheet).getRow(r).getCell(c).toString();
			}
			catch(Exception e)
			{
			}
			return v;
	}}//end of method 2



