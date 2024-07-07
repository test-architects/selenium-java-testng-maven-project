package project.squads.admission.pages.admissionformpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import project.squads.BasePage;

public class AdmissionPage extends BasePage {

	public AdmissionPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this); // Initializes elements using PageFactory
	}

	@FindBy(xpath = "//input[@id='name']")
	private WebElement studentName;

	public void enterStudentName(String StudentName) {
		waitForElementToBeVisible(studentName, 4);
		studentName.sendKeys(StudentName);
	}

	@FindBy(id = "age")
	private WebElement studentAge;

	public void enterStudentAge(String age) {
		waitForElementToBeVisible(studentAge, 4);
		studentAge.sendKeys(age);
	}

	@FindBy(id = "gender")
	private WebElement studentGender;

	// value male
	// Female
	// value = other

	public void enterStudentGender(String gender) {
		waitForElementToBeVisible(studentGender, 4);
		Select s = new Select(studentGender);
		s.selectByVisibleText(gender);
	}

	@FindBy(id = "dob")
	private WebElement dateOfBirthInput;

	public void setDateOfBirth(String dateOfBirth) {
		waitForElementToBeVisible(dateOfBirthInput, 4);
		dateOfBirthInput.sendKeys(dateOfBirth);
	}

	@FindBy(id = "address")
	private WebElement studentAddress;

	public void enterStudentsAddress(String address) {
		waitForElementToBeVisible(studentAddress, 4);
		studentAddress.sendKeys(address);
	}

	//
	@FindBy(id = "email")
	private WebElement studentEmail;

	public void enterStudentsEmail(String email) {
		waitForElementToBeVisible(studentEmail, 4);
		studentEmail.sendKeys(email);
	}

	@FindBy(id = "contact")
	private WebElement studentContact;

	public void enterStudentsContact(String contact) {
		waitForElementToBeVisible(studentContact, 4);
		studentContact.sendKeys(contact);
	}

	@FindBy(id = "previousSchool")
	private WebElement studentPreviousSchool;

	public void enterStudentPreviousSchool(String previousSchool) {
		waitForElementToBeVisible(studentPreviousSchool, 4);
		studentPreviousSchool.sendKeys(previousSchool);
	}

	@FindBy(id = "board")
	private WebElement studentBoard;

	public void enterStudentBoard(String board) {
		waitForElementToBeVisible(studentBoard, 4);
		studentBoard.sendKeys(board);
	}

	@FindBy(id = "marks10")
	private WebElement studentMarksSSC;

	public void enterStudentMarksSSC(String marks) {
		waitForElementToBeVisible(studentMarksSSC, 4);
		studentMarksSSC.sendKeys(marks);
	}

	@FindBy(id = "marks12")
	private WebElement studentMarksHSC;

	public void enterStudentMarksHSC(String marks) {
		waitForElementToBeVisible(studentMarksHSC, 4);
		studentMarksHSC.sendKeys(marks);
	}

	@FindBy(xpath = "//input[@type='submit' and @value='Submit']")
	private WebElement submitButton;

	public void clickSubmitButton() {
		waitForElementToBeVisible(submitButton, 4);
		submitButton.click();
	}
}