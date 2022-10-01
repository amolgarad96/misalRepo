package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

public class ExcelReaders {
public static void main(String[] args) throws IOException {
	File src=new File("C:\\Users\\hp\\Desktop\\Book1.xlsx");
	FileInputStream fis=new FileInputStream(src);
	SXSSFWorkbook wb= new SXSSFWorkbook();
	SXSSFSheet sh1 = wb.getSheet("Sheet1");
	String value = sh1.getRow(3).getCell(1).getStringCellValue();
	System.out.println(value);
}
}
