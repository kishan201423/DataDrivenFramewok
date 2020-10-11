package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginConfirmation extends TestBase {

	@FindBy(xpath="//div[@id='content']/h2")
	WebElement confirmLogin;
	
	// Initializing the Page Objects:
		public LoginConfirmation() {
			PageFactory.initElements(driver, this);
		}
		
		public boolean loginConfirm()
		{
			return confirmLogin.isDisplayed();
		}
}
