package Framework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import objectRepository.LandingPage;
import resources.Base;

public class TestCase_03 extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void preRequisites() throws IOException {
		initializeDriver();
	}
	@Test
	public void navBarValidation() throws IOException {
		// driver.get(url) is getting invoked directly from Base class
		LandingPage lp = new LandingPage(driver);
		AssertJUnit.assertTrue(lp.navigationBar().isDisplayed());
		//log.info("Navigation bar is displayed");
	}
	@AfterMethod
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
