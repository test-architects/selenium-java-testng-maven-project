package project.squads.sample.test;

import org.testng.annotations.*;

public class GroupExampleTest {

	@BeforeGroups(groups = "group1")
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

	@Test(groups = "group2")
	public void testMethod2() {
		System.out.println("Test Method 2 - Group 2");
	}

	@Test(groups = { "group1", "group2" })
	public void testMethod3() {
		System.out.println("Test Method 3 - Group 1 and Group 2");
	}

	@Test(groups = "group4")
	public void testMethod4() {
		System.out.println("Test Method 2 - Group 2");
	}
}
