package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutAsGuestPage {
	
	@FindBy(xpath="//form[@id='emailCheckForm']//input[@id='email']") WebElement guestEail;
	@FindBy(xpath="//span[normalize-space()='CONTINUE AS A GUEST']") WebElement continueAsGuestButton;
	

}
