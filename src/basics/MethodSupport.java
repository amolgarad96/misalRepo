package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodSupport {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
    Thread.sleep(3000);
	WebElement username = driver.findElement(By.xpath("//*[@name='username']"));
	username.sendKeys("abc@abc.com");
	//verify the typed string is the same or not:
	String actual = username.getAttribute("value");
	System.out.println(actual);
	if(actual.equals("abc@abc.com")) {
		System.out.println("value got verified");
	}
	else {
		System.out.println("not matched");
	}
	//to get url of the current page
	String urlofpage = driver.getCurrentUrl();
	System.out.println(urlofpage);
	//to get the titleof page
	String titleofpage = driver.getTitle();
	System.out.println(titleofpage);
	
	
}
}
