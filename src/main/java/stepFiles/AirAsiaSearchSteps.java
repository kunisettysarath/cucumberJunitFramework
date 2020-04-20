package stepFiles;

import org.junit.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AirAsiaSearchPage;
import utils.BaseClass;
import utils.TestConstants;

public class AirAsiaSearchSteps extends BaseClass {

	@Given("^I navigate to air asia website$")
	public void i_navigate_to_air_asia_website(DataTable table) {
		openURL(table.raw().get(0).get(0));
	}

	@Then("^I verify the title of the website should be as \"([^\"]*)\"$")
	public void i_verify_the_title_of_the_website_should_be_as(String titleName) {
		waitForElement(airAsiaPage.airAisaLogo, TestConstants.TIMEOUT_PERIOD_LONG);
		Assert.assertTrue(titleName+" title is not matching with the obtained "+getWebPageTitle(),
				titleName.equals(getWebPageTitle()));
	}

	@When("^I click on the flight option on the home page$")
	public void i_click_on_the_flight_option_on_the_home_page() {
		clickOnElement(airAsiaPage.flightOption, TestConstants.TIMEOUT_PERIOD_SHORT);
	}

	@When("^I enter \"([^\"]*)\" as origin city$")
	public void i_enter_as_origin_city(String originCity) {
		TestConstants.DEPARTURE_CITY = originCity;
		sendTextToElement(airAsiaPage.originCityField, originCity, TestConstants.TIMEOUT_PERIOD_MINIMUM);
	}

	@When("^I enter \"([^\"]*)\" as destination city$")
	public void i_enter_as_destination_city(String destinationCity) {
		TestConstants.ARRIVAL_CITY = destinationCity;
		sendTextToElement(airAsiaPage.destinationCityField, destinationCity, TestConstants.TIMEOUT_PERIOD_MINIMUM);
	}

	@When("^I click on calendar option$")
	public void i_click_on_calendar_option() {
		clickOnElement(airAsiaPage.calendarField, TestConstants.TIMEOUT_PERIOD_MINIMUM);
	}

	@When("^I click on oneway as a trip type$")
	public void i_click_on_oneway_as_a_trip_type() {
		clickOnElement(airAsiaPage.onewayRadioButton, TestConstants.TIMEOUT_PERIOD_MINIMUM);
	}

	@When("^I select departure date as \"([^\"]*)\"$")
	public void i_select_departure_date_as_today_s_date_plus(String departDate) {
		clickOnElement(airAsiaPage.getDateOption(departDate), TestConstants.TIMEOUT_PERIOD_MINIMUM);
	}

	@When("^I click on confirm button$")
	public void i_click_on_confirm_button() {
		clickOnElement(airAsiaPage.dateConfirmButton, TestConstants.TIMEOUT_PERIOD_MINIMUM);
	}

	@When("^I click on search button$")
	public void i_click_on_search_button() {

	}

	@Then("^I verify user is navigated to select flight page$")
	public void i_verify_user_is_navigated_to_select_flight_page() {
		waitForElement(airAsiaPage.departText, TestConstants.TIMEOUT_PERIOD_MAX);
		isElementExists(airAsiaPage.getSelectFlightPageHeader(
				TestConstants.DEPARTURE_CITY, TestConstants.ARRIVAL_CITY), TestConstants.TIMEOUT_PERIOD_LONG);
	}
}
