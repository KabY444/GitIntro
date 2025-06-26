package Framework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import objectRepository.LandingPage;
import objectRepository.LoginPage;
import resources.Base;

public class TestCase_01 extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@Test(dataProvider = "getData")
	public void basePage(String UserName, String pass) throws IOException {
		initializeDriver();
		log.info("Driver successfully launched");
		log.info("driver.get(url) is getting invoked directly from Base class");
		LandingPage lp = new LandingPage(driver);
		LoginPage lo = lp.signIn();
		lo.email().sendKeys(UserName);
		lo.password().sendKeys(pass);
		lo.submit().click();
		lo.forgotPass().click();
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2]; // Two combination(row) , and two values(column)
		data[0][0] = "User1@abc.com";
		data[0][1] = "123456";

		data[1][0] = "User2@abc.com";
		data[1][1] = "QWERTY";

		return data;

	}

	@AfterMethod
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
