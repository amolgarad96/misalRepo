package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe");

WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/signup");
Actions act=new Actions(driver);
act.sendKeys(Keys.TAB).perform();
act.sendKeys(Keys.TAB).sendKeys("Firstname").sendKeys(Keys.TAB).sendKeys("surnamefield").build().perform();
WebElement mobilenumber = driver.findElement(By.xpath("//*[@name='reg_email__']"));


act.click(mobilenumber).sendKeys("9876543210").build().perform();

}
}
