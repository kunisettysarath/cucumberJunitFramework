package utils;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class MasterHooks extends DriverFactory {
	
	@Before("@airAsia")
	public void airAsiaBefore() {
		driver = getDriver();
		driver.manage().window().maximize();
		driver.get("");
	}
	
	@Before("@travel")
	public void travelBefore() {
		driver = getDriver();
		driver.manage().window().maximize();
		driver.get("");
	}

	@Before("@automationPractice")
	public void automationPracticeBefore() {
		driver = getDriver();
		driver.manage().window().maximize();
		driver.get("");
	}
//remove the below after in all the screenshots
	@After("@newTours")
	public void tearDownAndScreenshotOnFailure(Scenario scenario) {
		try {
			driver.quit();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@After()
	public void commonAfter() {
		try {
			driver.quit();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
