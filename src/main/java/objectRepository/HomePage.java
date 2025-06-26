package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private @FindBy(css = "#user_email") WebElement Email;
	private @FindBy(css = "#user_password") WebElement pwd;
	private @FindBy(xpath = "//input[@name='commit']") WebElement Submit;

	public void email() {
		Email.sendKeys("Email Text Field");
	}

	public void pd() {
		pwd.sendKeys("password text field");
	}

	public void enter() {
		Submit.click();
	}
}
