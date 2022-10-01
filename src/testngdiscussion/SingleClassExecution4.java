package testngdiscussion;

import org.testng.annotations.Test;
//when we take duplicate priority then it can to execute on the basis of dictionary order
//then some time u not defined priority that will be zero priority it will get execute first
//priority it cannot be a fractions.
public class SingleClassExecution4 {
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
	@Test(priority=4)
	public void logout() {
		System.out.println("logout Test case");
	}
}
