package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
JavascriptExecutor js = (JavascriptExecutor)driver;
//js.executeScript("window.scrollBy(0,800)");
//js.executeScript("window.scrollBy(0,-400)");
WebElement checkbox = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_40']"));
js.executeScript("arguments[0].scrollIntoView();",checkbox);
}
}
