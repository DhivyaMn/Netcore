package flipkartpages;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import Utlities.Wrapper;



public class PageToExcel {
	public static WebDriver driver;
	static Wrapper Wrapper=new Wrapper(driver);

	public PageToExcel(WebDriver driver) {
		this.driver = driver;}
		
	public static void Write_Cell_Value_To_Excel(String sFile,String sSheet,int iRow,int iCell,String sValue) {
		InputStream oFile;
		XSSFWorkbook oExcel ;
		XSSFSheet oSheet ;
		Row oRow ;
		Cell oCell ;
		 try {

			 oFile = new FileInputStream(sFile);
			 oExcel = new XSSFWorkbook(oFile);
			 oSheet = oExcel.getSheet(sSheet);
			 
			
			 		 
			 oRow = oSheet.getRow(iRow);
			 if(oRow == null)
			 {
				 oSheet.createRow(iRow);
				 oRow = oSheet.getRow(iRow);
			 }
			 
			 oCell = oRow.getCell(iCell);
			 
			 if(oCell==null)
			 {
				 oRow.createCell(iCell);
				 oCell= oRow.getCell(iCell);
			 }
			
			 oCell.setCellValue(sValue);
			 
			 
			 OutputStream oFileWrite = new FileOutputStream(sFile);
			 oExcel.write(oFileWrite);
			 oFileWrite.close();
			 
			oExcel.close();
			oFile.close();
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	}
