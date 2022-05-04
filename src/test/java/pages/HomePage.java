package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	//Locators of element as properties in page class
	@FindBy (linkText= "Yes")
	public WebElement agree;
	
	@FindBy(name ="searchTerm")
	protected WebElement serachbox;
	
	//Constructor method
	public HomePage(RemoteWebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Operations and observations methods
	public void cliclkAgree() throws Exception
	{
		agree.click();
		Thread.sleep(5000);
	}
	public void fillSearchboxAndClickEnter(String data) throws Exception
	{
		serachbox.sendKeys(data, Keys.ENTER);
		Thread.sleep(3000);
	}
	
}