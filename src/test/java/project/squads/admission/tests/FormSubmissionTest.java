package project.squads.admission.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import project.squads.BaseTest;
import project.squads.admission.pages.loginpage.LoginPage;

public class FormSubmissionTest extends BaseTest {

	LoginPage lp;;

	@BeforeClass
	public void setUpBroweser() {
		setDriver();
		lp = new LoginPage(getWebDriver());
	}

	@AfterClass
	public void quitBrowserSesion() {
		removeDriver();
	}

	@Test
	public void TestA() {
		System.out.println("sample test in FormSubmissionTest");
	}

}
