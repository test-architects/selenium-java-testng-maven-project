package project.practice.test.ng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass2 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("------------------BeforeClass method in TestClass2------------------");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("------------------afterClass method in TestClass2------------------");
		System.out.println();
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("---------@BeforeMethod method in TestClass2--------");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("---------@AfterMethod method in TestClass2---------");
		System.out.println();
	}

	@Test
	public void testMethod1() {
		System.out.println("@Test 01 in TestClass2");
	}

	@Test
	public void testMethod2() {
		System.out.println("@Test 02 in TestClass2");
	}

	@Test
	public void testMethod3() {
		System.out.println("@Test 03 in TestClass2");
	}
}
