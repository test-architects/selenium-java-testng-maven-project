package project.squads;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	String global_properties_file = System.getProperty("user.dir") + "\\global_properties_file.properties";

	protected ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<WebDriver>();
	// its thread safe, webdriver instance will be unique for each test, it will
	// assist in parellel execution

	public void setDriver() {

		WebDriver driver = null;
		Properties prop = new Properties();

		try (FileInputStream fis = new FileInputStream(new File(global_properties_file))) {

			prop.load(fis);

			String browserName = prop.getProperty("browser");

			if ((browserName.toLowerCase()).contains("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if ((browserName.toLowerCase()).contains("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if ((browserName.toLowerCase()).contains("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}

		} catch (IOException e) {
			System.out.println("IOException in base page class with setDriver method");
		}

		threadLocalDriver.set(driver);
	}

	public WebDriver getWebDriver() {
		return threadLocalDriver.get();
	}

	// Method to close the WebDriver instance for the current thread
	public void removeDriver() {
		WebDriver driver = getWebDriver();
		if (driver != null) {
			driver.quit();
			threadLocalDriver.remove();
		}
	}

}
