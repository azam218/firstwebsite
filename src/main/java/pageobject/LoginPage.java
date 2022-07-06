package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="input-email")
	WebElement emailInput;
	public WebElement emailinput() {
		return emailInput;
	}
	@FindBy(id="input-password")
	WebElement passwordField;
	public WebElement passwordField() {
		return passwordField;
	}
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
	WebElement loginButton;
	public  WebElement loginButton() {
		return loginButton;
	}
	
	
}
