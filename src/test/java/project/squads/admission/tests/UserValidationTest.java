package project.squads.admission.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import project.squads.BaseTest;
import project.squads.admission.pages.loginpage.LoginPage;

public class UserValidationTest extends BaseTest {

	WebDriver driver;

	@BeforeClass
	public void setUpWebBrowser() {
		setDriver();
		driver = getWebDriver();
	}

	@AfterClass
	public void setDownWebBrowser() {
		removeDriver();
	}

	@Test(dataProvider = "invalidUsersList")
	public void invalidUsersShouldNotLogin(String user, String pass) {

		LoginPage lp = new LoginPage(driver);
		lp.getURL();
		lp.enterUsername(user);
		lp.enterPassword(pass);
		lp.clickLoginButton();
		lp.acceptAlertIfUserCredentialsAreInvalid();
		lp.hardWait(2000);
	}

	@DataProvider
	public Object[][] invalidUsersList() {
		return new Object[][] { { "user01", "pass" }, { "user", "pass01" }, { "user01", "pass01" } };
	}

}
