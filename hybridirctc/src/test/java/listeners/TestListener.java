package listeners;

import org.testng.*;
import com.aventstack.extentreports.*;
import utils.ExtentManager;
import utils.ScreenshotUtil;
import base.BaseTest;

public class TestListener implements ITestListener {

ExtentReports extent = ExtentManager.getReport();
ExtentTest test;

public void onTestStart(ITestResult result){

test = extent.createTest(result.getName());

}

public void onTestSuccess(ITestResult result){

test.pass("Test Passed");

}

public void onTestFailure(ITestResult result){

try{
String path = ScreenshotUtil.capture(BaseTest.driver,result.getName());
test.fail("Test Failed").addScreenCaptureFromPath(path);
}catch(Exception e){}

}

public void onFinish(ITestContext context){

extent.flush();

}
}