package testngdiscussion;

import org.testng.annotations.Test;

public class SingleClassExecution2 {
@Test
public void login() {
	System.out.println("login to application");
}
@Test
public void dashboard() {
	System.out.println("dashboard Test case");
}
@Test
public void profile() {
	System.out.println("profile Test case");
}
@Test
public void home() {
	System.out.println("home Test case");
}
}
