package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectModel.POMStartLearning;

public class TestStartLearning 
{	
	WebDriver driver;
	
	@Test(priority=0)
	@Given("User is on start learning page")
	public void user_is_on_start_learning_page() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Server\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://unacademy.com/manage-goals");
	//	driver.findElement(By.xpath("//a[@href='/manage-goals']//button[@aria-label='Start learning'][normalize-space()='Start learning']")).click();
		
	//	Thread.sleep(3000);

	}
	@Test(priority=1)
	@When("user selects the courses he wants to add")
	public void user_selects_the_courses_he_wants_to_add() throws Throwable
	{
	/*	Thread.sleep(3000);
		POMStartLearning obj = PageFactory.initElements(driver, POMStartLearning.class);
	//	WebDriverWait Mywait=new WebDriverWait(driver,10);
    //    Mywait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3)")));
		
		obj.SelectCourse();
		
		Thread.sleep(8000);
		*/
		Thread.sleep(5000);
		
		WebElement e = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].click();", e);
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("#DrawerPaper > div.LanguageCard__LanguageCardContainer-sc-113g7mt-0.cSMwoa")).click();
		Thread.sleep(5000);

	}
	
	@Test(priority=2)
	@Then("course gets added to the My goals")
	public void course_gets_added_to_the_my_goals() throws Throwable
	{
		
		Thread.sleep(3000);
	//	POMStartLearning obj = PageFactory.initElements(driver, POMStartLearning.class);
	//	obj.CourseLanguage();
	//	Thread.sleep(5000);
		driver.close();
	}

}
