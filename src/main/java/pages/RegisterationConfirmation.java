package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class RegisterationConfirmation extends TestBase {

	
	@FindBy(xpath="//div/h1")
	WebElement confirmRegisteration;
	
	// Initializing the Page Objects:
		public RegisterationConfirmation() {
			PageFactory.initElements(driver, this);
		}
		public String registerConfirm()
		{
			return confirmRegisteration.getText();
		}
}

