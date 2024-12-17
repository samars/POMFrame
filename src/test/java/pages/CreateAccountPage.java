package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage {
	
	WebDriver driver;
	
	public CreateAccountPage(WebDriver ldriver) 
	{
		this.driver=ldriver;	
	}
	
	@FindBy(xpath="//input[@id='name']") WebElement name;
	@FindBy(xpath="//input[@id='lastname']") WebElement lastName;
	@FindBy(xpath="//input[@id='email']") WebElement email;
	@FindBy(xpath="//input[@id='password']") WebElement password;
	@FindBy(xpath="//input[@id='passwordconfirm']") WebElement repeatPass;
	@FindBy(xpath="//input[@id='marketing_consent']") WebElement marketContent;
	@FindBy(xpath="//input[@id='privacy_policy']") WebElement policy;
	@FindBy(xpath="//span[normalize-space()='CREATE ACCOUNT']") WebElement createAccountButton;
	
	public void enterFirstName(String fname) {
		name.sendKeys(fname);
	}
	
	public void enterLastName(String lname) {
		lastName.sendKeys(lname);
	}
	
	public void enterEmail(String cemail) {
		email.sendKeys(cemail);
	}
	
	public void enterPassword(String pas) {
		password.sendKeys(pas);
	}
	public void enterConfirmPassword(String pas) {
		repeatPass.sendKeys(pas);
	}
	public void acceptMarket() {
		marketContent.click();
	}
	public void acceptPolicy() {
		policy.click();
	}
	
	public void clickOnCreateAccountButton() {
		createAccountButton.click();
	}
	

}

