package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM 
{
	WebDriver driver;
		
	@FindBy(xpath="//button[contains(text(),'Login')]")
	WebElement loginbutton;
		
	@FindBy(xpath="//p[@class='P1-llcrra-0 CountryMenu__BoldP1-sc-7z48zf-0 dEUMYL dlHJTQ']")
	WebElement countrycode;
	
	@FindBy(xpath="//span[@class='MenuItem__Label-sc-3auwg3-3 gAJfoK']")
	WebElement selectCountry;
	
	@FindBy(xpath="//input[@placeholder='Enter your mobile number']")
	WebElement getNum;
	
	@FindBy(css="button[class='Button__StyledButton-dg3jck-0 jerpTs']")
	WebElement login;
		
	@FindBy(xpath="//input[@placeholder='One time password']")
	WebElement otpNo;
	
	@FindBy(xpath="//button[normalize-space()='Verify OTP']")
	WebElement logOtp;
	
	public  LoginPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
				
	}
	public void setLoginButton() throws Throwable {
		loginbutton.click();
		Thread.sleep(3000);
	}
	public void setCountryCode() throws Throwable
	{
		countrycode.click();
	}
	public void countryToSelect() throws Throwable
	{		
		selectCountry.click();
	}
	public void getPhoneNo(String i)
	{			
		getNum.sendKeys(i);	
	}
	public void loginPage()
	{
		login.click();
	}
	public void otpNumber() throws Throwable
	{
		otpNo.sendKeys();
	}
	public void loginOtp() throws Throwable
	{
		Thread.sleep(5000);
		logOtp.click();
	}
			
}
