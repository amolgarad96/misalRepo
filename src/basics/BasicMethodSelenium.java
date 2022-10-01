package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethodSelenium {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe" );
WebDriver driver = new ChromeDriver();//chromebrowser will open
driver.get("https://www.facebook.com/");

driver.get("https://www.amazon.com/");
//driver maximize operation
driver.manage().window().maximize();   //maximize the window.
driver.get("https://www.cricbuzz.com/");
Thread.sleep(3000);

driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().refresh();
driver.close();

}
}
