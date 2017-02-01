package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class NewFindLeadPage extends LeafTapsWrappers {
	
	public NewFindLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		driver.manage().window().maximize();

		if(!verifyTitle("Find Leads")){
			reportStep("This is not Login Page", "FAIL");
		}
	}
		
	public NewFindLeadPage enterFromLeadID(String fromleadID) {
		enterByXpathNoSnap("//input[@name='id']", fromleadID);
		return this;
	}
	
	public NewFindLeadPage enterToLeadID(String toleadID) {
		enterByXpathNoSnap("//input[@name='id']", toleadID);
		return this;
	}
	
	
	public NewFindLeadPage clickFindLeadButtoninwindow() {
		clickByXpathNoSnap("(//button[@class='x-btn-text'])[1]");
		return this;
	}
	
	public MergeLeadPage clickFirstLeadinWindow() throws InterruptedException {
		Thread.sleep(2000);
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		switchToParentWindow();
		return new MergeLeadPage(driver, test);
	}

}
