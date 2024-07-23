package project.practice.test.ng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestClass3 {

	@BeforeGroups(groups = { "smoke" })
	public void beforeGroupsMethodForSmoke() {
		System.out.println("(((((((@BeforeGroups for smoke method in TestClass3)))))))");
	}

	@AfterGroups(groups = "smoke")
	public void afterGroupsMethodForSmoke() {
		System.out.println("(((((((@AfterGroups for smoke method in TestClass3)))))))");
	}

	@BeforeGroups(groups = { "regression" })
	public void beforeGroupsMethodForRegressoin() {
		System.out.println("(((((((@BeforeGroups for regression method in TestClass3)))))))");
	}

	@AfterGroups(groups = "regression")
	public void afterGroupsMethodForRegressoin() {
		System.out.println("(((((((@AfterGroups for regression method in TestClass3)))))))");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("------------------BeforeClass method in TestClass3------------------");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("------------------afterClass method in TestClass3------------------");
		System.out.println();
	}

	@Test(groups = { "smoke", "regression" })
	public void testMethod1() {
		System.out.println("TestMethod1 in TestClass3");
	}

	@Test(groups = "regression")
	public void testMethod2() {
		System.out.println("TestMethod2 in TestClass3");
	}

	@Test(groups = "smoke")
	public void testMethod3() {
		System.out.println("TestMethod3 in TestClass3");
	}
}
