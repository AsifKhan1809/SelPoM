package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyHomePage extends LeafTapsWrappers  {

	public MyHomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("My Home | opentaps CRM")){
			reportStep("This is not Login Page", "FAIL");
		}
	}
	
	public MyLeadPage clickLeads(){
		clickByLink("Leads");
		return new MyLeadPage(driver, test);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
