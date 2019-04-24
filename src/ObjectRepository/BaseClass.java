package ObjectRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {

	public WebDriver driver1;

	/*
	 * @Parameters("browser")
	 * 
	 * @BeforeTest public void beforeTest(String browser) {
	 * 
	 * if (browser.equalsIgnoreCase("firefox")) {
	 * 
	 * driver1 = new FirefoxDriver(); System.setProperty("webdriver.gecko.driver",
	 * "C:\\Users\\deepak.kumar\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe"
	 * );
	 * 
	 * } else if (browser.equalsIgnoreCase("Edge")) {
	 * 
	 * driver1 = new EdgeDriver(); System.setProperty("webdriver.edge.driver",
	 * "C:\\Users\\deepak.kumar\\Downloads\\MicrosoftWebDriver.exe");
	 * 
	 * } }
	 */

	
	public WebDriver loadBrowser() {
		String drivertype = "chrome";
		System.out.println("HEllo Magic");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\deepak.kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\deepak.kumar\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\deepak.kumar\\Downloads\\MicrosoftWebDriver.exe");

		if (drivertype.equals("chrome")) {
			driver1 = new ChromeDriver();
			return driver1;

		} else if (drivertype.equals("firefox")) {
			driver1 = new FirefoxDriver();
			return driver1;

		} else {
			driver1 = new EdgeDriver();
			return driver1;

		}

	}

	public void Webpagewait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

	}

	public void WebpageWindow(WebDriver driver) {
		driver.manage().window().maximize();

	}

}
