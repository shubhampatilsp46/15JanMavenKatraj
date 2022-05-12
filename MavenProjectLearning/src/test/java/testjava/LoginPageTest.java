package testjava;

import org.testng.annotations.Test;
import org.testng.Assert;


public class LoginPageTest extends BaseTest {

	@Test(priority=1)
	public void verifyLoginFunctionality() {
		login.loginMethod("Admin","admin123");
		boolean verifyLoginIsSuccessful = dashboardPage.titleOfPage();
		Assert.assertEquals(verifyLoginIsSuccessful, true);
	}
	
	@Test(priority=0)
	public void verifyTitleOfPage() {
		boolean titlePageIsVerified = login.titleOfLoginPage();
		Assert.assertEquals(titlePageIsVerified, true);
	}
	
	@Test(priority=-1)
	public void verifyUrlOfPage() {
		boolean urlOfWebPageIsVerfied = login.urlOfLoginPage();
		Assert.assertEquals(urlOfWebPageIsVerfied, true);
	}
}
