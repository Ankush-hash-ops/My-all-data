//package listners_utility;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.testng.ITestResult;
//
//import com.aventstack.extentreports.Status;
//
//import generic_utility.BaseClass;
//
//public class ListImp {
//	
//	@Override
//	public void onTestSuccess(ITestResult result) {
//		String methodName=result.getMethod().getMethodName();
//		test.log(Status.PASS,methodName + "is passed !!!");
//	}
//		
//		
//	
//	
//	@Override
//	public void onTestFailure(ITestResult result)	{
//		String methodName=result.getMethod().getMethodName();
//		
//		TakesScreenshot tks=(TakesScreenshot) BaseClass.sdriver;
//		String filepath=tks.getScreenshotAs(OutputType.BASE64);
//		test.addScreenCaptureFromBase64String(filepath,"ErrorFile");
//		test.log(Status.FAIL, methodNAme +"is failed !!!");
//		
//	}
//	
//	@Override
//	public void onTestSkipped(ITestResult result)	{
//		String methodName=result.getMethod().getMethodName();
//		test.log(Status.SKIP,  methodName +"is skipped!!!");
//	}
//	
//	
//}
package listners_utility;


