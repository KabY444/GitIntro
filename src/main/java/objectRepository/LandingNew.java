package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingNew {
	WebDriver driver;

	public LandingNew(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private @FindBy(xpath = "//span[text()='Login']") WebElement SignIn;
	private @FindBy(xpath = "//h2[text()='Featured Courses']") WebElement Header;

	public String headLine() {
		return Header.getText();
	}

	public HomePage logIn() {
		SignIn.click();
		HomePage hp = new HomePage(driver);
		return hp;
	}
}
