package project.squads.admission.pages.loginpage;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import project.squads.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement usernameTextBox;

	@FindBy(name = "password")
	private WebElement passwordTextBox;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;

	public boolean isUserOnLoginPage() {
		waitForElementToBeVisible(usernameTextBox, 5);
		if (driver.getTitle() == "Login Page") {
			System.out.println("user is on login page");
			return true;
		} else {
			System.out.println("user is not on login page");
			return false;
		}
	}

	public void enterUsername(String username) {
		waitForElementToBeVisible(usernameTextBox, 5);
		usernameTextBox.clear();
		usernameTextBox.sendKeys(username);
		System.out.println("succesfully entered the username as :" + username);
	}

	public void enterPassword(String password) {
		waitForElementToBeVisible(passwordTextBox, 5);
		passwordTextBox.clear();
		passwordTextBox.sendKeys(password);
		System.out.println("succesfully entered the password as :" + password);

	}

	public void clickLoginButton() {
		loginButton.click();
	}

	public boolean isAlertPresent() {
		boolean flag = false;
		try {
			driver.switchTo().alert();
			flag = true;
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			flag = false;
		}
		return flag;
	}

}
