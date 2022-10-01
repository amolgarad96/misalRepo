package handlingpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandling {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
	driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	WebElement alertpopup = driver.findElement(By.xpath("//*[@name='alert']"));
	alertpopup.click();
	//get text
		String textonalert = driver.switchTo().alert().getText();
		System.out.println("Text on alert popup is :"+textonalert);
	//To handle the popup we have to call alert method
	driver.switchTo().alert().accept();
	
	//to handle the confirmation popup
	driver.findElement(By.xpath("//*[@name='confirmation']")).click();
	Thread.sleep(2000);
	String textonconfirmation = driver.switchTo().alert().getText();
	System.out.println(textonconfirmation);
	driver.switchTo().alert().dismiss();
	
	
}
}
