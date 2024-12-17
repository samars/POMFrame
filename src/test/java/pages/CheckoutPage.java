package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage {
	
	@FindBy(xpath="//input[@id='login.email']") WebElement cusInfoEmail;
	@FindBy(xpath="//button[normalize-space()='CONTINUE WITH SHIPPING']") WebElement continueWithShippingButton;
	@FindBy(xpath="//input[@id='shipping_address.firstname']") WebElement shipInfoFname;
	@FindBy(xpath="//input[@id='shipping_address.lastname']") WebElement shipInfoLname;
	@FindBy(xpath="//input[contains(@id,'shipping_address.street')]") WebElement shipInfoAddress;
	@FindBy(xpath="//input[@id='shipping_address.zipcode']") WebElement shipInfoPostalCode;
	@FindBy(xpath="//input[@id='shipping_address.city']") WebElement shipInfoCity;
	@FindBy(xpath="//select[@id='shipping_address.country']") WebElement shipInfoCountry;
	@FindBy(xpath="//select[@id='shipping_address.region']") WebElement shipInfoState;
	@FindBy(xpath="//input[@id='shipping_address.phone']") WebElement shipInfoTelephoneNumber;
	@FindBy(xpath="//button[normalize-space()='SAVE ADDRESS']") WebElement shipInfoSaveAddress;
	@FindBy(xpath="//input[@id='shippingMethod_flatrate__flatrate']") WebElement shipMethodFlatRate;
	@FindBy(xpath="//button[normalize-space()='CONTINUE WITH PAYMENT']") WebElement continueWithPayment;
	
	

}
