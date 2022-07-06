package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreation {
	WebDriver driver;
	
	public AccountCreation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"content\"]/h1")
	WebElement confirm;
	public WebElement confirm() {
		return confirm;
	}
}
