package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	FileInputStream fis;
	XSSFWorkbook wb;
	
	
	public ExcelDataProvider() {
		
		File src = new File("./TestData/TestExcel.xlsx");
		
		try {
			fis=new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Unale to relad excel file...!!!");
		}	
		
	}
	
	public String  getStringData(String sheetName, int row, int col) {
		return wb.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();	
	}
	
	public Double getNumericData(String sheetName, int r, int c) {
		return wb.getSheet(sheetName).getRow(r).getCell(c).getNumericCellValue();
			
	}
	
	public String  getStringData(int sheetIndex, int row, int col) {
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(col).getStringCellValue();	
	}

}
