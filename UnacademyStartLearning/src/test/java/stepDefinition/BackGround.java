package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectModel.LoginPOM;

public class BackGround {
	
	WebDriver driver;
	LoginPOM obj;
	
	@Test(priority=1)
	@Given("^User is successfully logged into his account$")
	public void user_is_successfully_logged_into_his_account() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Server\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		//loading page factory
		obj = new LoginPOM(driver);
		obj = PageFactory.initElements(driver, LoginPOM.class );
			
		//loading website
			driver.get("https://unacademy.com/");
			
			//maximizing browser
			driver.manage().window().maximize();
			
		    String title = driver.getTitle();
		    
		    //asserting page title
		    String expected_title = "Unacademy - India's Largest Online Learning Platform for UPSC CSE, JEE, NEET, CBSE and 35+ exams";
		    Assert.assertEquals(title, expected_title);
			  
		      if(title.contentEquals("Unacademy - India's Largest Online Learning Platform for UPSC CSE, JEE, NEET, CBSE and 35+ exams")) {
			  System.out.println("Title Matched. User on home page"); } 
			  else {
			  System.out.println("Title NOT Matched."); }
			  Thread.sleep(3000);
			   
	 }
	
	 @Test(priority=2)
	 @When("^User selects country code$")
	 public void user_selects_country_code() throws Throwable 
	 {
		 obj.setLoginButton();
		 obj.setCountryCode(); 
		 obj.countryToSelect();
		 Thread.sleep(2000);
	 }
	 
	 @Test(priority=3)
	 @When("^User enters registered phone number$")
	 public void user_enters_registered_phone_number() throws Throwable 
	 {
		 obj = new LoginPOM(driver);
		 obj = PageFactory.initElements(driver, LoginPOM.class );
		 obj.getPhoneNo("6281863628");
		 

		 Thread.sleep(5000);	 
	 }
	 
	 @Test(priority=4)
	 @When("^User click login button$")
	 public void user_click_login_button() throws Throwable 
	 { 
		 obj.loginPage();
	 }
	 
	 @Test(priority=5)
	 @When("^User should enter valid otp$")
	 public void user_should_enter_valid_otp() throws Throwable 
	 {
		 Thread.sleep(15000);
		 obj.otpNumber();
	 }
	 
	 @Test(priority=6)
	 @When("^click on verify otp button$")
	 public void click_on_verify_otp_button() throws Throwable 
	 {
		 obj.loginOtp();
	    
	 }
	 
	 @Test(priority=7)
	 @Then("^User should be able to login successfully$")
	 public void user_should_be_able_to_login_successfully() throws Throwable 
	 {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > section:nth-child(2) > div:nth-child(1) > div:nth-child(6) > a:nth-child(1) > button:nth-child(1)"));	
		 js.executeScript("arguments[0].scrollIntoView();", Element);
	     WebDriverWait Mywait3=new WebDriverWait(driver,10);
	     Mywait3.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > section:nth-child(2) > div:nth-child(1) > div:nth-child(6) > a:nth-child(1) > button:nth-child(1)")));
		 driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > section:nth-child(2) > div:nth-child(1) > div:nth-child(6) > a:nth-child(1) > button:nth-child(1)")).click();	     
	 }

}
