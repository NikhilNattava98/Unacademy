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
import pageObjectModel.POMStartLearning;

public class TestAddCourse 
{	
	WebDriver driver;
	
	LoginPOM obj;
	POMStartLearning obj1;
	
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
		 Thread.sleep(30000);
		 obj.otpNumber();
	 }
	 
	 @Test(priority=6)
	 @When("^click on verify otp button$")
	 public void click_on_verify_otp_button() throws Throwable 
	 {
		 obj.loginOtp();
		 Thread.sleep(10000);
	    
	 }
	 
	 @Test(priority=7)
	 @Then("^User should be able to login successfully$")
	 public void user_should_be_able_to_login_successfully() throws Throwable 
	 {
		 Thread.sleep(5000);;
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > section:nth-child(2) > div:nth-child(1) > div:nth-child(6) > a:nth-child(1) > button:nth-child(1)"));	
		 js.executeScript("arguments[0].scrollIntoView();", Element);
	     WebDriverWait Mywait6=new WebDriverWait(driver,10);
	     Mywait6.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > section:nth-child(2) > div:nth-child(1) > div:nth-child(6) > a:nth-child(1) > button:nth-child(1)")));
		 driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > section:nth-child(2) > div:nth-child(1) > div:nth-child(6) > a:nth-child(1) > button:nth-child(1)")).click();
		 Thread.sleep(5000);
	 }

	
	@Test(priority=8)
	@Given("User is on start learning page")
	public void user_is_on_start_learning_page() throws Throwable
	{
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium Server\\chromedriver_win32\\chromedriver.exe");
		//driver = new ChromeDriver();
		//driver.get("https://unacademy.com/");
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//WebElement Element = driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > section:nth-child(2) > div:nth-child(1) > div:nth-child(6) > a:nth-child(1) > button:nth-child(1)"));	
	    //js.executeScript("arguments[0].scrollIntoView();", Element);
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	//WebDriverWait Mywait1=new WebDriverWait(driver,10);
        //Mywait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > section:nth-child(2) > div:nth-child(1) > div:nth-child(6) > a:nth-child(1) > button:nth-child(1)")));
		//driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > section:nth-child(2) > div:nth-child(1) > div:nth-child(6) > a:nth-child(1) > button:nth-child(1)")).click();
		
		Thread.sleep(3000);

	}

	@Test(priority=8)
	@When("user selects the courses he wants to add")
	public void user_selects_the_courses_he_wants_to_add() throws Throwable
	{
		Thread.sleep(3000);
		POMStartLearning obj = PageFactory.initElements(driver, POMStartLearning.class);
		WebDriverWait Mywait=new WebDriverWait(driver,10);
        Mywait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3)")));
		
		obj.SelectCourse();
		Thread.sleep(5000);

	}
	
	@Test(priority=9)
	@Then("course gets added to the My goals")
	public void course_gets_added_to_the_my_goals() throws Throwable
	{
		
		Thread.sleep(3000);
		POMStartLearning obj = PageFactory.initElements(driver, POMStartLearning.class);
    	obj.CourseLanguage();
		Thread.sleep(8000);
	}
	
	@Test(priority=10)
	@When("^user clicks on the exam type$")
	public void user_clicks_on_the_exam_type() throws Throwable 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > svg:nth-child(1)"));	
		js.executeScript("arguments[0].scrollIntoView();", Element);
	   // WebDriverWait Mywait7=new WebDriverWait(driver,10);
	   //Mywait7.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1) > p:nth-child(1)")));
	   //driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1) > p:nth-child(1)")).click();
		Thread.sleep(5000);
		
		//Thread.sleep(3000);
		//obj1.DisplayCourse();
	}

	@Test(priority=11)
	@Then("^various courses related to exam are displayed$")
	public void various_courses_related_to_exam_are_displayed() throws Throwable 
	{
		Thread.sleep(3000);
	}

	@Test(priority=12)
	@When("^user clicks on the course$")
	public void user_clicks_on_the_course() throws Throwable 
	{
		WebDriverWait Mywait5=new WebDriverWait(driver,5);
        Mywait5.until(ExpectedConditions.elementToBeClickable(By.xpath("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > svg:nth-child(1)")));
		driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > svg:nth-child(1)")).click();
			
	}

	@Test(priority=13)
	@Then("^user is navigated to select the language$")
	public void user_is_navigated_to_select_the_language() throws Throwable 
	{
		Thread.sleep(3000);
		obj1.CourseLanguage();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//a[@href='/explore#UQFJD']//div[@class='GoalGroupNav__Count-kdz8jf-4 jAoOXW'][normalize-space()='4']"));	
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
	}

	@Test(priority=14)
	@When("^user clicks on the remove sign on course$")
	public void user_clicks_on_the_remove_sign_on_course() throws Throwable 
	{
		Thread.sleep(5000);
		obj1.Warning();
	}

	@Test(priority=15)
	@Then("^show the alert msg$")
	public void show_the_alert_msg() throws Throwable 
	{
		Thread.sleep(5000);
	}

	@Test(priority=16)
	@Then("^when user clicks on cancel button$")
	public void when_user_clicks_on_cancel_button() throws Throwable 
	{
		Thread.sleep(3000);
		obj1.CancelRemoval();
	}

	@Test(priority=17)
	@Then("^the course does not get removed$")
	public void the_course_does_not_get_removed() throws Throwable 
	{
		Thread.sleep(3000);
	}

	@Test(priority=18)
	@Then("^when user clicks on remove button$")
	public void when_user_clicks_on_remove_button() throws Throwable 
	{
		Thread.sleep(3000);
		obj1.CourseRemoval();
		Thread.sleep(5000);
	}

	@Test(priority=19)
	@Then("^the course gets removed$")
	public void the_course_gets_removed() throws Throwable 
	{
		Thread.sleep(5000);
	}

	@Test(priority=20)
	@When("^user clicks on the course in mygoals$")
	public void user_clicks_on_the_course_in_mygoals() throws Throwable 
	{
		Thread.sleep(5000);
		obj1.CourseInMygoals();
	}

	@Test(priority=21)
	@Then("^user is navigated to course description page$")
	public void user_is_navigated_to_course_description_page() throws Throwable 
	{
		Thread.sleep(5000);
	}

	@Test(priority=22)
	@Then("^when user clicks on get subscription$")
	public void when_user_clicks_on_get_subscription() throws Throwable 
	{
		Thread.sleep(5000);
	}
	@Test(priority=23)
	@Then("^user is shown different subscription plans$")
	public void user_is_shown_different_subscription_plans() throws Throwable 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.cssSelector("button[class='Button__StyledButton-dg3jck-0 hLfEGT PageHead__SubButton-sc-1xvuona-6 ioigXL']"));	
		js.executeScript("arguments[0].scrollIntoView();", Element);
	    WebDriverWait Mywait4=new WebDriverWait(driver,10);
	    Mywait4.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[class='Button__StyledButton-dg3jck-0 hLfEGT PageHead__SubButton-sc-1xvuona-6 ioigXL']")));
		driver.findElement(By.cssSelector("button[class='Button__StyledButton-dg3jck-0 hLfEGT PageHead__SubButton-sc-1xvuona-6 ioigXL']")).click();
		
		//obj1.SubscribeCourse();
		Thread.sleep(5000);
	}

}