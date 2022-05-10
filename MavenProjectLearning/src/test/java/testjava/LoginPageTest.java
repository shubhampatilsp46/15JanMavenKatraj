package testjava;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginPageTest extends BaseTest {

	@Test(priority=1)
	public void verifyLoginFunctionality() {
		login.loginMethod("Admin","admin123");
		boolean verifyLoginIsSuccessful = dashboardPage.titleOfPage();
		AssertJUnit.assertEquals(verifyLoginIsSuccessful, true);
	}
	
	@Test(priority=0)
	public void verifyTitleOfPage() {
		boolean titlePageIsVerified = login.titleOfLoginPage();
		AssertJUnit.assertEquals(titlePageIsVerified, true);
	}
	
	@Test(priority=-1)
	public void verifyUrlOfPage() {
		boolean urlOfWebPageIsVerfied = login.urlOfLoginPage();
		AssertJUnit.assertEquals(urlOfWebPageIsVerfied, true);
	}
}
