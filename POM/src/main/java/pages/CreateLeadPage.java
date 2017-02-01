package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class CreateLeadPage extends LeafTapsWrappers  {

	public CreateLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Create Lead | opentaps CRM")){
			reportStep("This is not Home Page", "FAIL");
		}
	}
	// Entering Company Name 
	public CreateLeadPage enterCompanyName(String companyname){
		enterById("createLeadForm_companyName", companyname);
		return this;
	}
	
	// Entering First Name 
	public CreateLeadPage enterFirstname(String firstname){
		enterById("createLeadForm_firstName", firstname);
		return this;
	}
	
	// Entering Last Name 
	public CreateLeadPage enterlastname(String lastname){
		enterById("createLeadForm_lastName", lastname);
		return this;
	}
	
	public CreateLeadPage enterCountryCode(String countrycode){
		enterById("createLeadForm_primaryPhoneCountryCode", countrycode);
		return this;
	}
	
	public CreateLeadPage enterAreaCode(String areacode){
		enterById("createLeadForm_primaryPhoneAreaCode", areacode);
		return this;
	}
	
	public CreateLeadPage enterPhoneNumber(String phonenumber){
		enterById("createLeadForm_primaryPhoneNumber", phonenumber);
		return this;
	}
	
	public CreateLeadPage enterEmailAddress(String email){
		enterById("createLeadForm_primaryEmail", email);
		return this;
	}
	
	public ViewLeadPage clickSubmit(){
		clickByClassName("smallSubmit");
		return new ViewLeadPage(driver, test);
	}

}
