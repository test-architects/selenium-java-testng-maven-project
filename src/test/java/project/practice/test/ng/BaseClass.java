package project.practice.test.ng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	@BeforeSuite
	public void baseClassTest() {
		System.out.println("=============================================================");
	}
	
	@AfterSuite
	public void afterClassTest() {
		System.out.println("=============================================================");
	}
	
}
