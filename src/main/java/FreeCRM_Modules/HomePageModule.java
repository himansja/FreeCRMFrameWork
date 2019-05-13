package FreeCRM_Modules;

import org.openqa.selenium.WebDriver;
import FreeCRM_PO.FreeCRMHomePagePO;

public class HomePageModule {
	WebDriver driver;
	FreeCRMHomePagePO homepagePO;


	public HomePageModule(WebDriver driver){
		this.driver = driver;
		homepagePO = new FreeCRMHomePagePO(driver);
	}

	public String clickContactsNewContact() {
		homepagePO.clickContacts();
		return driver.getTitle();

	}

	public String clickCompaniesNewCompany() {
		homepagePO.clickCompanies();
		return driver.getTitle();
	}

	public String  addBoxesAlertPopUpTitle()  {
		String popTitle =homepagePO.clickAddBoxes();
		System.out.println(popTitle);
		return popTitle;
	}


}






