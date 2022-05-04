package gluecode;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class StepDef1 
{
	public Shared sh;
	//Dependency injection via constructor
	public StepDef1(Shared x)
	{
		sh=x;
	}
	//Step definitions
	@Given("open {string} browser")
	public void method1(String bn)
	{
		if(bn.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			sh.driver=new ChromeDriver();
		}
		else
		{
			WebDriverManager.firefoxdriver().setup();
			sh.driver=new FirefoxDriver();
			
		sh.obj=new HomePage(sh.driver);
	    }
	}
	@When("i launch {string} site")
	public void method2(String url) throws Exception
	{
		sh.driver.get(url);
		Thread.sleep(5000);
		sh.obj.cliclkAgree();
	}
	
}