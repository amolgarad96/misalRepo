package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterClassTestng {
	@Test
	public void logout() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\selenium\\lastchromedriver\\chromedriver_win32\\lastchromedrive\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Reporter.log("This is a logout Test Case", true);
		//when u write true it will print console as well as report.
	}
}
