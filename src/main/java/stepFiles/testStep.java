package stepFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class testStep {
	static WebDriver wb = null;

	@Given("^I want to open the crm website$")
	public void openWebSite() throws Throwable {
//		System.out.println("in");
//		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
//		wb = new ChromeDriver();
//		wb.get("https://www.guvi.in/courses-video?course=java8");

	}

	@When("^I want to login to the application$")
	public void loginToApplication() {
		System.out.println("in the step definition");
	}

	@When("^I Maximize the browser$")
	public void maximizeApp() {
		wb.manage().window().maximize();
	}

}
