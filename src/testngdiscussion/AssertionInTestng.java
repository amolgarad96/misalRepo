package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionInTestng {
	@Test
public void verifyUrl() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\selenium\\lastchromedriver\\chromedriver_win32\\lastchromedrive\\chromedriver.exe");

	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String url = driver.getCurrentUrl();
	String expectedurl="facebooke";
	boolean ispresent = url.contains(expectedurl);
	Assert.assertTrue(ispresent, "Test case is failed please file a bug");
}
}
