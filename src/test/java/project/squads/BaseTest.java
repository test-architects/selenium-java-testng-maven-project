package project.squads;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	
	protected ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<WebDriver>();
	// its thread safe, webdriver instance will be unique for each test, it will
	// assist in parellel execution

	public WebDriver getWebDriver() {
		return threadLocalDriver.get();
	}
	
	public void setDriver() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		threadLocalDriver.set(driver);
	}

}
