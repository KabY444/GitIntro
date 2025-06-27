package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	String notToBeUsed = "";

	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private @FindBy(css = "#user_email") WebElement Email;
	private @FindBy(css = "#user_password") WebElement pwd;
	private @FindBy(xpath = "//input[@name='commit']") WebElement Submit;

	public void email() {
		Email.sendKeys("Updated by GitStuff user.");
	}

	public void pd() {
		pwd.sendKeys("Updated by GitStuff user.");
	}

	public void enter() {
		Submit.click();

	}
	
	public void m4() {
		pwd.clear();
		
	}
}
