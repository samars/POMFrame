package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	//This is new commit from samar_sam
	public LoginPage(WebDriver ldriver) {
		
		this.driver=ldriver;
		
		
	}
	
	@FindBy(xpath="//input[@id='email']") WebElement loginText;
	@FindBy(xpath="//input[@id='password']") WebElement passwordText;
	@FindBy(xpath="//button[@name='send']") WebElement loginButton;
	
	
	public void loginToApp(String uname, String pass) {
		loginText.sendKeys(uname);
		passwordText.sendKeys(pass);
		loginButton.click();	
	}
	
	
}
