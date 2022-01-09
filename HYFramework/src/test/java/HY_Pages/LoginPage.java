package HY_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	
	
	
	
	WebDriver driver=null;
	
	By Fb_btn = By.xpath("//*[@id=\"options-menu\"]/div/div[1]/button");
	By gmail_btn = By.xpath("//*[@id=\"options-menu\"]/div/div[2]/button");
	By email_btn = By.className("styles_social-btn__BK8v6 justify-center h-10");
	By Fb_email_box = By.xpath("//*[@id=\"email\"]");
	By Fb_password_box = By.xpath("//*[@id=\"pass\"]");
	By Fb_login_accpt = By.xpath("//*[@id=\"u_0_0_O2\"]");
	By FB_okay_btn = By.xpath("//*[@id=\"platformDialogForm\"]/div[3]/div/table/tbody/tr/td[2]/button");
	By google_email= By.xpath("//*[@id=\"identifierId\"]");
	By google_pass = By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input");
	By googlenext= By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]");	
	By gmailpassnext= By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]");
	By resultmsg = By.xpath("//*[@id=\"headingText\"]/span");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void click_fb()
	{
		
		driver.findElement(Fb_btn).click();
	}
	
	
	public void gmail_click()
	{
		
		driver.findElement(gmail_btn).click();
		
	}
	
    public void email_click()
    {
    	driver.findElement(email_btn).click();
    	
    }
    
    public void enterfbemail()
    {
    	driver.findElement(Fb_email_box).sendKeys("birjshin@gmail.com");
    }
    
    public void enterfbpass()
    {
    	driver.findElement(Fb_password_box).sendKeys("visionfuck");
    }
    
    public void fbaccept()
    {
    	driver.findElement(FB_okay_btn).click();
    }
    
    
    
    public boolean verifyfb()
    {
    	if(driver.findElement(FB_okay_btn).getText()=="Okay")
    		
    		return true;
    	else 
    		return false;
    		
    		
    }
    public void entergoogleemail()
    {
    	driver.findElement(google_email).sendKeys("mohamed.ghouse@uxbert.com");
    }
    

	public void gmailnext()
	{
		
		driver.findElement(googlenext).click();
		
	}
    
	public void enterpassword()
	{
		driver.findElement(google_pass).sendKeys("visionfuck");
	}
    
	public void gmailpassnext()
	{
		
		driver.findElement(gmailpassnext).click();
		
	}
    
	 public boolean verifygmail()
	    {
	    	if(driver.findElement(resultmsg).getText()=="التحقّق بخطوتين")
	    		
	    		return true;
	    	else 
	    		return false;
	    		
	    		
	    }

}
