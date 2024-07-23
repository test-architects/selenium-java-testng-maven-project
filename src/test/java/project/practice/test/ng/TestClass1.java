package project.practice.test.ng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

 

public class TestClass1 extends BaseClass {

	@BeforeClass
	public void beforeClass() {
		System.out.println("------------------BeforeClass method in TestClass1------------------");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("------------------afterClass method in TestClass1------------------");
		System.out.println();
	}

	@Test
	public void testMethod1() {
		System.out.println("TestMethod1 in TestClass1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("TestMethod2 in TestClass1");
	}
}
