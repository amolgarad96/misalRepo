package handlingdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagDropDownHandling {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.facebook.com/signup");
	WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
	Select sel=new Select(day);
	sel.selectByVisibleText("20");
	//2nd way to define
	WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
	Select selmonth =new Select(month);
	selmonth.selectByValue("8");
	//3rd way 
	WebElement year = driver.findElement(By.xpath("//*[@id='year'']"));
	Select selyear=new Select(year);
	selyear.selectByIndex(10);
	
	//WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
	//Select sel1=new Select(month);
	//sel1.selectByVisibleText("Aug");
	//Thread.sleep(5000);
	//WebElement year = driver.findElement(By.xpath("//*[@id='year'']"));
	//Select sel2=new Select(year);
	//sel2.selectByVisibleText("1996");
	
}
}
