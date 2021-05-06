package Utlities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Propertyutils {
	Properties prop = new Properties();
	
	public String getEnvironmentProperty(String propertyKey) throws IOException
	{
		InputStream input =  null;
		input = new FileInputStream("System.getProperty(\"user.dir\")"+"\\eclipse-workspace\\NetCore\\src\\main\\java\\Utlities\\Environment_Variables.properties");
		prop.load(input);
		String propertyValue=null;
		propertyValue=prop.getProperty(propertyKey);
		
		return propertyValue;
		
	}
}
