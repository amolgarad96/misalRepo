package handlingpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopupHandling {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
	driver.get("https://groww.in/");
driver.findElement(By.xpath("//*[@class='btn51Btn btn51RipplePrimary btn51Primary']//div//span//span[text()='Login/Register']")).click();
driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("abc@abc.com");
driver.findElement(By.xpath("//*[@class='btn51Btn btn51RipplePrimary btn51Primary']//div//span//span[text()='Continue']")).click();



}
}
