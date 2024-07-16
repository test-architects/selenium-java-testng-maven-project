package project.squads.admission.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import project.squads.BaseTest;
import project.squads.admission.pages.admissionformpage.AdmissionPage;
import project.squads.admission.pages.confirmationpage.ConfirmationPage;
import project.squads.admission.pages.loginpage.LoginPage;

public class FormSubmissionTest extends BaseTest {

	WebDriver driver;

	LoginPage lp;
	AdmissionPage ap;
	ConfirmationPage cp;

	@BeforeClass
	public void setUpBroweser() {
		setDriver();
		driver = getWebDriver();
	}

	@AfterClass
	public void quitBrowserSesion() {
		removeDriver();
	}

	@Test(priority = 1)
	public void LoginValidUser() {
		lp = new LoginPage(driver);
		lp.getURL();
		lp.enterUsername("user");
		lp.enterPassword("pass");
		lp.clickLoginButton();
	}

	@Test(priority = 2, dependsOnMethods = { "LoginValidUser" })
	public void FillFormAndSubmit() {
		ap = lp.GetAdmissionPage();
		ap.enterStudentName("John K meyors");
		ap.enterStudentAge("30");
		ap.enterStudentGender("Female");
		ap.setDateOfBirth("10-10-1995");
		ap.enterStudentsAddress("789 Maple Lane, Toronto, ON M5J 2S3, Canada");
		ap.enterStudentsEmail("xyz@gmail.com");
		ap.enterStudentsContact("1234567890");
		ap.enterStudentPreviousSchool("ZPHS old school");
		ap.enterStudentBoard("State Board");
		ap.enterStudentMarksSSC("90.15");
		ap.enterStudentMarksHSC("80");
		ap.clickSubmitButton();
		ap.hardWait(4000);
	}

	@Test(priority = 3, dependsOnMethods = "FillFormAndSubmit")
	public void ValidateConfirmationPage() {
		cp = ap.GetConfirmationPage();
		cp.downloadSubmittedForm();
		cp.acceptAlert();
		cp.hardWait(4000);
	}
}
