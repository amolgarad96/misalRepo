package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	WebElement filechooserbutton = driver.findElement(By.xpath("//*[@name='upload']"));
	filechooserbutton.sendKeys("C:\\Users\\hp\\Downloads\\Katraj 15 Jan A.docx");
	
}
}
