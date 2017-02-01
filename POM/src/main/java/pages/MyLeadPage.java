package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyLeadPage extends LeafTapsWrappers {
	
	public MyLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("My Leads | opentaps CRM")){
			reportStep("This is not Login Page", "FAIL");
		}
	}
	
	public CreateLeadPage clickCreateLead(){
		clickByLink("Create Lead");
		return new CreateLeadPage(driver, test);
	}
	
	public FindLeadPage clickFindLeads() {
		clickByLink("Find Leads");
		return new FindLeadPage(driver, test);
		
	}
	
	public MergeLeadPage clickMergeLeads() {
		clickByLink("Merge Leads");
		return new MergeLeadPage(driver, test);
		
	}

}
