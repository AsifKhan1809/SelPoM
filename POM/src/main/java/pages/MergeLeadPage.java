package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MergeLeadPage extends LeafTapsWrappers {
	
	public MergeLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Merge Leads | opentaps CRM")){
			reportStep("This is not Login Page", "FAIL");
		}
	}
	
	public NewFindLeadPage clickFromLeadIcon() throws InterruptedException {
		clickByXpathNoSnap("(//img[@alt='Lookup'])[1]");
		switchToLastWindow();
		Thread.sleep(2000);
		return new NewFindLeadPage(driver, test);
	}
	
	public NewFindLeadPage clickToLeadIcon() {
		clickByXpathNoSnap("(//img[@alt='Lookup'])[2]");
		switchToLastWindow();
		return new NewFindLeadPage(driver, test);
	}
	
	public ViewLeadPage clickMergeLeadButton() throws InterruptedException {
		clickByXpathNoSnap("//a[@class='buttonDangerous']");
		Thread.sleep(2000);
		acceptAlert();
		return new ViewLeadPage(driver, test);
	}
	
	
	
	
	
}