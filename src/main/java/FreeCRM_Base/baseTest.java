package FreeCRM_Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseTest {
	public  WebDriver driver;

	@BeforeMethod 
	public void invokeBrowser() {
		String Projectpath= System.getProperty("user.dir");  /**Setting up user directory path*/
		System.out.println(Projectpath);  

		String DriverPath= Projectpath+"/driver/chromedriver.exe" ;   /**Setting up driver directory path */
		System.out.println(DriverPath);              

		System.setProperty("webdriver.chrome.driver", DriverPath);    /** Setting up chromediver path as a environment varaialble*/

		driver = new ChromeDriver();    /** Creating object of Webdriver interface with refernece of ChromeDriver class*/
		driver.get("https://classic.crmpro.com/login.cfm");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	
	//AfterMethod
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}


}
