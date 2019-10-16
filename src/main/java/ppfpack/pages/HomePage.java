package ppfpack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentTest;

import ppfpack.base.BasePage;

public class HomePage extends BasePage {
	
	
	
	@FindBy(css="span[class^=zicon-apps-calendar]")
	public WebElement Calendar;

	@FindBy(css="span[class^=zicon-apps-books]")
	public WebElement Books;
	
	@FindBy(css="span[class^=zicon-apps-campaigns]")
	public WebElement Campaigns;
	
	@FindBy(css="span[class^=zicon-apps-chat]")
	public WebElement Cliq;
	
	@FindBy(css="span[class^=zicon-apps-connect]")
	public WebElement Connect;
	
	@FindBy(css="span[class^=zicon-apps-crm]")
	public WebElement CRM;
	
	@FindBy(css="span[class^=zicon-apps-invoice]")
	public WebElement Invoice;
	
	
	// constructor code
	
	public HomePage(WebDriver driver, ExtentTest  eTest) {
		
		this.driver = driver;
		this.eTest = eTest;
			
	}
	
	// Reusable methods for verifying weather the user got successfully logged in or not
	
	public boolean verifyDisplayOfHomePage() {
		
		return(isElementPresent(CRM));
	}
}
