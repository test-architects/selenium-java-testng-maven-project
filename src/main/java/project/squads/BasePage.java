package project.squads;

import org.openqa.selenium.WebDriver;

public class BasePage {

	WebDriver driver;

	public BasePage(WebDriver driverFromChildClass) {
		this.driver = driverFromChildClass;
	}

}
