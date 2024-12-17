package utilities;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	//screenshots, frames, alert, sync issue , javascriptExecuter
	
	public static String  captureScreeShot(WebDriver driver) {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenshotPath = System.getProperty("user.dir")+"/Screenshots/"+getCurrentDataTime()+".png";
		
		try {
			FileHandler.copy(src, new File(screenshotPath));
			
			System.out.println("Screenshot captured ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to capture screenshots..!!! "+e.getMessage());
		}
		return screenshotPath;
	}
	
	public void alert() {
		
	}
	public void jsexecute() {
		
	}
	
	public static String getCurrentDataTime() {
		DateFormat customformat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentdate = new Date();
		return customformat.format(currentdate);
	}

}
