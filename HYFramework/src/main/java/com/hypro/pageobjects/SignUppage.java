package com.hypro.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hypro.baseclass.baseclass;

public class SignUppage extends baseclass {

	
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/main/div/div/div/div/form/div[2]/div[1]/div[2]/input")
	WebElement fullName;
	
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/main/div/div/div/div/form/div[2]/div[2]/div[2]/input")
	WebElement emailAddress;
	
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/main/div/div/div/div/form/div[2]/div[3]/div[2]/input")
	WebElement mobileNumber;
	
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/main/div/div/div/div/form/div[2]/div[4]/div[2]/input")
	WebElement passWord;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/main/div/div/div/div/form/button")
	WebElement createAccount;
	
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/main/div/div/div/div/form/div[3]/a")
	WebElement logInBtn;
	
	
	
	public SignUppage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterfullName(String name)
	{
		fullName.sendKeys(name);
		
	}
	
	public void enteremailAddress(String email)
	{
	    emailAddress.sendKeys(email);
		
	}
	
	

	public void entermobileNum(String number)
	{
	    mobileNumber.sendKeys(number);
		
	}
	
	
	public void enterpassWord(String passwrd)
	{
	   passWord.sendKeys(passwrd);
		
	}
	
	
	
	public void clickCreateAccount()
	{
		
	   createAccount.click();
		
	}
	
	public loginpage clickLoginbtn()
	{
		
	   logInBtn.click();
	   return new loginpage();
		
	}
	
	
	
}

	
	
	

