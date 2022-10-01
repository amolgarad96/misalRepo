package testngdiscussion;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {
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
	@Test
	public void login() {
		System.out.println("login to application");
	}
	@Test
	public void dashboard() {
		System.out.println("dashboard Test case");
	}
}
