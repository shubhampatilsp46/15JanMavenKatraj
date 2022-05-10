package testjava;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava.BaseClass;
import mainjava.DashboardPage;
import mainjava.LoginPage;

public class BaseTest extends BaseClass {

	@BeforeClass
	public void initializingWebEnv() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	
	//STCM
	@BeforeMethod
	public void allPageObject() {
		 login	= new LoginPage(driver);
	     dashboardPage = new DashboardPage(driver);   //at instance of driver
	}
	
	
	
	@AfterClass
	public void tearDownBrowser() {
		driver.quit();
	}
}
