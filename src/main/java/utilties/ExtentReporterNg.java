package utilties;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporterNg {
	static ExtentReports extent;
	public static ExtentReports getReportObject()
	{
		
		String path =System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Automation Report");
		reporter.config().setTheme(Theme.DARK);
		
		 extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("OS", "Windows10");
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("Tester", "Kishan Kumar");
		return extent;
		
	}

}
