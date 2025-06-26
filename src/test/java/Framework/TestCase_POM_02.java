package Framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objectRepository.HomePage;
import objectRepository.LandingNew;
import resources.Base;

public class TestCase_POM_02 extends Base {
	@BeforeTest
	public void setUp() throws IOException {
		initializeDriver();
	}

	@Test
	public void TC02() {
		LandingNew ln = new LandingNew(driver);
		HomePage obj = ln.logIn();
		obj.email();
		obj.pd();
		obj.enter();
		
	}

}
