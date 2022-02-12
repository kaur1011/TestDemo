package base;

import java.io.IOException;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utilities.ProjectScreenShot;

public class ProjectListener extends ProjectScreenShot implements ITestListener,ISuiteListener{
	


		public void onTestStart(ITestResult result) {
			// TODO Auto-generated method stub
			System.out.println("Test Case is Starting");
		}

		public void onTestSuccess(ITestResult result) {
			// TODO Auto-generated method stub
			System.out.println("Result was: success");
			
		}

		public void onTestFailure(ITestResult result) {
			// TODO Auto-generated method stub
			System.out.println("captured");
			try {
				getScreenshot();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		public void onTestSkipped(ITestResult result) {
			// TODO Auto-generated method stub
			System.out.println("Test was skipped!");
			
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub
			
		}

		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
			
		}

		public void onStart(ISuite suite) {
			// TODO Auto-generated method stub
			
		}

		public void onFinish(ISuite suite) {
			// TODO Auto-generated method stub
			
		}

		

	}


	


