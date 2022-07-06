package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.AccountPage;
import pageobject.LandingPage;
import pageobject.LoginPage;
import resources.Base;

public class SuperLoginTest extends Base{
	
	
	
	WebDriver driver;
	@Test(dataProvider= "getLoginData")
	public void login(String email, String password, String status) throws IOException, InterruptedException {
		

	
	LandingPage landingpage = new LandingPage(driver);
	landingpage.myAccountDropdown().click();
	landingpage.loginoption().click();
	Thread.sleep(3000);
	LoginPage loginpage = new LoginPage(driver);
	loginpage.emailinput().sendKeys(email);
	loginpage.passwordField().sendKeys(password);
	loginpage.loginButton().click();
	
	AccountPage accountpage = new AccountPage(driver);
	String actualResult;
	try {
	accountpage.accountInfo().isDisplayed(); 
		actualResult = "success";
		System.out.println("inside try block");
	}catch(Exception e) {
		actualResult = "failure";
		System.out.println("inside catch block");
	}
	Assert.assertEquals(actualResult, status);
	}
	@DataProvider
	public Object[][] getLoginData(){
		Object[][]data = {{"qwertyu@hotmail.com","admin123","success"},{"ghasgj@gmail.com","fsdafh","failure"}};
		return data;
	}
	
	@BeforeMethod
	public void openApplication() throws IOException {
		driver = intializeDriver();	
		driver.get(prop.getProperty("url"));
	}
	 
	@AfterMethod
	public void closure() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

	
	
}
