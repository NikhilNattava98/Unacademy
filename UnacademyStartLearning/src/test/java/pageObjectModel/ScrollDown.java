package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollDown 
{

	    WebDriver driver;
	    @Test
	    public void ByVisibleElement() {
	        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Server\\chromedriver_win32\\chromedriver.exe");
	        driver = new ChromeDriver();
	        JavascriptExecutor js = (JavascriptExecutor) driver;
        	
	        driver.get("https://unacademy.com/");
	        WebElement Element = driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > section:nth-child(2) > div:nth-child(1) > div:nth-child(6) > a:nth-child(1) > button:nth-child(1)"));	
	        js.executeScript("arguments[0].scrollIntoView();", Element);
	    }
}
