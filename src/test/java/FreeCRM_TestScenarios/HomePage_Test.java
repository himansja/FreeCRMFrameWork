package FreeCRM_TestScenarios;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import FreeCRM_Base.baseTest;
import FreeCRM_Modules.HomePageModule;
import FreeCRM_Modules.LoginModule;

public class HomePage_Test extends baseTest{
	
	LoginModule login;
	HomePageModule homepage;
	
	@BeforeMethod()
	public void setup() {
		login = new LoginModule(driver);
		homepage = new HomePageModule(driver);
		login.LoginFreeCRMModule();
		driver.switchTo().frame("mainpanel");
	}
	
	@Test
	public void navigateToContactNewContact() {
		String newContactTitle= homepage.clickContactsNewContact();
		System.out.println(newContactTitle);
		Assert.assertEquals(newContactTitle, "CRMPRO");
	}
	
	@Test
	public void navigatetoCompaniesNewCompany() {	
		String newCompany = homepage.clickCompaniesNewCompany();
		System.out.println(newCompany);
		Assert.assertEquals(newCompany, "CRMPRO");
	}
	
	@Test
	public void verifyaddBoxesPopUpdisplayed() {
		String title =homepage.addBoxesAlertPopUpTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Add Home Boxes");
	}
	
	@Test
	public void verifyAddCalendar() {
		
	}
}
