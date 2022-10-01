package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
public static void main(String[] args) throws IOException {
	File src = new File("C:\\Users\\hp\\Desktop\\Test Data Excel.xlsx");
	
	FileInputStream fis=new FileInputStream(src);
	
	//To access The Workbook
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sh1 = wb.getSheet("Sheet1");
//	XSSFSheet sh1 = wb.getSheetAt(0);
	DataFormatter df =new DataFormatter();
	String string = df.formatCellValue(sh1.getRow(5).getCell(1));
//	String dataoncell = sh1.getRow(5).getCell(1).getStringCellValue();
//String dataoncell = sh1.getRow(6).getCell(0).getStringCellValue();

//System.out.println(dataoncell);
	System.out.println(string);
}
}
