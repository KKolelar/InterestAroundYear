package com.interestAroundYear.utils;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class excelUtils {
	
	public static FileInputStream fileInput;
	public static FileOutputStream fileOutput;
	public static XSSFWorkbook workBook;
	public static XSSFSheet workSheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;   
	
    //Writing data into the cell
	public static void setCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException
	{
		fileInput=new FileInputStream(xlfile);
		workBook=new XSSFWorkbook(fileInput);
		workSheet=workBook.getSheet(xlsheet);
		row=workSheet.getRow(rownum);
		if(row==null)
		{
			row=workSheet.createRow(rownum);
					
		}
		cell=row.createCell(colnum);
		cell.setCellValue(data);
		fileOutput=new FileOutputStream(xlfile);
		workBook.write(fileOutput);		
		workBook.close();
		fileInput.close();
		fileOutput.close();				
	}
}

