package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(xpath = "//span[text()=' BIG Log in/Sign up ']")
	public WebElement loginSignUpButton;
	
	@FindBy(xpath = "//button[text()=\" Log in \"]")
	public WebElement loginButton;
	
	@FindBy(xpath = "//mat-icon[text()='error']/..//div")
	public WebElement errorMessage;
	
	@FindBy(id = "sso-login-email-input")
	public WebElement emailField;

	@FindBy(id = "sso-login-password-input")
	public WebElement passwordField;
	
}
