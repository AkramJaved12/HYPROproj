package com.hypro.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import com.hypro.baseclass.baseclass;
import com.hypro.pageobjects.SignUppage;
import com.hypro.pageobjects.indexPage;
import com.hypro.pageobjects.loginpage;
import com.hypro.pageobjects.dashboardpage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

	public class loginfirstcase extends baseclass {

		indexPage indexPage;
		SignUppage SignUppage;
		loginpage loginpage;
		dashboardpage dashboardpage;
		
		
		
		
		public static void main(String[] args)
		{
			
		}
		
		
		
		@Parameters("browser")
		@BeforeMethod(groups = "smoke")
		public void setUp()
		{
			launchApp();
			
		}
		
		
		@Parameters("browser")
		@AfterMethod(groups = "smoke")
		public void tearDown()
		{
			driver.quit();
		
		}
		
		@Test(dataProvider = "credentials" , dataProviderClass = DataProvider.class)
		public void logintestcase(String uname, String pswd) throws Throwable
		{
			
			
			
			
			
			log.startTestcase("logintestcase");
			SignUppage=indexPage.clickOnSupplier();
			loginpage=SignUppage.clickLoginbtn();
			loginpage.enterloginemailaddress(uname);
			loginpage.enterloginpasswordbtn(pswd);
			dashboardpage = loginpage.clickloginmainbtn();
			log.endTestcase("logintestcase");
			
			
			
			
		
			
		}
		
		

	
	
	
	
	
	
	
	

}
