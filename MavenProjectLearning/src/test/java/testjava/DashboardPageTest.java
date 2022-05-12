package testjava;

import org.testng.annotations.Test;
import org.testng.Assert;

public class DashboardPageTest extends BaseTest {

	@Test(priority=5)
	public void verfiyLogoutFunctionality() {
		login.loginMethod("Admin","admin123");
		dashboardPage.logoutMethod();
		boolean verifySuccessfullyLogout = login.btnLoginDisplayed();
		Assert.assertEquals(verifySuccessfullyLogout, true);
	}
}
