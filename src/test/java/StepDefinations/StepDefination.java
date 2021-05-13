package StepDefinations;
import flipkartpages.PageToExcel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import flipkartpages.HomePage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;



	
	
	

	@RunWith(Cucumber.class)
	public class StepDefination {
		
		public static WebDriver driver;
		public static String sURL = "https://www.flipkart.com/";
		public static HomePage hP;
		

	   
		@Given("^search for flipart site$")
	    public void search_for_flipart_site() throws IOException{
			hP=new HomePage();
			hP.invokeBrowser();
	    }

	    @When("^user calls \\\"([^\\\"]*)\\\" with flipkart$")
	    public void user_calls_iphone_with_flipkart(String search)  {
	    	hP.searchOptions(search);
	    }

	    @Then("^in csv file can have name,amount,rating of iphones$")
	    public void in_csv_file_can_have_nameamountrating_of_iphones() throws Exception {
	    	hP.devices();
	    }

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

