package stepFiles;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.BaseClass;
import utils.TestConstants;

public class NewToursSteps extends BaseClass{
	
	@Given("^I navigate to newtours website \"([^\"]*)\"$")
	public void i_navigate_to_newtours_website(String arg1) throws Throwable {
	    openURL(arg1);
	}

	@When("^I click on register button$")
	public void i_click_on_register_button() throws Throwable {
	   clickOnElement(newToursPage.registerButton, TestConstants.TIMEOUT_PERIOD_MEDIUM);
	}

	@Then("^I verify register page is displayed$")
	public void i_verify_register_page_is_displayed() throws Throwable {
	   Assert.assertTrue("Header not displayed",isElementExists(newToursPage.registerPageHeader, TestConstants.TIMEOUT_PERIOD_MEDIUM));
	}

	@When("^I enter user firstname as \"([^\"]*)\"$")
	public void i_enter_user_firstname_as(String arg1) throws Throwable {
	   sendTextToElement(newToursPage.fistNameField, arg1, TestConstants.TIMEOUT_PERIOD_MEDIUM);
	}

	@When("^I enter user lastname as \"([^\"]*)\"$")
	public void i_enter_user_lastname_as(String arg1) throws Throwable {
		sendTextToElement(newToursPage.lastNameField, arg1, TestConstants.TIMEOUT_PERIOD_MEDIUM);
	}

	@When("^I enter user PhoneNo as \"([^\"]*)\"$")
	public void i_enter_user_PhoneNo_as(String arg1) throws Throwable {
		sendTextToElement(newToursPage.phoneField, arg1, TestConstants.TIMEOUT_PERIOD_MEDIUM);
	}

	@When("^I enter user Email as \"([^\"]*)\"$")
	public void i_enter_user_Email_as(String arg1) throws Throwable {
		sendTextToElement(newToursPage.emailField, arg1, TestConstants.TIMEOUT_PERIOD_MEDIUM);
	}

	@When("^I enter user Address as \"([^\"]*)\"$")
	public void i_enter_user_Address_as(String arg1) throws Throwable {
		sendTextToElement(newToursPage.addressField, arg1, TestConstants.TIMEOUT_PERIOD_MEDIUM);
	}

	@When("^I enter user City as \"([^\"]*)\"$")
	public void i_enter_user_City_as(String arg1) throws Throwable {
		sendTextToElement(newToursPage.cityField, arg1, TestConstants.TIMEOUT_PERIOD_MEDIUM);
	}

	@When("^I enter user State as \"([^\"]*)\"$")
	public void i_enter_user_State_as(String arg1) throws Throwable {
		sendTextToElement(newToursPage.stateField, arg1, TestConstants.TIMEOUT_PERIOD_MEDIUM);
	}

	@When("^I enter user PostalCode as \"([^\"]*)\"$")
	public void i_enter_user_PostalCode_as(String arg1) throws Throwable {
		sendTextToElement(newToursPage.postalCodeField, arg1, TestConstants.TIMEOUT_PERIOD_MEDIUM);
	}

	@When("^I enter user Country as \"([^\"]*)\"$")
	public void i_enter_user_Country_as(String arg1) throws Throwable {
	    selectBoxByVisibleText(newToursPage.countryDropDown, arg1, TestConstants.TIMEOUT_PERIOD_MEDIUM);
	}

	@When("^I enter UserName Country as \"([^\"]*)\"$")
	public void i_enter_UserName_Country_as(String arg1) throws Throwable {
		sendTextToElement(newToursPage.userNameField, arg1, TestConstants.TIMEOUT_PERIOD_MEDIUM);
	}

	@When("^I enter Password Country as \"([^\"]*)\"$")
	public void i_enter_Password_Country_as(String arg1) throws Throwable {
		sendTextToElement(newToursPage.passwordField, arg1, TestConstants.TIMEOUT_PERIOD_MEDIUM);
	}

	@When("^I enter Confirm Password Country as \"([^\"]*)\"$")
	public void i_enter_Confirm_Password_Country_as(String arg1) throws Throwable {
		sendTextToElement(newToursPage.confirmPasswordField, arg1, TestConstants.TIMEOUT_PERIOD_MEDIUM);
	}
	
	@When("^I click on submit button$")
	public void i_click_on_submit_button() throws Throwable {
		clickOnElement(newToursPage.submitButton, TestConstants.TIMEOUT_PERIOD_MEDIUM);
	}

	@Then("^I verify user is registered$")
	public void i_verify_user_is_registered() throws Throwable {
		 Assert.assertTrue("login successfull message not displayed"
				 ,isElementExists(newToursPage.registerSuccessfullMessage, TestConstants.TIMEOUT_PERIOD_MEDIUM));
	}


}
