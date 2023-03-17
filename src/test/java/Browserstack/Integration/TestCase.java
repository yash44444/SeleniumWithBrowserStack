package Browserstack.Integration;

import org.testng.annotations.Test;

public class TestCase extends BaseTest {
	
	@Test
	public void browserStackTest() {
		
		driver.get("https://automate.browserstack.com/dashboard/v2/quick-start/get-started");
		driver.quit();
		
	}

}
