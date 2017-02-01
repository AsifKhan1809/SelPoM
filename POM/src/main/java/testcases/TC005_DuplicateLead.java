package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC005_DuplicateLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Duplicate Lead";
		testDescription="To Duplicate a Lead";
		browserName="chrome";
		dataSheetName="TC_005";
		category="Smoke";
		authors="Asif";
	}

	@Test(dataProvider="fetchData")
	public void deleteLead(String userName, String passWord, String email ){

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickEmailTab()
		.enterEmailAdress(email)
		.clickFindLeadButton()
		.clickFirstLead()
		.clickDuplicateLeadButton()
		.clickCreateLead();
		
		
		
		

	}

}
