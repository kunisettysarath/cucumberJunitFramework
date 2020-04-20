package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewToursPage {
	
	@FindBy(linkText = "REGISTER")
	public WebElement registerButton;
	
	@FindBy(xpath = "//img[@src=\"/images/masts/mast_register.gif\"]")
	public WebElement registerPageHeader;
	
	@FindBy(name = "firstName")
	public WebElement fistNameField;
	
	@FindBy(name = "lastName")
	public WebElement lastNameField;
	
	@FindBy(name = "phone")
	public WebElement phoneField;
	
	@FindBy(name = "address1")
	public WebElement addressField;
	
	@FindBy(name = "city")
	public WebElement cityField;
	
	@FindBy(name = "state")
	public WebElement stateField;
	
	@FindBy(name = "postalCode")
	public WebElement postalCodeField;
	
	@FindBy(name = "country")
	public WebElement countryDropDown;
	
	@FindBy(id = "userName")
	public WebElement emailField;
	
	@FindBy(name = "email")
	public WebElement userNameField;
	
	@FindBy(name = "password")
	public WebElement passwordField;
	
	@FindBy(name = "confirmPassword")
	public WebElement confirmPasswordField;
	
	@FindBy(name = "register")
	public WebElement submitButton;
	
	@FindBy(xpath = "//*[contains(text(),'Thank you for registering')]")
	public WebElement registerSuccessfullMessage;
	
	
}
