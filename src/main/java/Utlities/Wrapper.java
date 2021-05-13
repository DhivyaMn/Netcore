package Utlities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wrapper {

	private WebDriver driver;
public Wrapper(WebDriver driver) {
		
		this.driver = driver;
	}
	

public WebElement waitUntilVisible(By locator ,int timeout){
	WebElement element = null;
	
	WebDriverWait wait = new WebDriverWait(driver,timeout);
	
	element= wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	return element;
	}
	public  void clickElement(By locator){
		WebElement element = waitUntilVisible(locator,30);
		element.click();
		}
	public void typeValue(By locator,String text){

		WebElement element = waitUntilVisible(locator,30);
		element.click();
		element.clear();
		element.sendKeys(text);
		element.sendKeys(Keys.ENTER);
}}
