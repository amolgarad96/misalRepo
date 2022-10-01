package testngdiscussion;

import org.testng.annotations.Test;

public class SingleClassExecution3 {
	@Test(priority=1)
	public void login() {
		System.out.println("login to application");
	}
	@Test(priority=2)
	public void dashboard() {
		System.out.println("dashboard Test case");
	}
	@Test(priority=4)
	public void profile() {
		System.out.println("profile Test case");
	}
	@Test(priority=3)
	public void home() {
		System.out.println("home Test case");
	} 
	@Test(priority=5)
	public void logout() {
		System.out.println("logout Test case");
	}
}
