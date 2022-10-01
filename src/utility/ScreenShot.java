package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://zoom.us/signup");

TakesScreenshot scrshot = (TakesScreenshot)driver;
File source = scrshot.getScreenshotAs(OutputType.FILE);
String path="C:\\Users\\hp\\Downloads\\selenium\\captured screenshot\\zoomscreenshot.png";
File Destination = new File(path);
FileHandler.copy(source, Destination);
}
}
