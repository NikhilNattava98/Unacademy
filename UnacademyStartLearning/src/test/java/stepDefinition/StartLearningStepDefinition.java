package stepDefinition;

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
import pageObjectModel.LoginPageModel;
import pageObjectModel.StartLearningPageModel;

public class StartLearningStepDefinition
{	
	WebDriver driver;
	
	
	@Test(priority=1)
	@Given("^User is successfully logged into his account$")
	public void User_is_successfully_logged_into_his_account() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Server\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//implicit wait
			
		//loading page factory
		
		//LoginPageModel obj = PageFactory.initElements(driver, LoginPageModel.class );
			
		//loading website
			driver.get("https://unacademy.com/");
			
			//maximizing browser
			driver.manage().window().maximize();
			
		//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    String title = driver.getTitle();
		    
		    //asserting page title
		    String expected_title = "Unacademy - India's Largest Online Learning Platform for UPSC CSE, JEE, NEET, CBSE and 35+ exams";
		    Assert.assertEquals(title, expected_title);
			Thread.sleep(3000);
			   
	 }
	
	 @Test(priority=2)
	 @When("^User selects country code$")
	 public void user_selects_country_code() throws Throwable 
	 {
		 LoginPageModel obj = PageFactory.initElements(driver, LoginPageModel.class );
		 obj.setLoginButton();
		 obj.setCountryCode(); 
		 obj.countryToSelect();
		 Thread.sleep(2000);
	 }
	 
	 @Test(priority=3)
	 @When("^User enters registered phone number$")
	 public void user_enters_registered_phone_number() throws Throwable 
	 {
		 LoginPageModel obj = PageFactory.initElements(driver, LoginPageModel.class );
		 obj.getPhoneNo("6281863628");
		 

		 Thread.sleep(5000);	 
	 }
	 
	 @Test(priority=4)
	 @When("^User click login button$")
	 public void user_click_login_button() throws Throwable 
	 {
		 LoginPageModel obj = PageFactory.initElements(driver, LoginPageModel.class );
		 obj.loginPage();
	 }
	 
	 @Test(priority=5)
	 @When("^User should enter valid otp$")
	 public void user_should_enter_valid_otp() throws Throwable 
	 {
		 LoginPageModel obj = PageFactory.initElements(driver, LoginPageModel.class );
		// Thread.sleep(25000);
		  WebDriverWait Mywait0=new WebDriverWait(driver,5);
		  Mywait0.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='One time password']")));
		 obj.otpNumber("733327");
	 }
	 
	 @Test(priority=6)
	 @When("^click on verify otp button$")
	 public void click_on_verify_otp_button() throws Throwable 
	 {
		 LoginPageModel obj = PageFactory.initElements(driver, LoginPageModel.class );
		 obj.VerifyOtp();
		 Thread.sleep(3000);
	    
	 }
	 
	 @Test(priority=7)
	 @Then("^User should be able to login successfully$")
	 public void user_should_be_able_to_login_successfully() throws Throwable 
	 {
		 Thread.sleep(5000);
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,250)");
		 
	//	 JavascriptExecutor js = (JavascriptExecutor) driver;
		// WebElement Element = driver.findElement(By.xpath("//p[normalize-space()='Govt Exams']"));	
		// js.executeScript("arguments[0].scrollIntoView();", Element);
		 Thread.sleep(5000);
		// WebDriverWait Mywait7=new WebDriverWait(driver,5);
	    // Mywait7.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/manage-goals']//button[@aria-label='Start learning'][normalize-space()='Start learning']")));
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[2]/a[1]/button[1]")).click();
		 
	 }

	
	@Test(priority=1)
	@Given("User is on start learning page")
	public void user_is_on_start_learning_page() throws Throwable
	{
		
		Thread.sleep(3000);

	}

	@Test(priority=2)
	@When("user selects the courses he wants to add")
	public void user_selects_the_courses_he_wants_to_add() throws Throwable
	{
		
		StartLearningPageModel obj = PageFactory.initElements(driver, StartLearningPageModel.class);
		WebDriverWait Mywait8=new WebDriverWait(driver,5);
        Mywait8.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")));
        
		obj.SelectCourse();
		Thread.sleep(3000);

	}
	
	@Test(priority=3)
	@Then("course gets added to the My goals")
	public void course_gets_added_to_the_my_goals() throws Throwable
	{
		
		Thread.sleep(3000);
		StartLearningPageModel obj1 = PageFactory.initElements(driver, StartLearningPageModel.class);
    	obj1.CourseLanguage();
		Thread.sleep(3000);
	}
	
	@Test(priority=2)
	@When("^user clicks on the exam type$")
	public void user_clicks_on_the_exam_type() throws Throwable 
	{
		//Second Course
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//p[normalize-space()='Govt Exams']"));	
		js.executeScript("arguments[0].scrollIntoView();", Element);
	   // WebDriverWait Mywait10=new WebDriverWait(driver,10);
	   //Mywait10.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1) > p:nth-child(1)")));
	   //driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1) > p:nth-child(1)")).click();
		Thread.sleep(3000);
		
		//Thread.sleep(3000);
		//obj1.DisplayCourse();
	}

	@Test(priority=3)
	@Then("^various courses related to exam are displayed$")
	public void various_courses_related_to_exam_are_displayed() throws Throwable 
	{
		Thread.sleep(1000);
	}

	@Test(priority=2)
	@When("^user clicks on the course$")
	public void user_clicks_on_the_course() throws Throwable 
	{
		WebDriverWait Mywait12=new WebDriverWait(driver,5);
        Mywait12.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='UQFJD']//div[@class='ManageGoals__GoalGroupChildren-sc-10y54zb-4 imnHrd']//div[1]//div[1]//div[1]")));
		driver.findElement(By.xpath("//div[@id='UQFJD']//div[@class='ManageGoals__GoalGroupChildren-sc-10y54zb-4 imnHrd']//div[1]//div[1]//div[1]")).click();
			
	}

	@Test(priority=3)
	@Then("^user is navigated to select the language$")
	public void user_is_navigated_to_select_the_language() throws Throwable 
	{

		//WebDriverWait Mywait13=new WebDriverWait(driver,8);
        //Mywait13.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class='LanguageCard__LanguageCardContainer-sc-113g7mt-0 ePFkQs']")));
		//driver.findElement(By.cssSelector("div[class='LanguageCard__LanguageCardContainer-sc-113g7mt-0 ePFkQs']")).click();
		
		StartLearningPageModel obj1 = PageFactory.initElements(driver, StartLearningPageModel.class);
		Thread.sleep(5000);
		obj1.CourseLanguage();
		
		Thread.sleep(3000);
		//WebDriver driver = new ChromeDriver();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-250)");
		
	}

	@Test(priority=2)
	@When("^user clicks on the remove sign on course$")
	public void user_clicks_on_the_remove_sign_on_course() throws Throwable 
	{
		StartLearningPageModel obj1 = PageFactory.initElements(driver, StartLearningPageModel.class);
		Thread.sleep(5000);
		obj1.Warning();
	}

	@Test(priority=3)
	@Then("^show the alert msg$")
	public void show_the_alert_msg() throws Throwable 
	{
		Thread.sleep(5000);
	}

	@Test(priority=4)
	@Then("^when user clicks on cancel button$")
	public void when_user_clicks_on_cancel_button() throws Throwable 
	{
		StartLearningPageModel obj1 = PageFactory.initElements(driver, StartLearningPageModel.class);
		Thread.sleep(3000);
		obj1.CancelRemoval();
	}

	@Test(priority=5)
	@Then("^the course does not get removed$")
	public void the_course_does_not_get_removed() throws Throwable 
	{
		StartLearningPageModel obj1 = PageFactory.initElements(driver, StartLearningPageModel.class);
		Thread.sleep(5000);
		obj1.Warning();
	}

	@Test(priority=4)
	@Then("^when user clicks on remove button$")
	public void when_user_clicks_on_remove_button() throws Throwable 
	{
		Thread.sleep(3000);
		StartLearningPageModel obj1 = PageFactory.initElements(driver, StartLearningPageModel.class);
		obj1.CourseRemoval();
		Thread.sleep(5000);
	}

	@Test(priority=5)
	@Then("^the course gets removed$")
	public void the_course_gets_removed() throws Throwable 
	{
		Thread.sleep(5000);
	}

	@Test(priority=2)
	@When("^user clicks on the course in mygoals$")
	public void user_clicks_on_the_course_in_mygoals() throws Throwable 
	{
		StartLearningPageModel obj1 = PageFactory.initElements(driver, StartLearningPageModel.class);
		Thread.sleep(5000);
		obj1.CourseInMygoals();
	}

	@Test(priority=3)
	@Then("^user is navigated to course description page$")
	public void user_is_navigated_to_course_description_page() throws Throwable 
	{
		Thread.sleep(5000);
	}

	@Test(priority=4)
	@Then("^when user clicks on get subscription$")
	public void when_user_clicks_on_get_subscription() throws Throwable 
	{
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.cssSelector("button[class='Button__StyledButton-dg3jck-0 hLfEGT PageHead__SubButton-sc-1xvuona-6 ioigXL']"));	
		js.executeScript("arguments[0].scrollIntoView();", Element);
	    WebDriverWait Mywait22=new WebDriverWait(driver,10);
	    Mywait22.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[class='Button__StyledButton-dg3jck-0 hLfEGT PageHead__SubButton-sc-1xvuona-6 ioigXL']")));
		driver.findElement(By.cssSelector("button[class='Button__StyledButton-dg3jck-0 hLfEGT PageHead__SubButton-sc-1xvuona-6 ioigXL']")).click();
		
		//POMStartLearning obj1 = PageFactory.initElements(driver, POMStartLearning.class);
		//obj1.SubscribeCourse();
	}
	@Test(priority=5)
	@Then("^user is shown different subscription plans$")
	public void user_is_shown_different_subscription_plans() throws Throwable 
	{
		
		Thread.sleep(5000);
		driver.close();
	}

}