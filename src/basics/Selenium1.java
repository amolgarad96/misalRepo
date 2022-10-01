package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Selenium1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe");

ChromeDriver cd= new ChromeDriver();//chrome browse willget open.
RemoteWebDriver rd= new ChromeDriver();//chrome browser will get open.
WebDriver driver = new ChromeDriver();//chrome browser will get open.
	
}
}
