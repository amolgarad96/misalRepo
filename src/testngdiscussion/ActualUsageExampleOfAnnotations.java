package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActualUsageExampleOfAnnotations {
	@BeforeSuite
	public void openbrowser() {
		System.out.println("opening the browser");
	}
	@AfterSuite
	public void quitbrowser() {
		System.out.println("closing the browser");
	}
	@BeforeTest
	public void NavToUrl() {
		System.out.println("Navigate To Url");
	}
	@AfterTest
	public void NavBackToOriginalUrl() {
		System.out.println("Navigate back to original Url");
	}
	@BeforeClass
	public void loginToApp() {
		System.out.println("Login To Application");
	}
	@AfterClass
	public void logoutFromApp() {
		System.out.println("Logout fromApplication");
	}
	@BeforeMethod
	public void NavToTestCaseUrl() {
		System.out.println("Navigate To Test Url");
	}
	@AfterMethod
	public void NavToBackToHome() {
		System.out.println("Navigating Back To home page");
	}
	@Test
public void loginTest() {
	System.out.println("Log in To Application");
}	
	@Test
public void logoutTest() {
	System.out.println("Logout To Application");
}
}


