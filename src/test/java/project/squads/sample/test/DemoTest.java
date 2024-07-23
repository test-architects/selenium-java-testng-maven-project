package project.squads.sample.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import project.squads.BaseTest;

public class DemoTest extends BaseTest {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		setDriver();
		driver = getWebDriver();
	}

	@Test(description = "this test is a basic TestNG Test")
	public void getURL() {
		driver.navigate().to("https://maheshgit9637.github.io/loginForm/login.html");
	}

	@AfterClass
	public void tearDown() {
		removeDriver();
	}

}
