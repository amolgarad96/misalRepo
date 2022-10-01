package testngdiscussion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsKeyword {
	@Test(priority=1)
public void loginTest() {
	System.out.println("login to Application");
	//throw new ArithmeticException();
	Assert.fail("Test Case Failing deliberately");
}
	@Test(dependsOnMethods="loginTest",priority=2)
public void homepage() {
	System.out.println("login to Application");
} 
	@Test(dependsOnMethods={"homepage","loginTest"},priority=2)
public void logout() {
	System.out.println("login to Application");
}
}
