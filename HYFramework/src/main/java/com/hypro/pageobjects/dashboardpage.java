package com.hypro.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hypro.baseclass.baseclass;

public class dashboardpage extends baseclass {
	
	
	
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/header/nav/div/ul/li[1]/div/a")
	WebElement Productlistbtn;
	
	
	
	
	public dashboardpage()
	{
		
		PageFactory.initElements(driver, this);
	}

	
	
	public boolean  validateproductlist()
	{
		
		
		return Productlistbtn.isDisplayed();
		
				
		
	}
	
	
	
	
}