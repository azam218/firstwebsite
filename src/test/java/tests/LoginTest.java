package tests;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pageobject.AccountPage;
import pageobject.LandingPage;
import pageobject.LoginPage;
import resources.Base;

public class LoginTest extends Base{

	WebDriver driver;
	@Test
	public void login() throws IOException, InterruptedException {
		
	driver = intializeDriver();	
	driver.get(prop.getProperty("url"));
	
	LandingPage landingpage = new LandingPage(driver);
	landingpage.myAccountDropdown().click();
	
	landingpage.loginoption().click();
	Thread.sleep(3000);
	LoginPage loginpage = new LoginPage(driver);
	loginpage.emailinput().sendKeys(prop.getProperty("email"));
	loginpage.passwordField().sendKeys(prop.getProperty("password"));
	loginpage.loginButton().click();
	
	AccountPage accountpage = new AccountPage(driver);
	Assert.assertTrue(accountpage.accountInfo().isDisplayed()); 
	
	}
	@AfterMethod
	public void closure() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
	
}
