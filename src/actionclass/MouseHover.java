package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseHover {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
}
}
