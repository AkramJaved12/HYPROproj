package HY_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentAuthPage {

	
	WebDriver driver=null;
	
	By Authbtn = By.xpath("/html/body/center/div/table/tbody/tr[5]/td[1]/form/input[3]");
	
	public PaymentAuthPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void AUthclick()
	{
		driver.findElement(Authbtn).click();
	}
	
}
