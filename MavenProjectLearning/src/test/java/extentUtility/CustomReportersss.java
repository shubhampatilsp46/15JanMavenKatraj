package extentUtility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class CustomReportersss {

	public static ExtentReports extent;
	
	public static ExtentReports extentReporterGenrator() {
		
		String path = System.getProperty("user.dir")+"\\reports\\VelocityBatchExtentReport.html";
		ExtentHtmlReporter extentHtmlReporterr = new ExtentHtmlReporter(path);
		extentHtmlReporterr.config().setReportName("Regression Test Report");
		extentHtmlReporterr.config().setDocumentTitle("Velocity Testing Regression Suit");
		extentHtmlReporterr.config().setTheme(Theme.DARK);
		extentHtmlReporterr.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a'('zzz')'");
		
		extent = new ExtentReports();
		extent.setSystemInfo("Os", "Windows");
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("Org", "Velocity");
		extent.attachReporter(extentHtmlReporterr);
		return extent;
	}
}
