package com.hypro.utilityclass;




 
import java.io.File;
 
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.observer.ExtentObserver;
import com.aventstack.extentreports.reporter.ExtentReporter;

 


public class ExtentReportsClass {

public static ExtentObserver[] htmlReporter;
public static ExtentReports extent;
public static ExtentTest test;

public static void setExtent()
{

	htmlReporter = new ExtentReporter("/Users/mohanned/eclipse-workspace/HYFramework/test-output/extentreport");
htmlReporter.loadXMLConfig("/Users/mohanned/eclipse-workspace/HYFramework/test-output/extent-config.xml");


extent = new ExtentReports();
extent.attachReporter(htmlReporter);


extent.setSystemInfo(“Hostname” , “MyHost”);
extent.setSystemInfo(“Projectname” , enterprojectname);
extent.setSystemInfo(“Tester” , “Akram”);
extent.setSystemInfo(“OS” , “MAC”);
extent.setSystemInfo(“Browser” , “Chrome”);

}

public static void endReport(){

extent.flush();
}
}
