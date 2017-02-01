package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class EditLeadPage extends LeafTapsWrappers  {

	public EditLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("opentaps CRM")){
			reportStep("This is not Edit Page", "FAIL");
		}
	}
	public EditLeadPage changeCompanyName(String companyname){
		enterById("updateLeadForm_companyName", companyname);
		return this;
	}
	
	public ViewLeadPage clickUpdateButton(){
		clickByXpath("(//input[@class='smallSubmit'])[1]");
		return new ViewLeadPage (driver, test);
	}

}
