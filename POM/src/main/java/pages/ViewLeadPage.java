package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ViewLeadPage extends LeafTapsWrappers  {

	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("View Lead | opentaps CRM")){
			reportStep("This is not View Lead Page", "FAIL");
		}
	}
	
	public EditLeadPage clickEditButton() {
		clickByLink("Edit");
		return new EditLeadPage(driver, test);  	
	}
	
	public MyLeadPage clickDeleteButton() {
		clickByLink("Delete");
		return new MyLeadPage(driver, test);    	
	}
	
	public DuplicateLeadPage clickDuplicateLeadButton() {
		clickByLink("Duplicate Lead");
		return new DuplicateLeadPage(driver, test);  	
	}
	
	public FindLeadPage clickFindLeadButton() {
		clickByLink("Find Leads");
		return new FindLeadPage(driver, test);  	
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	


