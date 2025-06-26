package Framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objectRepository.HomePage;
import objectRepository.LandingNew;
import resources.Base;

public class TestCase_POM extends Base {
	@BeforeTest
	public void setUp() throws IOException {
		initializeDriver();
	}
	@Test
	public void TC01() {
		LandingNew ln = new LandingNew(driver);
		Assert.assertEquals(ln.headLine(), "FEATURED COURSES");
	}
	
}
