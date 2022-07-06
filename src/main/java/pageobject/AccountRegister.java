package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegister {
	
	WebDriver driver;
	
	public AccountRegister(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="input-firstname")
	WebElement firstName;
	public WebElement firstName() {
		return firstName;
	}
	@FindBy(id="input-lastname")
	WebElement lastName;
	public WebElement lastName() {
		return lastName;
	}
	@FindBy(id="input-email")
	WebElement emailId;
	public WebElement emaild() {
		return emailId;
	}
	@FindBy(id="input-telephone")
	WebElement phoneNumber;
	public WebElement phoneNumber() {
		return phoneNumber;
	}
	@FindBy(id="input-password")
	WebElement password;
	public  WebElement password() {
		return password;	
	}
	@FindBy(id="input-confirm")
	WebElement confirmPassword;
	public WebElement confirmPassword() {
		return confirmPassword;
	}
	@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input")
	WebElement subscribe;
	public WebElement subscribe() {
	return subscribe;
	}
	@FindBy(xpath= "//*[@id=\"content\"]/form/div/div/input[1]")
	WebElement agree;
	public WebElement agree() {
		return agree;
	}
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[2]")
	WebElement register;
	public WebElement register() {
		return register;
	}
}
