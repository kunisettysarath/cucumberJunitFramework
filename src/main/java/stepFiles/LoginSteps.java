package stepFiles;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.BaseClass;
import utils.TestConstants;

public class LoginSteps extends BaseClass{
	
	@When("^I click on Log In/Sign Up button on the home page$")
	public void i_click_on_Log_In_Sign_Up_button_on_the_home_page() throws Throwable {
	    clickOnElement(loginPage.loginSignUpButton, TestConstants.TIMEOUT_PERIOD_LONG);
	}

	@Then("^I verify that login modal is displayed$")
	public void i_verify_that_login_modal_is_displayed() throws Throwable {
	   isElementExists(loginPage.emailField, TestConstants.TIMEOUT_PERIOD_MEDIUM);
	}

	@When("^I enter \"([^\"]*)\" as username$")
	public void i_enter_as_username(String username) throws Throwable {
	   sendTextToElement(loginPage.emailField, username, TestConstants.TIMEOUT_PERIOD_MEDIUM);
	}

	@When("^I enter \"([^\"]*)\" as password$")
	public void i_enter_as_password(String password) throws Throwable {
		sendTextToElement(loginPage.passwordField, password, TestConstants.TIMEOUT_PERIOD_MEDIUM);
	}

	@When("^I click on Log in button$")
	public void i_click_on_Log_in_button() throws Throwable {
		clickOnElement(loginPage.loginButton, TestConstants.TIMEOUT_PERIOD_LONG);
	}

	@Then("^I verify \"([^\"]*)\" error message is displayed$")
	public void i_verify_error_message_is_displayed(String errMessage) throws Throwable {
	    Assert.assertTrue("expected error message not displaye",getElementText(loginPage.errorMessage, TestConstants.TIMEOUT_PERIOD_LONG).contains(errMessage));
	}

}
