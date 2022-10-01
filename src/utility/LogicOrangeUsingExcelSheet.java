package utility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogicOrangeUsingExcelSheet {
public static void main(String[] args) throws IOException {
	ExcelReader1.readdata(2, 0);
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(ExcelReader1.readdata(2, 0));
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(ExcelReader1.readdata(2, 1));
	driver.findElement(By.xpath("//input[@type='submit']")).click();
}
}
