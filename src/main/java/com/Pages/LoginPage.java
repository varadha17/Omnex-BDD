package com.Pages;

import java.io.IOException;
import java.net.MalformedURLException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Base.Base;
import com.Utilities.BrokenLinks;


public class LoginPage extends Base {
	
	//Constructor call from Baseclass
	public LoginPage() throws Exception{
		
		super();
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id ="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(xpath="(//input[@type='button'])[2]")
	WebElement LoginButton;
	
	@FindBy(xpath="//td[text()='Wrong Username / Password. Try again.']")
	WebElement wrong;

	public void BrokenTest() throws MalformedURLException, IOException{
		
		BrokenLinks.Broken();
		
	}
	
	
	public HomePage Login(String arg1, String arg2) throws Exception{
		
		
		
		username.sendKeys(arg1);
		password.sendKeys(arg2);
		password.sendKeys(Keys.ENTER);
		
		String s = driver.getCurrentUrl();
		
		if(s.equalsIgnoreCase("http://192.168.100.249/EwQIMS_Inst1/Common/EwIMSNew/Index/Index")){
			
			String name = driver.getCurrentUrl();
			System.out.println("Home Page Displayed:"+name);
			
			
		}else{
			
			String s2 = wrong.getText();
			System.out.println("Home page not displayed"+s2);
		}
		Thread.sleep(10000);
		
		return new HomePage();
		
	}
		
public HomePage Login() throws Exception{
		
		
		
		username.sendKeys("administrator");
		password.sendKeys("a1");
		password.sendKeys(Keys.ENTER);
		
		String s = driver.getCurrentUrl();
		
		if(s.equalsIgnoreCase("http://192.168.100.249/EwQIMS_Inst1/Common/EwIMSNew/Index/Index")){
			
			String name = driver.getCurrentUrl();
			System.out.println("Home Page Displayed:"+name);
			
			
		}else{
			
			String s2 = wrong.getText();
			System.out.println("Home page not displayed"+s2);
		}
		Thread.sleep(10000);
		
		return new HomePage();
		
	}
		
	}
	
	
	
	

