package ppfpack.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import ppfpack.pages.LaunchPage;
import ppfpack.tests.base.BaseTest;
import ppfpack.util.Constants;

public class LoginTest  extends  BaseTest{
	
	
	
	@Test
	public void testLogin() {
		
	 eTest = eReport.startTest("LoginTest");
		
	  eTest.log(LogStatus.INFO, "Login test has started");
	  
	  openBrowser(Constants.BROWSER_TYPE);
	  
	  LaunchPage launchPage = new LaunchPage(driver , eTest);
	  
	  PageFactory.initElements(driver, launchPage); // page has been initialized
	  
	 boolean loginStatus= launchPage.goToLoginPage(); // navigating to launch page
	  
	  if(loginStatus) {
		  
		 reportPass("LoginTest Testcase passed");
	  }else {
		  
		  reportFail("LoginTest Testcase failed");
	  }
	  
	}

	@AfterMethod
	public void testClosure() {
		
		if(eReport!= null) {
			
			eReport.endTest(eTest);
			eReport.flush();
		}
		
		if(driver!= null) {
			
			driver.quit();
			
		}
	}
	
}
