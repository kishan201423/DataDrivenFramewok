package testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginConfirmation;
import pages.LoginPage;
import utilties.TestUtil;

public class LoginTestCases extends TestBase {

	HomePage homepage;
	LoginPage loginPage;
	LoginConfirmation loginConfirm;
	TestUtil testutil;
	String sheetName = "login";
	public static Logger log =LogManager.getLogger(TestBase.class.getName());
	public LoginTestCases()
	{
		super();
	}
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		
		initialization();
		homepage = new HomePage();
		loginPage = new LoginPage();
		loginConfirm = new LoginConfirmation();
		testutil = new TestUtil();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertTrue(title.contains("Account"));
		log.info("Login Page is displayed");
	}
	
	@Test(dataProvider="getLoginestData")
	public void login(String userName, String password) throws IOException
	{
		System.out.println(userName+ " " +password);
	homepage.clickMyaccount();
	loginPage=homepage.clickLogin();
	loginConfirm=loginPage.login(userName,password);
	Assert.assertTrue(loginConfirm.loginConfirm(), "Login Failed");
	log.info("Login successfull");
	}
	
	@DataProvider
	public Object[][] getLoginestData(){
		Object data[][] = TestUtil.getTestData("login");
		return data;
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
