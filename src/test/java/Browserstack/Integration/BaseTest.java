package Browserstack.Integration;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	public static final String USERNAME = "";
	public static final String ACCESS_KEY = "";
	public static final String BROWSERSTACK_URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@hub.browserstack.com/wd/hub";
	
	// Parameter values will come from testng file.
	@Parameters({"browser","browser_version","os","os_version"})    // parameters should be within curly braces.
	@BeforeMethod
	public void setUp(String browserName, String browser_version, String os, String os_version) {
			
		DesiredCapabilities capabilities = new DesiredCapabilities();		
		capabilities.setCapability("browserVersion", browser_version);			
		capabilities.setCapability("os", os);
		capabilities.setCapability("osVersion", os_version);
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			capabilities.setCapability("browser", "Chrome");
		} else if(browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			capabilities.setCapability("browser", "Firefox");
		} else {
			WebDriverManager.edgedriver().setup();
			capabilities.setCapability("browser", "Edge");
		}
				
		try {
			driver = new RemoteWebDriver(new URL(BROWSERSTACK_URL), capabilities);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

}
