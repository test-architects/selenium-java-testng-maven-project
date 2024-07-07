package project.squads.admission.pages.confirmationpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import project.squads.BasePage;

public class ConfirmationPage extends BasePage {

	public ConfirmationPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this); // Initializes elements using PageFactory
	}

	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	private WebElement DownloadForm;

	public void downloadSubmittedForm() {
		waitForElementToBeVisible(DownloadForm, 4);
		DownloadForm.click();
	}

	@FindBy(xpath = "//button[contains(text(),'Go Back')]")
	private WebElement GoBackToLoginPage;

	public void goBackToLoginPage() {
		waitForElementToBeVisible(GoBackToLoginPage, 4);
		GoBackToLoginPage.click();
	}

	public void acceptAlert() {
		waitForAlertToBeDisplayed(4);
		driver.switchTo().alert().accept();
	}

}
