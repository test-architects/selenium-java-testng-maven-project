package project.squads.sample.test;

import org.testng.annotations.*;

public class GroupExampleTest {

	@BeforeGroups(groups = { "group1", "group2" })
	public void beforeGroupSetup() {
		System.out.println("Before Group Setup");
	}

	@AfterGroups(groups = { "group1", "group2" })
	public void afterGroupTeardown() {
		System.out.println("After Group Teardown");
	}

	@Test(groups = "group1")
	public void testMethod1() {
		System.out.println("Test Method 1 - Group 1");
	}
	
	@Test(groups = "group1")
	public void testMethod11() {
		System.out.println("Test Method 11 - Group 1");
	}

	@Test(groups = "group2")
	public void testMethod2() {
		System.out.println("Test Method 2 - Group 2");
	}

}
