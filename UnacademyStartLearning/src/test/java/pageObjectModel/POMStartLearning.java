package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMStartLearning 
{
	
	WebDriver driver;
	
	@FindBy(css="body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3)")
	WebElement SelectCourse;
	
	@FindBy(xpath="//div[@class='LanguageCard__LanguageCardContainer-sc-113g7mt-0 ePFkQs']")
	WebElement CourseLanguage;
	
	@FindBy(xpath="//div[@class='ManageGoals__GoalGroupChildren-sc-10y54zb-4 imnHrd']//div[@class='MuiPaper-root Paper-f6r4fl-0 GoalCard__GoalCardContainer-a0sd1r-0 bijLix cuVYUM MuiPaper-elevation1 MuiPaper-rounded']")
	WebElement CourseInMygoals;
	
	@FindBy(xpath="//button[@class='Button__StyledButton-dg3jck-0 hLfEGT PageHead__SubButton-sc-1xvuona-6 ioigXL']")
	WebElement Subscription;
	
	@FindBy(xpath="//div[@id='my-goals']//div[2]//div[1]//div[1]")
	WebElement Warning;
	
	@FindBy(xpath="//body/div[4]/div[3]/div[1]/div[1]/div[1]/button[2]")
	WebElement CancelRemoval;
	
	@FindBy(xpath="//body/div[4]/div[3]/div[1]/div[1]/div[1]/button[1]")
	WebElement CourseRemoval;
	
	@FindBy(xpath="//h4[normalize-space()='Govt Exams']")
	WebElement DisplayCourse;
	
	public POMStartLearning (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void SelectCourse() 
	{
		SelectCourse.click();
	}
	public void CourseLanguage()
	{
		CourseLanguage.click();
	}
	public void CourseInMygoals()
	{
		CourseInMygoals.click();
	}
	public void SubscribeCourse()
	{
		Subscription.click();
	}
	public void Warning()
	{
		Warning.click();
	}
	public void CancelRemoval()
	{
		CancelRemoval.click();
	}
	public void CourseRemoval()
	{
		CourseRemoval.click();
	}
	public void DisplayCourse()
	{
		DisplayCourse.click();
	}
	
}
