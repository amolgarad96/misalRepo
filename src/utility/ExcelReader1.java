package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader1 {
public static String readdata(int row,int column) throws IOException {
	String path = System.getProperty("user.dir")+"//Test Data Excel.xlsx";
File src = new File(path);
	
	FileInputStream fis=new FileInputStream(src);
	
	//To access The Workbook
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sh1 = wb.getSheet("Sheet1");
//	XSSFSheet sh1 = wb.getSheetAt(0);
	DataFormatter df =new DataFormatter();
	String stringvalue = df.formatCellValue(sh1.getRow(row).getCell(column));
	
//	String dataoncell = sh1.getRow(5).getCell(1).getStringCellValue();
//String dataoncell = sh1.getRow(6).getCell(0).getStringCellValue();

//System.out.println(dataoncell);
	System.out.println(stringvalue);
	return stringvalue;
}
public static void writedata() throws IOException {
	String path = System.getProperty("user.dir")+"//Test Data Excel.xlsx";
     File src = new File(path);
	
	FileInputStream fis=new FileInputStream(src);
	
	//To access The Workbook
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sh1 = wb.getSheet("Sheet1");
//	XSSFSheet sh1 = wb.getSheetAt(0);
	File fout=new File(path);
	FileOutputStream fos = new FileOutputStream(fout);
	sh1.getRow(12).getCell(0).setCellValue("write test");
	sh1.createRow(50).createCell(5).setCellValue("50th row data");
	wb.write(fos);
}
public static void main(String[] args) throws IOException {
	readdata(6,0);
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
