package HY_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PkgPaymentPage {

	
	WebDriver driver=null;
	
	By Holdername = By.xpath("//*[@id=\"holderName\"]");
	By CardNum = By.xpath("//*[@id=\"number\"]");
	By Month = By.xpath("//*[@id=\"expmonth\"]");
	By Year = By.xpath("//*[@id=\"expyear\"]");
	By Cvv = By.xpath("//*[@id=\"cvv\"]");
	By Paybtn = By.xpath("//*[@id=\"payBtn\"]");
	
	
	public PkgPaymentPage(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void Entername() 
	{
		
	    driver.findElement(Holdername).sendKeys("test User");
	}
	
	
	public void entercardnum()
	{
		driver.findElement(CardNum).sendKeys("4000000000000002");
	}
	
    
	public void entermonth()
	{
		driver.findElement(Month).sendKeys("08");
	}
	
	public void enteryear()
	{
		driver.findElement(Year).sendKeys("24");
	}
	
	public void enterCvv()
	{
		driver.findElement(Cvv).sendKeys("123");
	}
	
	public void Payclick()
	{
		driver.findElement(Paybtn).click();
	}
	
	
}
