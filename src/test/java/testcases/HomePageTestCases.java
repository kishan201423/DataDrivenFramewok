package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;

public class HomePageTestCases extends TestBase{
	
	HomePage homepage;
	public static Logger log =LogManager.getLogger(TestBase.class.getName());
	public HomePageTestCases() {
		super();
	}
	
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		
		initialization();
		homepage = new HomePage();
	}
	
	@Test
	public void validatePageOpen()
	{
		Assert.assertTrue(homepage.siteLogoValidate(),"Home Page is not displayed");
		log.info("Homepage is displayed");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
