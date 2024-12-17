package pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utilities.BrowserFactory;
import utilities.ConfigDataProvider;
import utilities.ExcelDataProvider;
import utilities.Helper;

public class BaseClass {
	
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	public ExtentReports er;
	public ExtentTest logger;
	
	@BeforeSuite
	public void setUpSuite() {
		Reporter.log("Setting up reports , test is getting ready....",true);
		excel = new ExcelDataProvider();
		config=new ConfigDataProvider();
		
		ExtentSparkReporter htmlreport= new ExtentSparkReporter(System.getProperty("user.dir")+File.separator+"/Reports/"+Helper.getCurrentDataTime()+".html");
		er = new ExtentReports();
		er.attachReporter(htmlreport);
		Reporter.log("Setting done , test can be started....",true);
		
		
	}
	
	@BeforeClass
	public void setupApp() {
		Reporter.log("Trying to start browser  getting application ready....",true);
		driver = BrowserFactory.startApplicaiton(driver, config.getBrowser(), config.getTestUrl());
		System.out.println(driver.getTitle());
		Reporter.log("Browser & Application is up & running....",true);
	}
	
	@AfterClass
	public void tearDown() {
		BrowserFactory.quitBrowser(driver);
	}
	
	@AfterMethod
	public void tearDownMethod(ITestResult result) {
		
		Reporter.log("Test is about to end....",true);
		
		if(result.getStatus()==ITestResult.FAILURE) 
		{
			logger.fail("Test failed..!!!!", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreeShot(driver)).build());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			logger.pass("Test passed..!!!",MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreeShot(driver)).build());
		}

		er.flush();
		Reporter.log("Test completed & reports generated....",true);
		
	}


}
