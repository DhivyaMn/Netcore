package ApplicationFn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utlities.Propertyutils;

public class AppFun {
	public static WebDriver driver;
	String sBroswer = "CHROME";
	Propertyutils util;
	
	public AppFun(WebDriver driver){
		this.driver = driver;}
	
		public void Initiate_Browser(){
			
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();	}
			
			public void Launch_Application() throws IOException{
				
				String sURL = util.getEnvironmentProperty("Flipkart");
				driver.manage().window().maximize();
				
				driver.get(sURL);
				driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		}
}
