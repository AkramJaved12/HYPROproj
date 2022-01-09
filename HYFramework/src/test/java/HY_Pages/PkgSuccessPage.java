package HY_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PkgSuccessPage {

	
	WebDriver driver = null;
	
	By Succesmsg = By.xpath("//*[@id=\"__next\"]/main/div[1]/div/div[1]");
	By Homebtn = By.xpath("//*[@id=\"__next\"]/main/div[2]/div[5]/div[2]/a");
	String succesmsg=driver.findElement(Succesmsg).getText();
	
	public PkgSuccessPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	
	
	public boolean verifysuccess()
	{
		
		if(succesmsg=="thanks for your booking")
			
			return true;
		
		
					
	    else			
	    
		return false;
	    
	}
	
	
	public void clickHome()
	{
		driver.findElement(Homebtn).click();
	}
	
	
	
	
}
