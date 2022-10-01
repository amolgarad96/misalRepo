package testngdiscussion;

import org.testng.annotations.Test;

public class InclusionAndExclusionOfMethod {
	@Test
public void profile() {
	System.out.println("profile Test Case");
	
}@Test(enabled=false)
public void login() {
	System.out.println("login Test Case");
}@Test
public void home() {
	System.out.println("Home Test Case");
}
}
