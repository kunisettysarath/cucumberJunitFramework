package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.BaseClass;

public class AirAsiaSearchPage extends BaseClass {

	@FindBy(xpath = "//div[@class=\"product-tile-title\" and text()='Flights']")
	public WebElement flightOption;

	@FindBy(xpath = "//img[@alt=\"AirAsia logo\"]")
	public WebElement airAisaLogo;

	@FindBy(xpath = "(//input[@autocapitalize=\"sentences\"])[1]")
	public WebElement originCityField;

	@FindBy(xpath = "(//input[@autocapitalize=\"sentences\"])[2]")
	public WebElement destinationCityField;

	@FindBy(xpath = "(//input[@autocapitalize=\"sentences\"])[3]")
	public WebElement calendarField;

	@FindBy(xpath = "//div[text()='One way']")
	public WebElement onewayRadioButton;

	@FindBy(xpath = "(//div[text()='Search'])[1]")
	public WebElement searchFlightsButton;

	@FindBy(xpath = "//div[@data-focusable=\"true\"]//div[text()='Confirm']")
	public WebElement dateConfirmButton;

	@FindBy(xpath = "//h1[text()='Depart']")
	public WebElement departText;

	String dateOption = "//div[@class=\"css-1dbjc4n r-13awgt0 r-utggzx\"]//*[text()='&&']";

	String selectFlightPageHeader = "//*[text()=' && to %% ']";

	public WebElement getDateOption(String date) {
		dateOption = dateOption.replace("&&", date);
		return driver.findElement(By.xpath(dateOption));
	}

	public WebElement getSelectFlightPageHeader(String depCity, String arrCity) {
		selectFlightPageHeader = selectFlightPageHeader.replace("&&", depCity).replace("%%", arrCity);
		return driver.findElement(By.xpath(selectFlightPageHeader));
	}

}
