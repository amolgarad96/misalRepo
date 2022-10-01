package actionclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GooglNewAuto {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe");

	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement searchbox = driver.findElement(By.xpath("//*[@title='Search']"));
	Actions act= new Actions(driver);
	act.click(searchbox).sendKeys("selenium").build().perform();
	Thread.sleep(2000);
	List<WebElement> searchresult = driver.findElements(By.xpath("//*[@jsname='bw4e9b']//span[text()='selenium']"));
for(WebElement result:searchresult) {
	String value = result.getText();
	
	if(value.equals("selenium webdriver")) {
		result.click();
		break;
	}
	System.out.println(value);
}
}
}
