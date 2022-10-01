package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXPath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
//driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_10']")).click();
for(int i=1;i<40;i++) {
	driver.findElement(By.xpath("(//input[contains(@id,'ohrmList_chkSelectRecord_')])["+i+"]")).click();
	}
//for(int i=1;i<40;i=i+2) {
//	driver.findElement(By.xpath("(//input[contains(@id,'ohrmList_chkSelectRecord_')])["+i+"]")).click();

//}
}
}
