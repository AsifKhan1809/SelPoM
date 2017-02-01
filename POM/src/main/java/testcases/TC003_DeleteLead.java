package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC003_DeleteLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Delete Lead";
		testDescription="To Delete a Lead";
		browserName="chrome";
		dataSheetName="TC_003";
		category="Smoke";
		authors="Asif";
	}

	@Test(dataProvider="fetchData")
	public void deleteLead(String userName, String passWord, String countrycode, String areacode, String phonenumber, String leadID ){

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickPhoneTab()
		.enterCountryCode(countrycode)
		.enterAreaCode(areacode)
		.enterPhoneNumber(phonenumber)
		.clickFindLeadButton()
		.clickFirstLead()
		.clickDeleteButton()
		.clickFindLeads()
		.enterLeadID(leadID)
		.clickFindLeadButton()
		.verifyErrorMessage();
		
		
		

	}

}
