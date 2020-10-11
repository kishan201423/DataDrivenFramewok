package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(css = "input[name='email']")
	WebElement email;
	
	@FindBy(css = "input[name='password']")
	WebElement password;
	
	@FindBy(css = "input[type='submit']")
	WebElement submitButton;
	
	@FindBy(xpath = "//div[@class='well']/h2)[2]")
	WebElement loginPage;
	
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	public LoginConfirmation login(String UiEmail, String Uipassword)
	{
		email.sendKeys(UiEmail);
		password.sendKeys(Uipassword);
		submitButton.submit();
		return new LoginConfirmation();
		
	}
	

}
