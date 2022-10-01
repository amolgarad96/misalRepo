package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeOfLocatorOnFacebook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/signup");
driver.findElement(By.name("firstname")).sendKeys("PRAVIN");
driver.findElement(By.name("lastname")).sendKeys("MISAL");
driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
driver.findElement(By.id("password_step_input")).sendKeys("1234567890");
driver.findElement(By.id("day")).sendKeys("20");
driver.findElement(By.id("month")).sendKeys("Aug");
driver.findElement(By.id("year")).sendKeys("1996");




}
}
