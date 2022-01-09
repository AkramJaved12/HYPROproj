package HY_Pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PkgPaymentDetailsPage {
	
	
	
	WebDriver driver= null;
	
	By enterdetails = By.xpath("//*[@id=\"__next\"]/main/div[2]/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/div[3]/button[2]/span");
	By ProceedPaymenbtn = By.xpath("//*[@id=\"__next\"]/main/div[2]/div/div[2]/div[2]/div/div[1]/button");
	By NoofPpl = By.xpath("//*[@id=\"__next\"]/main/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div[3]/button");
	By TimeSlot = By.xpath("//*[@id=\"__next\"]/main/div/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[2]/button[2]");
	By PricingVSbtn= By.xpath("//*[@id=\"__next\"]/main/div[2]/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/div[3]/button[2]/span");
	By ChooseVSdate = By.xpath("//*[@id=\"__next\"]/main/div[2]/div/div[2]/div[1]/div[2]/div/div/div/label/div/div/input");
	
	
	public PkgPaymentDetailsPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
      
	
	public void chooseNumberofppl()
	{
		
		
		driver.findElement(NoofPpl).click();
	}
	
	
	public void timeSlotclick()
	{
		
		driver.findElement(TimeSlot).click();
	}
	
	
	public void Paymentclick()
	{
		
		driver.findElement(ProceedPaymenbtn).click();
	}
	
	public void PricingVSclick()
	{
		
		driver.findElement(PricingVSbtn).click();
	}
	
	public void choosedateclick()
	{
		
		driver.findElement(ChooseVSdate).click();
	}
	
	
	
}
