package testcases;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.Register;
import pages.RegisterationConfirmation;
import utilties.TestUtil;

public class RegisterTestCases extends TestBase{
	HomePage homepage;
	Register register;
	RegisterationConfirmation registerConfirm;
	TestUtil testutil;
	String sheetName = "login";
	public static Logger log =LogManager.getLogger(TestBase.class.getName());
	public RegisterTestCases()
	{
		super();
	}
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		
		initialization();
		homepage = new HomePage();
		register = new Register();
		registerConfirm = new RegisterationConfirmation();
		testutil = new TestUtil();
	}
	
	
	
	@Test(dataProvider="getLoginestData")
	public void createAccount(String firstName,String lastName, String email,
			String telephone, String address,String city, String country, String state,String password,String confirmPassword) throws IOException, InterruptedException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	homepage.clickMyaccount();
	register=homepage.clickRegister();
	String email1 = email+sdf.format(timestamp)+"@gmail.com";
	registerConfirm=register.registeration(firstName,lastName,email1,telephone,address,city,country,state,password,confirmPassword);
	Assert.assertEquals(registerConfirm.registerConfirm(), "Your Account Has Been Created!");
	log.info("Registeration successfull");
	}
	
	@DataProvider
	public Object[][] getLoginestData(){
		Object data[][] = TestUtil.getTestData("register");
		return data;
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
