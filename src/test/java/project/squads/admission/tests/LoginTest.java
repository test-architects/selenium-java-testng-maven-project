package project.squads.admission.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import project.squads.BaseTest;
import project.squads.admission.pages.loginpage.LoginPage;

public class LoginTest extends BaseTest {

	LoginPage lp;

	@BeforeClass
	public void setUp() {
		setDriver();
		lp = new LoginPage(getWebDriver());
		lp.getURL();
	}

	@Test
	public void LoginWithValidCredentials() {
		lp.enterUsername("user");
		lp.enterPassword("pass");
	}

	@AfterClass
	public void quit() {
		removeDriver();
	}

}
