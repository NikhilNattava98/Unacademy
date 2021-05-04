package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StartLearningTest {
	private WebDriver driver;
	@Before
	public void openBrowsser() {
	System.setProperty("webdriver.chrome.driver" ,"D:\\Selenium Server\\chromedriver_win32chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Given("^User is on start learning page$")
	public void user_is_on_start_learning_page() throws Throwable {
		driver.get("https://unacademy.com/manage-goals");
		driver.findElement(By.cssSelector("button.Button__StyledButton-dg3jck-0:nth-child(2)")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#DrawerPaper > div.Login__Wrapper-sc-15riaig-0.leZmMg > div.EnterNumberStep__EditDiv-sc-17qxvlo-6.cqwWVW > div > input")).sendKeys("8451862551");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("#DrawerPaper > div.Login__Wrapper-sc-15riaig-0.leZmMg > div.EnterNumberStep__ButtonWrapper-sc-17qxvlo-5.bzAMtW > button")).click();
		Thread.sleep(40000);
		driver.findElement(By.cssSelector("#DrawerPaper > div.Login__Wrapper-sc-15riaig-0.leZmMg > div.EnterOtpStep__ButtonWrapper-sc-73b7t6-11.hYwcH > button")).click();

	}

	@Then("^check the url of the page$")
	public void check_the_url_of_the_page() throws Throwable {
		String url=driver.getCurrentUrl();
		if(url.contentEquals("https://unacademy.com/explore/")) System.out.println("****** URL Matched");
		else System.out.println("****** URL NOT Matched");
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		//driver.close();
	}

	@When("^user selects all valid data$")
	public void user_selects_all_valid_data() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#DrawerPaper > div.LanguageCard__LanguageCardContainer-sc-113g7mt-0.cSMwoa")).click();
		Thread.sleep(5000);
	    
	}

	@Then("^course gets added to the My goals$")
	public void course_gets_added_to_the_My_goals() throws Throwable {
		driver.navigate().to("https://unacademy.com/manage-goals");
		Thread.sleep(5000);
	}

	@When("^user clicks on the course$")
	public void user_clicks_on_the_course() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#__next > header > div > button > svg")).click();
		Thread.sleep(3000);
		driver. findElement(By.linkText("Manage goals")).click();
		driver.findElement(By.xpath("//*[@id=\"my-goals\"]/div/div")).click();
		Thread.sleep(3000);
	}

	@Then("^user is navigated to course description page$")
	public void user_is_navigated_to_course_description_page() throws Throwable {
	    Thread.sleep(5000);
	}


	@Then("^when user clicks on get subscription$")
	public void when_user_clicks_on_get_subscription() throws Throwable {
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/button[2]")).click();
	}
	
	@Then("^user is shown different subscription plans$")
	public void user_is_shown_different_subscription_plans() throws Throwable {
		Thread.sleep(5000);
	    
	}

	@When("^user clicks on the remove sign on course$")
	public void user_clicks_on_the_remove_sign_on_course() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#__next > header > div > button > svg")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Manage goals")).click();
	    driver.findElement(By.cssSelector("#my-goals > div > div > div > div > svg")).click();
	}

	@Then("^show the alert msg$")
	public void show_the_alert_msg() throws Throwable {
	    Thread.sleep(5000);
	}
	
	@Then("^when user clicks on cancel button$")
	public void when_user_clicks_on_cancel_button() throws Throwable {
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/button[2]")).click();
		Thread.sleep(3000);
	}

	@Then("^the course does not get removed$")
	public void the_course_does_not_get_removed() throws Throwable {
		//driver.navigate().to("https://unacademy.com/manage-goals");
	    Thread.sleep(5000);
	}
	

	@Then("^when user clicks on remove button$")
	public void when_user_clicks_on_remove_button() throws Throwable {
		//Thread.sleep(5000);
		
		//Thread.sleep(10000);
		//driver.findElement(By.cssSelector("#my-goals > div > div > div > div > svg")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/button[1]")).click();
		
	}

	@Then("^the course gets removed$")
	public void the_course_gets_removed() throws Throwable {
		//driver.navigate().to("https://unacademy.com/manage-goals");
	    Thread.sleep(5000);
	}



	@When("^user clicks on the exam type$")
	public void user_clicks_on_the_exam_type() throws Throwable {
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		//driver.findElement(By.cssSelector("#__next > header > div > button > svg")).click();
		//Thread.sleep(3000);
		//driver. findElement(By.linkText("Manage goals")).click();
	    driver.findElement(By.linkText("Railway Exams")).click();
	    Thread.sleep(5000);
	}

	@Then("^various courses related to exam are displayed$")
	public void various_courses_related_to_exam_are_displayed() throws Throwable {
		
	    
	    driver.findElement(By.linkText("GATE, ESE and IIT-JAM")).click();
	    Thread.sleep(3000);
	}
	@After
	public void closeBrowsser() {
		driver.close();
		
	}

	

}
