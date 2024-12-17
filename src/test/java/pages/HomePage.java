package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath="//button[@id='customer-menu']//*[name()='svg']")  WebElement headerMyAccountIcon;
	@FindBy(xpath="//a[@id='customer.header.sign.in.link']") WebElement loginButton;
	@FindBy(xpath="//a[@id='customer.header.register.link']") WebElement signup;
	
	public void clickOnLoginButton() {
		headerMyAccountIcon.click();
		loginButton.click();
	}
	public void clickOnSignupButton() {
		headerMyAccountIcon.click();
		signup.click();
	}
	
	
	public void selectCOD() {
		
	}

	
}
