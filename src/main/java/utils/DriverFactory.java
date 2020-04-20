package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import pages.AirAsiaSearchPage;
import pages.LoginPage;
import pages.NewToursPage;

public class DriverFactory {
	public static WebDriver driver = null;
	public static AirAsiaSearchPage airAsiaPage;
	public static LoginPage loginPage;
	public static NewToursPage newToursPage;
	String browserType = PropertyUtil.getData("browserName");

	DriverFactory(){
		
		System.out.println("constructor");
	}
	
	public WebDriver getDriver() {
		if (browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", PropertyUtil.getData("chromeDriverPath"));
			driver = new ChromeDriver();
		} else if (browserType.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", PropertyUtil.getData("ieDriverPath"));
			driver = new InternetExplorerDriver();

		}
		airAsiaPage = PageFactory.initElements(driver, AirAsiaSearchPage.class);
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		newToursPage = PageFactory.initElements(driver, NewToursPage.class);
		return driver;
	}

}
	