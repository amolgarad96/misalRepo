package testngdiscussion;

import org.testng.annotations.Test;

public class DependsOnMethods2 {
	
	@Test(dependsOnMethods = "testngdiscussion.DependsOnMethodsKeyword.homepage",priority=4)
public void profile() {
	System.out.println("profile Test Case");
}
    @Test(priority=5)
public void dashboard() {
	System.out.println("dashboard Test Case");
}
}
