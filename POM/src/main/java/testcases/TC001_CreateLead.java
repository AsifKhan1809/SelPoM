package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC001_CreateLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="CreateLead";
		testDescription="To Create a Lead";
		browserName="chrome";
		dataSheetName="TC_001";
		category="Smoke";
		authors="Asif";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String userName, String passWord,
		 String companyname, String firstname, String lastname, String countrycode, String areacode, String phonenumber, String email ){

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(companyname)
		.enterFirstname(firstname)
		.enterlastname(lastname)
		.enterCountryCode(countrycode)
		.enterAreaCode(areacode)
		.enterPhoneNumber(phonenumber)
		.enterEmailAddress(email)
		.clickSubmit();
	}

}
