package flipkartpages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ApplicationFn.AppFun;
import Utlities.Wrapper;





public class HomePage {

By Popup= By.xpath("//button[@class='_2KpZ6l _2doB4z']");
	By Search=By.xpath("//input[@class='_3704LK']");
	public  static WebDriver driver;
	public AppFun oFun;
	String name;
	String rating;
	String amount;
	Integer amount1;
	int a;
	
	
	List<Integer> oList=new ArrayList<Integer>();
 Wrapper Wrapper ;

 String amount3,amount4,rating1,rating2,amount2,name1;
	Map<Integer,String>oMap=new HashMap<Integer,String>();
		
		 Map<Integer,String>oMap2=new HashMap<Integer,String>();
		
		 List<WebElement> Prod;
			WebElement b;
			PageToExcel Pe;
			
			
			
	public void invokeBrowser() throws IOException{
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/Chrome/chromedriver_win32/chromedriver.exe");
		HomePage.driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		
		oFun = new AppFun(driver);

		oFun.Launch_Application();
	}
		public void searchOptions(String a)
		{
			Wrapper=new Wrapper(driver);
			
			Wrapper.clickElement(Popup);
			Wrapper.typeValue(Search,a);}
		
		public void devices() throws Exception {
			Thread.sleep(2000);
		Prod=driver.findElements(By.xpath("//div[@class='_4ddWXP']"));
		Thread.sleep(2000);

		  for(int i=0;i<Prod.size();i++)
		    {

			WebElement oprod=Prod.get(i);
			
			Thread.sleep(2000);
			name=oprod.findElement(By.xpath(".//a[@class='s1Q9rs']")).getText();
			rating= oprod.findElement(By.xpath(".//span[@class='_2_R_DZ']")).getText();
			amount =oprod.findElement(By.xpath(".//div[@class='_30jeq3']")).getText();
	
			amount3=amount.substring(1);
			amount4=amount3.replaceAll("[ ,]","");

			a=Integer.parseInt(amount4);
			rating2=rating.replaceAll("[()]","");
			if(a<=40000)
			{
				oMap.put(a,name);
				oMap2.put(a,rating2);
				oList.add(a);
				
				
			}
			
		}
		
		Collections.sort(oList);
		
		  for(int i=0;i<oList.size();i++)
		    {
			name1=oMap.get(oList.get(i));
			rating1=oMap2.get(oList.get(i));
			amount1=oList.get(i);
			amount2=String.valueOf(amount1);
			
			Pe=new PageToExcel(driver);
			 PageToExcel.Write_Cell_Value_To_Excel( name1,amount2,rating1);
		
			
		}
		  System.out.println("CSV file has updated with data's please open it");
		  driver.close();
			
		 
		}
		
		
}
