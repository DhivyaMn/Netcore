package flipkartpages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ApplicationFn.AppFun;
import Utlities.Wrapper;




public class HomePage {

By Popup= By.xpath("//button[@class='_2KpZ6l _2doB4z']");
	By Search=By.xpath("//input[@class='_3704LK']");
	public static WebDriver driver;
	public AppFun oFun;
	String name;
	String rating;
	String amount;
	Integer amount1;
	int a;
	String Sheet;
	public static String sExcelFile = "./Data/flipkart.csv";
	List<Integer> oList=new ArrayList<Integer>();
	static Wrapper Wrapper=new Wrapper(driver);
	Map<Integer,String>oMap=new HashMap<Integer,String>();
		 String name1;
		 Map<Integer,String>oMap2=new HashMap<Integer,String>();
		 String rating1;
		 String amount2;
		 List<WebElement> Prod=	driver.findElements(By.xpath("//div[@class='_4ddWXP']"));
	public void invokeBrowser() throws IOException{
		oFun = new AppFun(driver);
		oFun.Initiate_Browser(); 
		oFun.Launch_Application();
	}
		public void searchOptions()
		{
			Wrapper.clickElement(Popup);
			Wrapper.typeValue(Search,"iphone");}
		
		public void devices() {
		
		for(int i=0;i<Prod.size();i++)
		{
			WebElement oprod=Prod.get(i);
			
			name=oprod.findElement(By.xpath(".//a[@class='s1Q9rs']")).getText();
			rating= oprod.findElement(By.xpath(".//span[@class='_2_R_DZ']")).getText();
			amount =oprod.findElement(By.xpath(".//div[@class='_30jeq3']")).getText();
			a=Integer.parseInt(amount);
			if(a<=40000)
			{
				oMap.put(a,name);
				oMap2.put(a,rating);
				oList.add(a);
				
				
			}else
			{}
			
		}
		
		Collections.sort(oList);
		
		for(int i=0;i<oList.size();i++)
		{
			name1=oMap.get(oList.get(i));
			rating1=oMap2.get(oList.get(i));
			amount1=oList.get(i);
			amount2=String.valueOf(amount1);
			PageToExcel.Write_Cell_Value_To_Excel(sExcelFile,Sheet, i, 0 ,name1);
			
			PageToExcel.Write_Cell_Value_To_Excel(sExcelFile,Sheet,i, 1, amount2);
			PageToExcel.Write_Cell_Value_To_Excel(sExcelFile,Sheet,i,2, rating1);
			
		}
		}
		
	
		
}
