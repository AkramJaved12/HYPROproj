package HY_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PkgDetailsPage {

	
	WebDriver driver = null;
	
	By Bookbtn = By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div/div/div/div[2]/button");
	
	
	public PkgDetailsPage(WebDriver driver)
	{
		
		
		this.driver=driver;
		
		
	}
	
	public void bookbtnclick()
	{
		
		driver.findElement(Bookbtn).click();
	}
	
	
	
	
	
	
	
}
