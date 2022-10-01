package testngdiscussion;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

public class AnnotationsInTestng {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before suite is executing");
	}
	@AfterSuite
	public void Aftersuite() {
		System.out.println("After suite is executing");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("before Test");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("After Test");
	}
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before Class");
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("After Class");
	}
	@BeforeMethod
	public void bm() {
		System.out.println("Before Method");
	}
	@AfterMethod
	public void am() {
		System.out.println("After Method");
	}
	
	@Test
	public void login() {
		System.out.println("login to application");
	}
	@Test
	public void logout() {
		System.out.println("logout to application");
	}
}
