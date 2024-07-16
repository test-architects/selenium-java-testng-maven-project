package project.squads.sample.test;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGExampleTest {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("=====@BeforeSuite=====");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("========@BeforeTest========");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("============@BeforeClass============");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("----------------@BeforeMethod----------------");
	}

	@Test
	public void testMethod1() {
		System.out.println("			{ @Test - Method 1}					");
	}

	@Test(dependsOnMethods = { "testMethod1" }, alwaysRun = true)
	public void testMethod2() {
		System.out.println("			{ @Test - Method 2}					");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("---------------@AfterMethod----------------");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("========@AfterClass========");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("========@AfterTest========");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("====@AfterSuite====");
	}
}
