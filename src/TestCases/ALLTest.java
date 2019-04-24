package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ObjectRepository.BaseClass;
import ObjectRepository.LandingApplication;
import ObjectRepository.LoginApplication;


public class ALLTest extends BaseClass {

	BaseClass b=new BaseClass();
	WebDriver driver1=b.loadBrowser();
	
	
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
	
	@BeforeTest 
	public void Login()
	{
	
		driver1.get("https://demo.axis360qa.baker-taylor.com/");
		b.WebpageWindow(driver1);
		b.Webpagewait(driver1);
		Assert.assertEquals("My Library",driver1.getTitle());
	}
	
	@Test(priority=2)
	   public void register() throws InterruptedException
		{
	    LoginApplication T=new LoginApplication(driver1);
		T.loginButton().click();
		T.register().sendKeys("BTtushar");
		T.registerButton().click();
		Assert.assertEquals("Search",driver1.getTitle());
		Thread.sleep(2000);
		
	}
	@Test(priority=1) 
	public void LandingSearchBeforeloggedIn() throws InterruptedException
	{   
		
		LandingApplication T=new LandingApplication(driver1);
		T.searchbox().sendKeys("girl");
		T.searchBoxButton().click();
		Assert.assertEquals(driver1.getTitle(),"Search");
		Thread.sleep(2000);
		
	}
	
	
	  @Test(priority=8) public void LandingWall() throws InterruptedException 
	  {
	  LandingApplication T=new LandingApplication(driver1);
	  Thread.sleep(4000);
	  Assert.assertEquals(T.CurrentlyReading().getText(),"Currently Reading"); 
	  }
	 
	 
	
	@Test(priority=0)
	  public void hamburgerTest() throws InterruptedException
	  {
		  LandingApplication T=new LandingApplication(driver1);
		  T.Hamburger().click();
		  T.BrowsebySubject().click();
		  Thread.sleep(2000);
		  Actions a=new Actions(driver1);
		  a.moveToElement(T.searchbox()).click().build().perform();
		  Thread.sleep(2000);
		  
		  //T.HamburgerClose();
		 
	}
	
	@Test(priority=3)
	  public void GeneralSettingsTest() throws InterruptedException
	  {
		  LandingApplication T=new LandingApplication(driver1);
		  T.GeneralSettings().click();
		  T.ViewSettings().click();
		  Thread.sleep(4000);
		  T.ViewSettingsClose().click();
		  
	  }
	@Test(priority=4)
	public void RefineTest() throws InterruptedException
	  {
		  LandingApplication T=new LandingApplication(driver1);
		  T.refine().click();
		  Thread.sleep(2000);
		  
		  }
	@Test(priority=5)
	public void advsearchbox() throws InterruptedException
	{
		LandingApplication T=new LandingApplication(driver1);
	
		T.advsearchbox().click();
		Thread.sleep(2000);
		T.advserachboxClose().click();
		
	}
	
	@Test(priority=6) 
	public void LandingSearchAfterLoggedIn() throws InterruptedException
	{   
		
		LandingApplication T=new LandingApplication(driver1);
		Actions a=new Actions(driver1);
		a.moveToElement(T.searchbox()).click().build().perform();
		T.searchbox().sendKeys("woman");
		T.searchBoxButton().click();
		Assert.assertEquals("Search",driver1.getTitle());
		Thread.sleep(2000);
		
	}
	@Test(priority=7)
	public void hamburgerTestMyLibrary() throws InterruptedException
	  {
		  LandingApplication T=new LandingApplication(driver1);
		  T.Hamburger().click();
		  driver1.findElement(By.xpath(".//*[@id='Id']")).click();
		  Thread.sleep(2000);
		  //T.HamburgerClose();
		 
	}
	
	@Test(priority=9)
	public void Checkout() throws InterruptedException
	{
		LandingApplication T=new LandingApplication(driver1);
		  T.Checkout().click();
		  Thread.sleep(5000);
	}
	
	@Test(priority=10)
	public void Hold() throws InterruptedException
	{
		LandingApplication T=new LandingApplication(driver1);
		Thread.sleep(4000);
		//T.Hold().click();
		Actions actions = new Actions(driver1);

		actions.moveToElement(T.Hold()).click().perform(); 
	
		Thread.sleep(3000);
		  
	}
	
	@Test(priority=11)
	public void MystuffCheckout() throws InterruptedException
	   {
		LandingApplication T=new LandingApplication(driver1);
		  T.Hamburger().click();
		 
		  Thread.sleep(2000);
		  Actions a=new Actions(driver1);
		  a.moveToElement(T.MyStuffCheckout()).doubleClick().build().perform();
		 
		  Thread.sleep(2000);
		 


		  
		  
		  //driver.findElement(By.xpath(".//*[@class='btn btn-focus btn-more-options drop-down-btn dropdown-toggle open']")).click();
		  //driver.findElement(By.xpath(".//*[@class='action-expand action-links text-uppercase btnReturn']")).click();
		  Thread.sleep(2000);
		 }
	
	@Test(priority=12)
	public void MystuffHold() throws InterruptedException
	   {
		LandingApplication T=new LandingApplication(driver1);
		T.MyStuffHold().click();
		Thread.sleep(2000);
		
	   }
	
	@Test(priority=13)
	public void MystuffWhislist() throws InterruptedException
	   {
		LandingApplication T=new LandingApplication(driver1);
		T.MyStuffWhislist().click();
		Thread.sleep(2000);
		
		
	   }	
	@Test(priority=14)
	public void logout() 
	   {
		LandingApplication T=new LandingApplication(driver1);
		T.logoutButton().click();
	   }
	@AfterTest
	public void closeBrowser() 
	   {
		driver1.close();		
		
	   }	

}
