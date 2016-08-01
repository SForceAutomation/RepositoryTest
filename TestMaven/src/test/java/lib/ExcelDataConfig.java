package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	static XSSFWorkbook wb;
	
	XSSFSheet sheet1;
	
	 public ExcelDataConfig(String excelPath)
	 {
		 
		  try 
		  {
			  File src=new File(excelPath);
				
			  FileInputStream fis=new FileInputStream(src);
				
			  wb=new XSSFWorkbook(fis);
			   	 
			
		}  
		  catch (Exception e) {
			
			  System.out.println(e.getMessage());
		}
		 
		 
	 }
	 
	 
	 public String getData(int sheetNumber,int row,int column)
	 {
		sheet1=wb.getSheetAt(sheetNumber);
		 
		String data= sheet1.getRow(row).getCell(column).getStringCellValue();
		 
		return data;
	 }
	 
	 public void setData(int sheetNumber,int row,int column,String data)
	 {
		sheet1=wb.getSheetAt(sheetNumber);
		 
		sheet1.getRow(row).createCell(column).setCellValue(data);
	
	 }
	 
	 public static void writeDataExcel()
	 {
		 try {
			wb.write(new FileOutputStream(new File(System.getProperty("user.dir")+"\\TestData\\InputData.xlsx")));
			wb.close();
		}  catch (Exception e) {
		
		}
	
	 }
	 
	 
	 public int getRowCount(int sheetIndex)
	 {
		 
		int row= wb.getSheetAt(sheetIndex).getLastRowNum();
		 
		row=row+1;
		
		return row;
		
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	

}
