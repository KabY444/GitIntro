package objectRepository;

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

	@FindBy(css = "#user_email")
	WebElement Email;
	@FindBy(css = "#user_password")
	WebElement Password;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement Submit;
	@FindBy(xpath="//a[text()='Forgot Password?']")
	WebElement Forgot;

	public WebElement email() {
		return Email;
		
		
	}

	public WebElement password() {
		return Password;
	}

	public WebElement submit() {
		return Submit;
	}
	public WebElement forgotPass() {
		return Forgot;
	}

}
