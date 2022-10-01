package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
Thread.sleep(3000);
List<WebElement> checkboxdropdown = driver.findElements(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord_')]"));
for(WebElement value:checkboxdropdown) {
	String d = value.getText();
	System.out.println(d);
	Thread.sleep(3000);
	if(d.equals(10)) {
		value.click();
	}
}
}
}
