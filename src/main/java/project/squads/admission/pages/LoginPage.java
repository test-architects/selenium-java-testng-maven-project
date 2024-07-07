package project.squads.admission.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import project.squads.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
}
