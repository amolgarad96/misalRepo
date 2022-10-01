package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MonthDropDown {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.facebook.com/signup");
List<WebElement> monthdropdown = driver.findElements(By.xpath("//select[@id='month']//option"));
for(WebElement value:monthdropdown) {
	String d = value.getText();
	System.out.println(d);
	if(d.equals("Aug")) {
		value.click();
	}
}
}
}
