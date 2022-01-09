package HY_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LaunchPage {

	
	
	WebDriver driver=null;
	
	By Login_btn = By.xpath("//*[@id=\"__next\"]/header/div[1]/div[2]/a");
	By Arabic_btn = By.xpath("//*[@id=\"__next\"]/header/div[1]/div[2]/div/a");
	
	By ExploreHYbtn = By.xpath("//*[@id=\"__next\"]/main/section[1]/div/div[1]/div/div/a");
	By ExploreVSbtn = By.xpath("//*[@id=\"__next\"]/main/div[4]/div[3]/div[2]/div[1]/div[1]/div/div/a");
	By HY_pkg = By.xpath("//*[@id=\"__next\"]/main/section[1]/div/div[2]/div/div/div[1]/a/div/div[3]/div[2]");
	By VS_Pkg = By.xpath("//*[@id=\"__next\"]/main/div[4]/div[3]/div[2]/div[1]/div[2]/div/div/div[1]/a/div/div[3]/div[2]");
	
	public LaunchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void clicklogin()
	{
		
		driver.findElement(Login_btn).click();
		
		
		
		
		
	}
	
	public void clickArabicbtn()
	{
		driver.findElement(Arabic_btn).click();
	}
	
	
	
	public void clickhypkg()
	{
		
		driver.findElement(HY_pkg).click();
	}
	
	
	public void clickVSpkg()
	{
		driver.findElement(VS_Pkg).click();
	}
	
	public void exploreHYclick()
	{
		driver.findElement(ExploreHYbtn).click();
	}
	public void exploreVSclick()
	{
		driver.findElement(ExploreVSbtn).click();
	}
	
	
}
