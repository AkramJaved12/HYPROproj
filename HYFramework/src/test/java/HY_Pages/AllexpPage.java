package HY_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllexpPage {

	
	
WebDriver driver = null;
	
	By chooseHYpkg = By.xpath("//*[@id=\"__next\"]/main/section/div/div[1]/a[1]/div/div[3]/div[2]");
	By chooseVSPkg = By.xpath("//*[@id=\"__next\"]/main/section/div/div[1]/a[1]/div/div[3]/div[2]");
	
	public AllexpPage(WebDriver driver)
	{
		
		
		this.driver=driver;
		
		
	}
	
	public void chooseHYpkgclick()
	{
		
		driver.findElement(chooseHYpkg).click();
	
	
	
	
	
	
}
	
	public void chooseVSpkgclick()
	{
		
		driver.findElement(chooseVSPkg).click();
	
	
	
    }
}





