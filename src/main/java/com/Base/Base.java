package com.Base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static Properties prop;
	public static WebDriver driver;
	
	//Constructor--> To initialize the files from com.Properties  
	public Base() throws Exception{
		
		prop = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Omnex\\.eclipse\\OmnexBDD\\src\\main\\java\\com\\Properties\\config.properties");
		
		prop.load(fis);
		
	}
	
	//open the browser using this method
	public static void start(){
		
		String s = prop.getProperty("browser");
		
		if(s.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "C:\\jar files\\chromedriver.exe");	
			
			driver = new ChromeDriver();
			
		} else if(s.equals("firefox")){
			
			System.setProperty("webdriver.gecko.driver", "‪C:\\jar files\\geckodriver.exe");	
			
			driver = new FirefoxDriver();
			
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}

}
