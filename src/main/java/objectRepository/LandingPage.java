package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Login']")
	WebElement SignIn;
	@FindBy(xpath="//h2[text()='Featured Courses']")
	WebElement Header;
	@FindBy(css="ul.nav.navbar-nav.navbar-right")
	WebElement NavBar;
	
	public LoginPage signIn() {
		 SignIn.click();
		 LoginPage lo = new LoginPage(driver);
		 return lo;
//		 lo.email().sendKeys(UserName);
//			lo.password().sendKeys(pass);
//			lo.submit().click();
//			lo.forgotPass().click();
	}
	
	public WebElement header() {
		return Header;
	}
	public WebElement navigationBar() {
		return NavBar;
	}

}
