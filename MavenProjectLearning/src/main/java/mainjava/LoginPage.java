package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage extends BaseClass {

	//all locators 
	
	@FindBy(id = "txtUsername")
	WebElement username;
	
	@FindBy(id = "txtPassword")
	WebElement password;
	
	@FindBy(id = "btnLogin")
	WebElement btnLogin;
	
	
	//initalization of page variable (locators) of current page
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//Steps 
	
	public void loginMethod(String userNameData, String passwordData) {
		username.sendKeys(userNameData);
		password.sendKeys(passwordData);
		btnLogin.click();
	}
	
	public boolean titleOfLoginPage() {
		String title = driver.getTitle();
		if(title.equals("OrangeHRM"))
			return true;
			else 
				return false;
	}
	
	public boolean urlOfLoginPage() {
		String url = driver.getCurrentUrl();
		if(url.equals("https://opensource-demo.orangehrmlive.com/"))
			return true;
		else
			return false;
	}
	
	public boolean btnLoginDisplayed() {
		boolean btnPresence = btnLogin.isDisplayed();
		return btnPresence;
	}
}



















