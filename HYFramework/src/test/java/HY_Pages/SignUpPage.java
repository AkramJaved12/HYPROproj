package HY_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

	WebDriver driver=null;
	
	By firstname = By.xpath("//*[@id=\"first_name\"]");
	By Lastname = By.xpath("//*[@id=\"last_name\"]");
	By Birthdate = By.xpath("//*[@id=\"dob\"]");
	By Country = By.xpath("//*[@id=\"__next\"]/main/div/div/div/div/div/form/div[3]/div[1]/div/div/div");
	By City = By.xpath("//*[@id=\"__next\"]/main/div/div/div/div/div/form/div[3]/div[2]/div/div/div/div[1]");
	By Mobilenumber= By.xpath("//*[@id=\"cell_number\"]");
	By email = By.xpath("//*[@id=\"email\"]");
	By password = By.xpath("//*[@id=\"email\"]");
	By confirmpass = By.xpath("//*[@id=\"password_confirmation\"]");
	By conditions = By.xpath("//*[@id=\"terms\"]");
	By signupbtn = By.xpath("//*[@id=\"__next\"]/main/div/div/div/div/div/form/div[4]/button");
	By gender = By.xpath("//*[@id=\"gender\"]/span");
	
	public SignUpPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void enterfirstname()
	{
		driver.findElement(firstname).sendKeys("test");
	}
	
	public void enterlastname()
	{
		driver.findElement(Lastname).sendKeys("User");
	}
	
	public void enterbirthdate()
	{
		driver.findElement(Birthdate).click();
		driver.findElement(Birthdate).sendKeys(Keys.ENTER);
	}
	
	
	public void selectgender()
	{
		driver.findElement(gender).click();
	}
	
	
	
	public void entercountry()
	{
		driver.findElement(Country).click();
		driver.findElement(Country).sendKeys(Keys.ENTER);
	}
	
	public void entercity()
	{
		driver.findElement(City).click();
		driver.findElement(City).sendKeys(Keys.ENTER);
	}
	
	
	public void entermobnum()
	{
		driver.findElement(Mobilenumber).sendKeys("559695927");
	}
	
	public void enteremail()
	{
		driver.findElement(email).sendKeys("mohamed.ghouse@uxbert.com");
	}
	
	public void enterpass()
	{
		driver.findElement(password).sendKeys("visionfuck");
	}
	
	
	public void confirmpass()
	{
		driver.findElement(confirmpass).sendKeys("visionfuck");
	}
	
	public void entercond()
	{
		driver.findElement(conditions).click();
	}
	
	public void signupcon()
	{
		driver.findElement(signupbtn).click();
	}
	
	
	public boolean verifysignup()
	{
		if(driver.getCurrentUrl()=="https://hy-web-test.halayalla.rocks/sa-en/profile")
			return true;
				
		else
			return false;
	}
	
	
}



