package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeOfLocator {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe");

WebDriver driver= new ChromeDriver();//chrome will get open
driver.manage().window().maximize();//maximize the window
driver.get("https://opensource-demo.orangehrmlive.com/");
//locate the element we have to use find element method.
WebElement username = driver.findElement(By.id("txtUsername"));
//to type over the web element we have to use sendkeys();
username.sendKeys("Admin");
WebElement password = driver.findElement(By.id("txtPassword"));
password.sendKeys("admin123");
driver.findElement(By.name("Submit")).click();
//driver.findElement(By.className("button")).click();
//driver.findElement(By.linkText("Forgot your password?")).click();
//driver.findElement(By.partialLinkText("got")).click();


}
}
