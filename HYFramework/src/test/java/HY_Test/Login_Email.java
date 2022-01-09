package HY_Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import HY_Pages.EmailLogin;
import HY_Pages.LaunchPage;
import HY_Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Email {
	
	
	private static WebDriver driver = null;
	
  static Logger log = LogManager.getLogger(Login_Email.class);
	
	 //public static void main(String[]args)
	//{
	//	testlogin();
	//}
	static  ExtentTest test;
	static ExtentReports extent;
	static ChromeOptions options;
	static DesiredCapabilities cap;
	
	

	@BeforeSuite
	public void setupmain()
	{
		
	ExtentSparkReporter htmlreporter = new ExtentSparkReporter("Extent.htm");
		
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		
		 test = extent.createTest("test1","test2");
		 
		 
		/*try {
		 testlogin();
		}
		catch(Exception e)
		{

			System.out.println(e.getMessage());

			System.out.println(e.getCause());
			
			e.printStackTrace();
			*/
			
		}
	
	
	
	
	
	
	
	
	@BeforeTest
	public void SetUp()
	{
	
		cap=DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		
		//options= new ChromeOptions();
		//options.addEncodedExtensions("--incognito");
		//cap.setCapability(ChromeOptions.CAPABILITY, options);
		
		
		
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		
	}
	
	@Test
	public static void testlogin() throws Exception
	
	{
		//System.setProperty("webdriver.driver.chromedriver"), "/Users/mohanned/eclipse-workspace/HYFramework/Drivers/Chromedriver/chromedriver 4");
		
		//try {
		
		
		test.log(Status.INFO,"test has begun");
		
		
		driver.get("https://hy-web-test.halayalla.rocks/sa-en");
	   test.pass("test has passed");
	   test.addScreenCaptureFromBase64String(null);
		
		LaunchPage testlaunch = new LaunchPage(driver);
		
		testlaunch.clicklogin();
		test.fail((Markup) MediaEntityBuilder.createScreenCaptureFromBase64String("one"));
		test.addScreenCaptureFromBase64String("String1");
		log.info("started");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LoginPage testlogin = new LoginPage(driver);
		
		testlogin.email_click();
		log.debug("yes");
		
		EmailLogin testemail = new EmailLogin(driver);
		
		testemail.Email_Enter();
		log.fatal("test");
		
		testemail.Password_Enter();
		log.error("yes");
		
		//throw new ArithmeticException("syso");
		
		testemail.loginclick();
		log.trace("trace");
		
		//}
		/*catch(Exception e)
		{
			e.getCause();
			e.getMessage();
			e.printStackTrace();
		}
		finally
		{
			System.out.println("finally");
		}
		*/
	}
	
	
	@AfterTest
	public void teardownsub()
	{
		driver.close();
		driver.quit();
		test.info("test complete");
		
	}
	
	
	
	
	
	
	@AfterSuite
	public void teardown()
	{
	
		extent.flush();
	}
		
		
		
		
		
		
		

		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


