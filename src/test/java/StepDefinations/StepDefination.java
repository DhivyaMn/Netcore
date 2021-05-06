package StepDefinations;
import flipkartpages.PageToExcel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import flipkartpages.HomePage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefination {
	
	public static String sExcelFile = "./Data/flipkart.csv";
	
	public static WebDriver driver;
	public static String sURL = "https://www.flipkart.com/";
	public static HomePage hP;
	
	@Given("search for flipart site")
	public void searchforflipartsite() throws IOException {
		hP=new HomePage();
		hP.invokeBrowser();
		
	}
	@When(" user calls {String} with flipkart")
	public void usercallswithflipkart(String search)
	{
	hP.searchOptions();
}
	@Then(" in csv file can have name,amount,rating of iphones")
	public void usercallswithflipkart()
	{
		hP.devices();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
