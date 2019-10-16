package ppfpack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ppfpack.base.BasePage;
import ppfpack.util.Constants;

public class LaunchPage extends BasePage {
	
	//Creating  WebElement of launch page

	@FindBy(className ="zh-customers")  // page factory syntax to locate the web element
	public WebElement Customers;
	
	@FindBy(className ="zh-support")
	public WebElement Support;
	
	@FindBy(className="zh-contact")
	public WebElement ContactSales;
	
	
	@FindBy(className = "zh-login")
	public WebElement Login;
	
	
	public LaunchPage(WebDriver driver, ExtentTest eTest) {
		
		this.driver =driver;
		this.eTest = eTest;
	}
	// creating reusable methods for launch page
	public boolean goToLoginPage() {
		
		driver.get(Constants.APP_URL);
		
		eTest.log(LogStatus.INFO, "Application URL" +Constants.APP_URL + "got launched");
		
		Login.click();
		
		eTest.log(LogStatus.INFO,"Login option has clicked");
		
		LoginPage loginpage = new LoginPage(driver, eTest); // navigating to login page
		
		PageFactory.initElements(driver, loginpage); // page initialization
		
		boolean loginStatus =loginpage.doLogin();
		return loginStatus;
	}
}
