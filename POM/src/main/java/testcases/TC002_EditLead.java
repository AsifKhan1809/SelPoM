package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC002_EditLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="EditLead";
		testDescription="To Edit a Lead";
		browserName="chrome";
		dataSheetName="TC_002";
		category="Smoke";
		authors="Asif";
	}

	@Test(dataProvider="fetchData")
	public void editLead(String userName, String passWord, String firstname, String companyname){

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.enterFirstName(firstname)
		.clickFindLeadButton()
		.clickFirstLead()
		.clickEditButton()
		.changeCompanyName(companyname)
		.clickUpdateButton();
		

	}

}
