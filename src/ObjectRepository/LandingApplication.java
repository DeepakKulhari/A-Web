package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LandingApplication extends BaseClass {

	public LandingApplication(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver1 = driver;
	}

	By searchbox = By.xpath(".//*[@id='txtSearch']");
	By searchBoxButton = (By.xpath(".//*[@class='input-group-btn']"));
	By advsearchbox = By.xpath(".//*[@id='advanceSearchLink']");
	By advsearchboxClose = By.xpath(".//*[@id='advanceSearchCloseBtn']");
	By logoutButton = By.xpath(".//*[@id='btnLogout']");
	By accountSettings = By.xpath(".//*[@class='ico acoountIcon-color']");
	By refine = By.xpath(".//*[@class='breadcrumb-search-refiner-right']");
	By hamburger = By.xpath(".//*[@id='toggle']");
	By hamburgeclose = By.xpath(".//*[@id='']");
	By CurrentlyReading = By.xpath(".//*[@class='list-Header']");
	By GeneralSettings = By.xpath(".//*[@class='btn-empty accountSettingsBtn']");
	By viewSettings = By.xpath(".//*[@class='btn btn-accountPopup-submit waves-effect waves-dark text-uppercase']");
	By viewSettingsClose = By.xpath(".//*[@class='btn btn-empty accountSettingsCloseBtn']");
	By BrowseBySubject = By.xpath(".//*[@id='browseBySubject']");
	By Checkout = By.xpath("//div[@class='pull-right']//button[@class='btn btn-flat text-uppercase btnCheckoutNow']");
	By Hold = By.xpath("//div[@class='pull-right']//button[@class='btn btn-flat text-uppercase btnAddHold']");
	By MystuffCheckout = (By.xpath(".//*[@class='sidebar-badge']"));
	By MystuffHold = (By.xpath(".//*[@class='inactive']"));
	By MystuffWhislist = (By.xpath(".//*[@class='leftnavlinks menuItem']/following-sibling::li[2]"));

	public WebElement searchbox() {
		return driver1.findElement(searchbox);

	}

	public WebElement searchBoxButton() {
		return driver1.findElement(searchBoxButton);

	}

	public WebElement advsearchbox() {
		return driver1.findElement(advsearchbox);

	}

	public WebElement logoutButton() {
		return driver1.findElement(logoutButton);

	}

	public WebElement accountSettings() {
		return driver1.findElement(accountSettings);

	}

	public WebElement refine() {
		return driver1.findElement(refine);

	}

	public WebElement CurrentlyReading() {
		return driver1.findElement(CurrentlyReading);

	}

	public WebElement Hamburger() {
		return driver1.findElement(hamburger);
	}

	public WebElement HamburgerClose() {
		return driver1.findElement(hamburgeclose);
	}

	public WebElement GeneralSettings() {
		return driver1.findElement(GeneralSettings);

	}

	public WebElement ViewSettings() {
		return driver1.findElement(viewSettings);

	}

	public WebElement ViewSettingsClose() {
		return driver1.findElement(viewSettingsClose);

	}

	public WebElement advserachboxClose() {
		return driver1.findElement(advsearchboxClose);

	}

	public WebElement BrowsebySubject() {
		return driver1.findElement(BrowseBySubject);

	}

	public WebElement Checkout() {
		return driver1.findElement(Checkout);
	}

	public WebElement Hold() {
		return driver1.findElement(Hold);
	}

	public WebElement MyStuffCheckout() {
		return driver1.findElement(MystuffCheckout);
	}

	public WebElement MyStuffHold() {
		return driver1.findElement(MystuffHold);
	}

	public WebElement MyStuffWhislist() {
		return driver1.findElement(MystuffWhislist);
	}
}
