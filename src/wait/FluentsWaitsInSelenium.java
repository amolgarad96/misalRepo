package wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentsWaitsInSelenium {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	
	FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60)).pollingEvery(Duration.ofMillis(2));
	
	
}
}
