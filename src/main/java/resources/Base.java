package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;

	public WebDriver initializeDriver() throws IOException {
		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		String key = prop.getProperty("url");
		String website = prop.getProperty("url");

		if (browserName.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Automation_WorkSpace\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		if (website.equalsIgnoreCase(key)) {
			driver.get(key);
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

//	public void getScreenshot(String TestCase,WebDriver driver) throws IOException {
//		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		//String path = "D:\\Projects_SS"+TestCase+".png";
//		FileUtils.copyFile(src,new File("D://Projects_SS//Screenshot.png"));
//		
//	}

}
