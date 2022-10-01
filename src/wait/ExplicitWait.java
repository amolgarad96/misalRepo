package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	
	WebElement disablebutton = driver.findElement(By.xpath("//*[@id='disable']"));
	
	driver.findElement(By.xpath("//*[@id='enable-button']")).click();
	
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60));
	//wait till the element is not clickable over the page
	wait.until(ExpectedConditions.elementToBeClickable(disablebutton));
	
	driver.findElement(By.xpath("//*[@id='enable-button']")).click();
	///waiting until the element is visible over the page or not
	
    driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
    
	WebElement hiddenbutton = driver.findElement(By.xpath("//*[@id='hidden']"));
	
	wait.until(ExpectedConditions.visibilityOf(hiddenbutton));
	
	System.out.println("button displayed on the page");
	

}
}
