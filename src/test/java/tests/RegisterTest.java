package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageobject.AccountCreation;
import pageobject.AccountRegister;
import pageobject.LandingPage;
import resources.Base;

public class RegisterTest extends Base {

	
	WebDriver driver;
	@Test
	public void register() throws IOException, InterruptedException {
		driver = intializeDriver();
		driver.get(prop.getProperty("url"));
		

	LandingPage landingpage = new LandingPage(driver);
	landingpage.myAccountDropdown().click();
	landingpage.registerOption().click();
	
	AccountRegister ar = new AccountRegister(driver);
	ar.firstName().sendKeys(prop.getProperty("fname"));
	Thread.sleep(1000);
	ar.lastName().sendKeys(prop.getProperty("lname"));
	Thread.sleep(1000);
	ar.emaild().sendKeys(prop.getProperty("email"));
	Thread.sleep(1000);

	ar.phoneNumber().sendKeys(prop.getProperty("phonenumber"));
	Thread.sleep(1000);

	ar.password().sendKeys(prop.getProperty("password"));
	Thread.sleep(1000);

	ar.confirmPassword().sendKeys(prop.getProperty("password"));
	Thread.sleep(1000);

	ar.subscribe().click();
	Thread.sleep(1000);

	ar.agree().click();
	Thread.sleep(1000);

	ar.register().click();
	Thread.sleep(1000);
	
	
	AccountCreation ac = new AccountCreation(driver);
	System.out.println(ac.confirm().isDisplayed());
	

	
	}
		
	@AfterTest
	public void close() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}
