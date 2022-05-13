package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class DashboardPage extends BaseClass {

	
	@FindBy(xpath="//h1[text()='Dashboard']")
	WebElement titleOfDashboard;
	
	@FindBy(id="welcome")
	WebElement drpDownWelCome;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement btnLogout;
	
	
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public boolean titleOfPage() {
		String titleDashBoard = titleOfDashboard.getText();
		if(titleDashBoard.equals("Dashboard"))
			return true;
			else
				return false;
	}
	
	public void logoutMethod() {
		drpDownWelCome.click();
		WebDriverWait explicitWaittt = new WebDriverWait(driver, 10);
		explicitWaittt.until(ExpectedConditions.elementToBeClickable(btnLogout));
		btnLogout.click();
	}
}
