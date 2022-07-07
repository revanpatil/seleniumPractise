package listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("************ Test Started : " +result.getName());
		
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("************ Test is successful : " +result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("************ Test Failed : " +result.getName());
		
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("************ Test skipped : " +result.getName());
		
	}
	
	public void onStart(ITestContext result) {
		System.out.println("************ Test Started : " +result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("************ Test Started : " +result.getName());
		
	}


	public void onFinish(ITestContext result) {
		System.out.println("************ Tests Completed : " +result.getName());
		
	}
	
	

	

}
