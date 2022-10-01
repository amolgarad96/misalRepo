package handlingdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingOfBootStrapDropDownHandle {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://zoom.us/signup");
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")).click();
WebElement month = driver.findElement(By.xpath("//*[@id='select-0']"));
month.click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id='select-item-select-0-5']")).click();
Thread.sleep(2000);
WebElement day = driver.findElement(By.xpath("//*[@id='select-1']"));
day.click();
Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id='select-item-select-1-4']")).click();
Thread.sleep(2000);
WebElement year = driver.findElement(By.xpath("//*[@id='select-2']"));
year.click();
driver.findElement(By.xpath("//*[@id='select-item-select-2-5']")).click();
}
}
