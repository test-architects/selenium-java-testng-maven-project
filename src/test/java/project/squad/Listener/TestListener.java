package project.squad.Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import project.squad.Reporter.ReportClass;
import project.squads.BaseTest;

public class TestListener extends BaseTest implements ITestListener {

	ExtentReports reporter = ReportClass.GenerateTestReportObject();
	ExtentTest test;

	// Create a new test in the report for each test method
	@Override
	public void onTestStart(ITestResult result) {
		test = reporter.createTest(result.getMethod().getMethodName());
	}

	// Log the result of the successful test
	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test is PASSED: " + result.getMethod().getMethodName());
	}

	// Log the result of the failed test
	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test is FAILED: " + result.getMethod().getMethodName());
		test.log(Status.FAIL, result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test is SKIPPED: " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// Not needed in this case
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		test.log(Status.FAIL, "Test FAILED with Timeout: " + result.getMethod().getMethodName());
	}

	// Flush the report and open it in the browser after all tests have finished
	@Override
	public void onFinish(ITestContext context) {
		reporter.flush();
		if (context.getSuite().getXmlSuite().getFileName() != null) {
			ReportClass.OpenGeneratedReport();
		}
	}
}
