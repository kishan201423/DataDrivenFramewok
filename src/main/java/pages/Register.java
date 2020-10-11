package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;


public class Register extends TestBase{

	@FindBy(xpath = "//div[@id='content']/h1")
	WebElement registerPage;
	
	@FindBy(xpath = "//input[@name='firstname']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@name='lastname']")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@name='telephone']")
	WebElement telephone;
	
	@FindBy(xpath = "//input[@name='address_1']")
	WebElement address1;
	
	@FindBy(xpath = "//input[@name='city']")
	WebElement city;
	
	@FindBy(xpath = "//input[@name='postcode']")
	WebElement postalCode;
	
	@FindBy(xpath = "//select[@name='country_id']")
	WebElement country;
	
	@FindBy(xpath = "//select[@name='zone_id']")
	WebElement state;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@name='confirm']")
	WebElement passwordConfirm;
	
	@FindBy(xpath = "//input[@name='agree']")
	WebElement privacyCheckbox;
	
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement continueButton;
	
	
	public Register() {
		PageFactory.initElements(driver, this);
	}
	
	public RegisterationConfirmation registeration(String firstName1,String lastName1, String email1,
			String telephone1, String address,String city1, String country1, String state1,String password1,String confirmPassword1) throws InterruptedException
	{
		
		firstName.sendKeys(firstName1);
		lastName.sendKeys(lastName1);
		email.sendKeys(email1);
		telephone.sendKeys(telephone1);
		address1.sendKeys(address);
		city.sendKeys(city1);
		Select countryDropDown = new Select(country);
		countryDropDown.selectByVisibleText(country1);
		Thread.sleep(5000);
		Select stateDropDown = new Select(state);
		stateDropDown.selectByVisibleText(state1);
		password.sendKeys(password1);
		passwordConfirm.sendKeys(confirmPassword1);
		privacyCheckbox.click();
		continueButton.submit();
		
		return new RegisterationConfirmation();
		
	}
	
}
