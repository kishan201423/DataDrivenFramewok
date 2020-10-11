package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage  extends TestBase{
	
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement myAccount;
	
	@FindBy(css=("a[href*='https://opencart.abstracta.us:443/index.php?route=account/register']"))
	WebElement register;
	
	@FindBy(css=("a[href='https://opencart.abstracta.us:443/index.php?route=account/login']"))
	WebElement login;
	
	@FindBy(xpath=("//td[@data-handler='selectDay']"))
	WebElement datePicker;
	
	@FindBy(xpath ="//img[@title='Your Store']")
	WebElement siteLogo;
	
	// Initializing the Page Objects:
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		public void clickMyaccount()
		{
			myAccount.click();
		}
		
		public LoginPage clickLogin()
		{
			login.click();
			return new LoginPage();
		}
		
		public Register clickRegister()
		{
			register.click();
			return new Register();
		}
		
		public boolean siteLogoValidate()
		{
			return siteLogo.isDisplayed();
		}

}
