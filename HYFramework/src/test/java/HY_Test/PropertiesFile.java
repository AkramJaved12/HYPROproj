package HY_Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {

	
	
	
	Properties prop = new Properties();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
	
	public void getproprties()
	{
		InputStream input = new FileInputStream("/Users/mohanned/eclipse-workspace/HYFramework/src/test/java/HY_Test/File.properties");
		prop.load(input);
		prop.getProperty("browser");
		
		
		
		}
	
	
	public void setProperty()
	{
		OutputStream output - new OutputStream("/Users/mohanned/eclipse-workspace/HYFramework/src/test/java/HY_Test/File.properties");
		prop.setProperty("result", "success");
		prop.store(output, "store output");
	}
	
	
	
}
