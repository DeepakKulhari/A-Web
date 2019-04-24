package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginApplication extends BaseClass {
	
	public LoginApplication(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver1=driver;
	}
	
	By loginButton=By.xpath(".//*[@id='loginBtn']");
	By register=By.xpath(".//*[@name='LogOnModel_UserName']");
	By registerButton=By.xpath(".//*[@class='btn btn-Popuplogin waves-effect waves-dark text-uppercase']");
	
	
	public WebElement loginButton()
	{
		return driver1.findElement(loginButton);
	}
	public WebElement register()
	{
		return driver1.findElement(register);
	}
	public WebElement registerButton()
	{
		return driver1.findElement(registerButton);
		
	}


}
