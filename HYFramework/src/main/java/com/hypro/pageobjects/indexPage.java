package com.hypro.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hypro.baseclass.baseclass;

public class indexPage extends baseclass
{
	
	
	
	
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/main/div/div/div/div/div[3]/a[1]/div/div/div[1]/svg\n" )
	WebElement supplierBtn;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/main/div/div/div/div/div[3]/a[2]/div/div/div[1]/svg")
	WebElement resellerBtn;
	
	@FindBy( xpath = "//*[@id=\"__next\"]/div[2]/main/div/div/div/div/div[1]/a")
	WebElement arabicBtn;
	
	
	
	
	public indexPage()
	{
		
		PageFactory.initElements(getDriver(), this);
	}
	
	public boolean validatesupplierBtn()
	{
		supplierBtn.isDisplayed();
		return true;
	}
	
	
	public SignUppage clickOnSupplier() throws Throwable
	{
		
		supplierBtn.click();
		return new SignUppage();
		
	}
	
	public boolean validateresellerBtn()
	{
		resellerBtn.isDisplayed();
		return true;
	}
	
	

	public SignUppage clickOnReseller() throws Throwable
	{
		
		supplierBtn.click();
		return new SignUppage();
		
	}
		
	
	public boolean validatearabicBtn()
	{
		arabicBtn.isDisplayed();
		return true;
	}	
		
	
	public indexPage clickOnarabic() throws Throwable
	{
		
		arabicBtn.click();
		return new indexPage();
		
	}
		
		
}		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


