package testngdiscussion;

import org.testng.annotations.Test;

public class GroupingOfTestCase1 {
	@Test(groups = "Sanity")
	public void login() {
		System.out.println("login to application");
	}
	@Test(groups = "Sanity")
	public void dashboard() {
		System.out.println("dashboard Test case");
	}
	@Test(groups = "Regression")
	public void profile() {
		System.out.println("profile Test case");
	}
	@Test(groups = "functional")
	public void home() {
		System.out.println("home Test case");
	} 
	@Test(groups = "Sanity")
	public void logout() {
		System.out.println("logout Test case");
	}
}
