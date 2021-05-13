package Utlities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Propertyutils {
	Properties prop = new Properties();
	
	public Propertyutils(String fileName) {
		
			try{
			InputStream input =  null;
			input = new FileInputStream(fileName);
			prop.load(input);				
			
			}
			catch (IOException e) {
				System.out.println("Error "+e);
		   }
		}

	public String getEnvironmentProperty(String propertyKey) throws IOException
	{

		String propertyValue=null;
		propertyValue=prop.getProperty(propertyKey);
		
		return propertyValue;
		
	}
}
