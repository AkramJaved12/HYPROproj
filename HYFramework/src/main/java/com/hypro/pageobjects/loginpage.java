package com.hypro.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hypro.baseclass.baseclass;

public class loginpage extends baseclass {
	
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/main/div/div/div/div/form/div[2]/div[1]/div[2]/input")
	WebElement loginEmailAddress;
	
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/main/div/div/div/div/form/div[2]/div[2]/div[2]/input")
	WebElement loginpassWord;
	
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/main/div/div/div/div/form/div[3]/a")
	WebElement forgotPassword;
	
	
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/main/div/div/div/div/form/button")
	WebElement loginmainbtn;

	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/main/div/div/div/div/form/div[4]/a")
	WebElement signmainbtn;
	
	
	
	
	public loginpage()
	{
		
		PageFactory.initElements(getDriver(), this);
	}
	
	
	
	public void enterloginemailaddress(String loginemail)
	{
		loginEmailAddress.sendKeys(loginemail);
	}
	
	
	
	public void enterloginpasswordbtn(String loginpasswordvalue)
	{
		loginpassWord.sendKeys(loginpasswordvalue);
	}
	
	
	public forgotpasswordpage clickforgotpasswordbtn()
	{
		forgotPassword.click();
		return new forgotpasswordpage();
	}
	
	public dashboardpage clickloginmainbtn()
	{
		loginmainbtn.click();
		return new dashboardpage();
		
	}
	
	public SignUppage entersignmainbtn()
	{
		signmainbtn.click();
		return new SignUppage();
	}
	

	
	
	
	
	
}
