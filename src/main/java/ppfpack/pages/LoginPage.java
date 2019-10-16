package ppfpack.pages;


	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ppfpack.base.BasePage;
import ppfpack.util.Constants;

	public class LoginPage extends BasePage {
		
		@FindBy(id="lid")
		public WebElement EmailField;
		
		@FindBy(id="pwd")
		public WebElement PasswordField;
		
		@FindBy(id="signin_submit")
		public WebElement SingInButton;
		
		
		public LoginPage(WebDriver driver,ExtentTest eTest) {
			
			this.driver = driver;
			this.eTest = eTest;
			
		}
		//Reusable method for logging into the application
		public boolean doLogin() {
			
			EmailField.sendKeys(Constants.USER_NAME);
			eTest.log(LogStatus.INFO, "Username got entered into the Email adress field");
			PasswordField.sendKeys(Constants.PASSWORD);
			eTest.log(LogStatus.INFO, "Password got entered into the Password address field ");
			SingInButton.click();
			eTest.log(LogStatus.INFO, "Sigin button got clicked");
			
			HomePage homepage = new HomePage(driver , eTest);
			
			PageFactory.initElements(driver, homepage);
			
		boolean loginStatus =	homepage.verifyDisplayOfHomePage();
		
		return loginStatus;
		}
		
		//Other reusable methods

	}


