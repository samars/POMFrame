package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.BaseClass;
import pages.CreateAccountPage;
import pages.HomePage;

public class CeateAccountTest extends BaseClass {
	
	@Test
	public void accountCreationTest() {
		logger=er.createTest("Signup to application..!!!");
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		logger.info("Clicking on Signup Button...!!!!");
		hp.clickOnSignupButton();
		CreateAccountPage cap = PageFactory.initElements(driver, CreateAccountPage.class);
		logger.info("Entering first name...!!!!");
		cap.enterFirstName("test");
		
		logger.info("Entering last name...!!!!");
		cap.enterLastName("test");
		
		logger.info("Entering emaial_id...!!!!");
		cap.enterEmail("test@gmail.com");
		
		logger.info("Entering password...!!!!");
		cap.enterPassword("test@123");
		
		logger.info("Entering confirm password...!!!!");
		cap.enterConfirmPassword("test@1234");
		
		logger.info("Accepting market content...!!!!");
		cap.acceptMarket();
		
		logger.info("Accepting policy...!!!!");
		cap.acceptPolicy();
		
		logger.info("Clicking on createAccount button...!!!!");
		cap.clickOnCreateAccountButton();
		
		logger.pass("SignUP successfully done..!!!!");
		
	}

}
