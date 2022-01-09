package com.hypro.utilityclass;


	
	
	public class ListenerClass extends ExtentManager implements ITestListener {

		public void onTestStart(ITestResult result)
		{

		test= extent.createTest(result.getName());
		Test.createNode(result.getName());
		}

		public void onTestSuccess(ITestResult result)
		{
		  if(result.getStatus() == ITestResult.SUCCESS)
		{
		Test.log(Status.PASS , “Pass test case is:”  + result.getName());
		}
		}

		public void onTestFailure(ITestResult result)
		{

		if(result.getStatus() == ITestResult.FAILURE)
		{

		try {

		    test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() +  “ - Test case failed”);

		    test.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() +  “ - Test case failed”);

		String imgPath = captureScreenshot(BaseClass.getDriver() , result.getName());
		test.fail(“Screenshot is attached” , MediaEntityBuilder.createScreenshot;
		}

		catch(IOException e)
		{
		e.printStackTrace();
		}
		}


}
