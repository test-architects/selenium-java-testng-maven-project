package project.squad.Reporter;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportClass {

	
    public static ExtentReports GenerateTestReportObject() {
        String html_report_file_path = System.getProperty("user.dir") + "//reports/index.html";

        ExtentSparkReporter extent_spark_reporter = new ExtentSparkReporter(html_report_file_path);
        extent_spark_reporter.config().setDocumentTitle("Test Results");
        extent_spark_reporter.config().setReportName("Your Test Execution Report");

        ExtentReports extent_report = new ExtentReports();
        extent_report.attachReporter(extent_spark_reporter);
        extent_report.setSystemInfo("Test Engineer Name", "vijay devarkonda");
        

        return extent_report;
    }
    
	public static void OpenGeneratedReport() {
		try {
			// Create a File object for the HTML file
			File htmlFile = new File(System.getProperty("user.dir") + "//reports/index.html");

			// Check if the Desktop class is supported
			if (Desktop.isDesktopSupported()) {
				Desktop desktop = Desktop.getDesktop();
				// Open the HTML file in the default web browser
				desktop.open(htmlFile);
			} else {
				System.out.println("Desktop is not supported on this system.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
