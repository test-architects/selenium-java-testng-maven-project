package project.practice.test.ng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass4 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("------------------BeforeClass method in TestClass4------------------");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("------------------afterClass method in TestClass4------------------");
		System.out.println();
	}

	@Test
	public void testMethod1() {
		System.out.println("TestMethod1 in TestClass4");
	}
}
