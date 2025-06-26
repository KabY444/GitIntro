package Framework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
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

public class ValidateText extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void preRequisites() throws IOException {
		initializeDriver();
	}
	@Test
	public void validate() throws IOException {
		// driver.get(url) is getting invoked directly from Base class
		LandingPage lp = new LandingPage(driver);
		AssertJUnit.assertEquals(lp.header().getText(), "FEATURED COURSES123");
		log.info("Successfully validated Header Text : FEATURED COURSES123");
	}
	@AfterMethod
	@AfterTest
	public void tearDown() {
		driver.close();
	}


}
