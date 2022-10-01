package testngdiscussion;

import org.testng.annotations.Test;

public class GroupingOfTestCase2 {
	@Test(groups="functional")
	public void admin() {
		System.out.println("Admin application");
	}
	@Test(groups = "Sanity")
	public void myInfo() {
		System.out.println("My Info Test case");
	}
	@Test(groups = "Regression")
	public void buyshares() {
		System.out.println("buy share Test case");
	}
	@Test(groups = "Regression")
	public void sellshares() {
		System.out.println("sell share Test case");
	} 
	@Test(groups = "Sanity")
	public void searchshare() {
		System.out.println("search share Test case");
	}
}
