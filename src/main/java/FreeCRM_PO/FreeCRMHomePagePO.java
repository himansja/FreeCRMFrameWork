package FreeCRM_PO;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FreeCRMHomePagePO {

	WebDriver driver;

	Actions action;


	@FindBy(xpath ="//a[@title=\"Contacts\"]")
	WebElement contacts;

	@FindBy(xpath ="//a[@title='New Contact']")
	WebElement newContact;

	@FindBys(@FindBy(xpath="//option[@value='']"))
	List<WebElement> dropdownOption;

	@FindBy(xpath ="//a[@title='Companies']")
	WebElement companies;

	@FindBy(xpath ="//a[@title='New Company']")
	WebElement newCompany;

	@FindBy(xpath ="//a[@onclick='addHomeBoxPanel();']")
	WebElement AddBoxes;
	
	@FindBy(xpath= "//div[@id='ibox_footer']")
	WebElement AddBoxesPopup;

	/** other way to use Page Factory
	@FindBy(how = How.XPATH, using="//a[@title='New Contact']")
	WebElement newContact1;   */

	public FreeCRMHomePagePO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}


	public String getHomePageTitle() {
		return driver.getTitle();
	}

	public void clickContacts() {
		action.moveToElement(contacts).build().perform();
		newContact.click();
	}

	public void clickCompanies() {
		action.moveToElement(companies).build().perform();
		newCompany.click();
	}

	public String clickAddBoxes() {
		AddBoxes.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String popUpTitle =AddBoxesPopup.getText();
		System.out.println(popUpTitle);
		return popUpTitle;
	}
	
	

}
