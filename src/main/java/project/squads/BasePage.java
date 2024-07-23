package project.squads;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	protected WebDriver driver;
	protected WebDriverWait wait;

	public BasePage(WebDriver driverFromChildClass) {
		this.driver = driverFromChildClass;
	}

	public void hardWait(int n) {
		try {
			Thread.sleep(n);
		} catch (Exception e) {
			System.out.println("BasePage.hardWait() method caused this program to stop executing, +/n"
					+ "check the method or delete it");
		}
	}
	/*
	 * this method (Thread.sleep(n);) shall not be used in real time projects as it
	 * can lead issues while execution of java program
	 * 
	 * in later part of work we will use
	 * "import java.util.concurrent.ScheduledExecutorService;"
	 * 
	 * as of now we are using this for test and debug purposes
	 */

	public void waitForElementToBeVisible(WebElement element, int waitForSeconds) {
		// WebElement element = driver.findElement(By.xpath("")); such kind of elements
		boolean isDisplayed = false;
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(waitForSeconds));
			WebElement displayedWebelement = wait.until(ExpectedConditions.visibilityOf(element));
			isDisplayed = displayedWebelement.isDisplayed();
		} catch (NoSuchElementException e) {
			System.out.println("web element : " + element + "is not displayed in " + waitForSeconds + " seconds");
		}
		//System.out.println("is element : " + element + " displayed ? : " + isDisplayed);
	}

	public void waitForAlertToBeDisplayed(int waitForSeconds) {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(waitForSeconds));
			wait.until(ExpectedConditions.alertIsPresent());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
