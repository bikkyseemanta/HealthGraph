package com.healthgraph.ehr.commommethods;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common_Methods
{
	public static WebDriver driver;
	 public static WebElement element;
	
	
	public static void browser_and_url_open() throws Throwable 
	{
		System.setProperty(readProperty("browserkey"),
				readProperty("browservalue"));
		//Reporter.addStepLog("Browser Opening");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(readProperty("url"));
		//Reporter.addStepLog("Opening the url [ "+readProperty("url")+ " ]");
	}
	 
	
	public static String readProperty(String key) throws Exception
	{
		FileReader reader=new FileReader("C:\\Users\\lenovo\\eclipse-workspace\\HealthGraph\\src\\main\\resources\\Configuration.propoties");  
	      
	    Properties p=new Properties();  
	    p.load(reader);  
	    
	    String value = p.getProperty(key);
	    return value;
	}
	
	 public static  void clickElementByElement(WebElement element)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;    
			js.executeScript("arguments[0].click();", element); 
		}
}
