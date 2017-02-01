package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC004_MergeLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Merge Lead";
		testDescription="To Merge a Lead";
		browserName="chrome";
		dataSheetName="TC_004";
		category="Smoke";
		authors="Asif";
	}

	@Test(dataProvider="fetchData")
	public void deleteLead(String userName, String passWord, String fromleadID, String toleadID) throws InterruptedException{

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLeads()
		.clickFromLeadIcon()
		.enterFromLeadID(fromleadID)
		.clickFindLeadButtoninwindow()
		.clickFirstLeadinWindow()
		.clickToLeadIcon()
		.enterToLeadID(toleadID)
		.clickFindLeadButtoninwindow()
		.clickFirstLeadinWindow()
		.clickMergeLeadButton()
		.clickFindLeadButton()
		.enterLeadID(fromleadID)
		.clickFindLeadButton()
		.verifyErrorMessage();
	}

}
