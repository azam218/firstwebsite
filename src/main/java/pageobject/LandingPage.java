package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;

	public LandingPage(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	WebElement myAccountDropdown;
	
	public WebElement myAccountDropdown() {
		return myAccountDropdown;
	}
	@FindBy(linkText="Login")
	WebElement loginoption;
	
	public WebElement loginoption() {
		return loginoption;
	}
	@FindBy(linkText="Register")
	WebElement registerOption;
	
	public WebElement registerOption() {
		return registerOption;
	}
	
}

