package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseClass {	
	
	@Test
	public void loginApp() {
		logger=er.createTest("Login to application..!!!");
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		logger.info("Clicking on Login Button...!!!!");
		hp.clickOnLoginButton();
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		logger.info("Login into system with username & password...!!!");
		lp.loginToApp(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		logger.pass("Login successfully done..!!!!");
	}

	
}


