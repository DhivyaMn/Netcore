package flipkartpages;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import Utlities.Wrapper;
import au.com.bytecode.opencsv.CSVWriter;



public class PageToExcel {
	public static WebDriver driver;
	static Wrapper Wrapper=new Wrapper(driver);
	public static String sExcelFile = "./Data/flipkart.csv";
	public PageToExcel(WebDriver driver) {
		this.driver = driver;}
		
	public static void Write_Cell_Value_To_Excel(String name1,String amount2,String rating1) {
		
		 try {
	            CSVWriter csvOutput = new CSVWriter(new FileWriter(sExcelFile, true),',');
	            
	            String[]a =new String[3];
	            a[0]=name1;
	            a[1]=amount2;
	            a[2]=rating1;
	            		
	      
	        	 csvOutput.writeNext(a);
		            csvOutput.close();
	        	
	     
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	

	}
