package FreeCRM_PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FreeCRMLoginPO {
	public WebDriver driver;

	public FreeCRMLoginPO(WebDriver driver){
		this.driver= driver;
		
	}

	By username = By.xpath("//input[@name='username']");
	By password = By.xpath("//input[@name='password']");
	By loginButton = By.xpath("//input[@type='submit']");


	public void enterUsername() {
		driver.findElement(username).sendKeys("himansja");
		
		
	}

	public void enterPassword() {
		driver.findElement(password).sendKeys(("ispl123#"));
	}

	public void submitLoginButton() {
		driver.findElement(loginButton).click();

	}

	public String getTitle() {
		String pageTitle= driver.getTitle();
		return pageTitle;
	}

	public boolean isLoginButtonClickable() {
		return driver.findElement(loginButton).isEnabled();              
	}
}
