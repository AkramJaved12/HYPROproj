import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HY_test {

	
	
	
	public static void main( String[]args)
	{
		
		BeforeTest();
		
		
	}
	
	
	
	public static void BeforeTest()
	{
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/mohanned/eclipse-workspace/HYFramework/Drivers/Chromedriver/chromedriver 4" );
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://hy-web-test.halayalla.rocks/sa-en");
	}
	
	
	
	
	
	
	
	
}
