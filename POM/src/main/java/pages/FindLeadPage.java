package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeadPage extends LeafTapsWrappers {
	
	public FindLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Find Leads | opentaps CRM")){
			reportStep("This is not Login Page", "FAIL");
		}
	}
	
	public FindLeadPage enterFirstName(String firstname) {
		enterByXpath("(//input[@name='firstName'])[3]", firstname);
		return this;
	}
	
	
	public FindLeadPage enterLeadID(String leadID) {
		enterByXpath("//input[@name='id']", leadID);
		return this;
	}
	
	// Clicking Phone Tab and Entering Phone number 
	
	public FindLeadPage clickPhoneTab() {
		clickByXpath("//span[contains(text(),'Phone')]");
		return this;
	}
	
	public FindLeadPage enterCountryCode(String countrycode) {
		enterByXpath("//input[@name='phoneCountryCode']", countrycode);
		return this;
	}
	
	public FindLeadPage enterAreaCode(String areacode) {
		enterByXpath("//input[@name='phoneAreaCode']", areacode);
		return this;
	}
	
	public FindLeadPage enterPhoneNumber(String phonenumber) {
		enterByXpath("//input[@name='phoneNumber']", phonenumber);
		return this;
	}
	
	// Clicking Email tab and entering Email address
	
	public FindLeadPage clickEmailTab() {
		clickByXpath("//span[contains(text(),'Email')]");
		return this;
	}
	
	public FindLeadPage enterEmailAdress(String email) {
		enterByXpath("//input[@name='emailAddress']", email);
		return this;
	}
	
	public FindLeadPage clickFindLeadButton() {
		clickByXpath("//button[contains(text(),'Find Leads')]");
		return this;
	}
	
	public FindLeadPage captureFirstLead() {
		@SuppressWarnings("unused")
		String ID = getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		return this;
	}
	
	public ViewLeadPage clickFirstLead() {
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		return new ViewLeadPage(driver, test);
	}
	
	public FindLeadPage verifyErrorMessage() {
		verifyTextByXpath("//div[contains(text(),'No records to display')]", "No records to display");
		return this;
	}
	
	

}
