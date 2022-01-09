package HY_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailLogin {
	
	
	
	WebDriver driver=null;
	
	
	By Email_box = By.xpath("//*[@id=\"email\"]");
	
	By Password_box = By.xpath("//*[@id=\"password\"]");

	By Login_btn = By.xpath("//*[@id=\"email-form\"]/form/button[1]");
	
	By SignUp_btn = By.xpath("//*[@id=\"email-form\"]/form/button[2]");
	
	
	public EmailLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void Email_Enter()
	{
		
		driver.findElement(Email_box).sendKeys("mohamed.ghouse+test5@uxbert.com");
	}
	
	
	public void Password_Enter()
	{
		driver.findElement(Password_box).sendKeys("12345678");
	}
	
	public void loginclick()
	{
		
		driver.findElement(Login_btn).click();
		
	}
	
     
	public void SignUpclick()
	{
		driver.findElement(SignUp_btn).click();
		
	}
}
