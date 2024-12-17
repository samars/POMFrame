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
	
	public void clickOnLoginButton() {
		headerMyAccountIcon.click();
		loginButton.click();
		
		
	}
	
	public void selectCOD() {
		
	}

	
}
