package com.hypro.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	
	
	
	
	
	
	public static Properties prop;
	//public static WebDriver driver;
	
	//Declare threadlocaldriver
	public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
	
	public static WebDriver getDriver()
	{
		//Get Driver from threadlocalmap
		return driver.get();
	}


	@BeforeSuite
	public void loadConfig()
	{

	try{

	   prop= new Properties();
	   ExtentManager.setExtent();
	   DOMConfigurator.configure("log4j.xml")
	   //System.out.println(“Super constructor invoked”);
	  
	  //FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + “\\configuration\\config.properties” + prop.load(ip));
	  
	  FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "\\configuration\\config.properties");
	  
				prop.load(ip);
	  //System.out.println(“Driver:” + driver);

	}
	 catch(FileNotFoundException e) {
	e.printStackTrace();
	}
	 catch(IOException e)
	{
	
	e.printStackTrace();
	}
	
	}



	public static void launchApp() 
	{  WebDriverManager.chromedriver().setup();
	    String browserName = prop.getProperty("browser");
	 
	    if(browserName.contains("Chrome"))
	    {
	     driver = new ChromeDriver();
	}
	  else if(browserName.contains("FireFox"))
	  {
	     driver = new FirefoxDriver();
	}
	   else if(browserName.contains("IE"))
	   {
	     driver = new InternetExplorerDriver();
	}
	}
	
@AfterSuite
public void afterSuite()
{
	ExtentManager.endreport();
	
}
	
}

	
	
	


