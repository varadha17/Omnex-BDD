package com.Utilities;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.Base;

public class BrokenLinks extends Base {
	
	public BrokenLinks() throws Exception{
		
		super();
	}
	
	
	public static void Broken() throws MalformedURLException, IOException{
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Links:"+list.size());
		
		List<WebElement> ActiveLinks = new ArrayList<WebElement>();
		
		for(int i=0; i<list.size();i++){
			
			if(list.get(i).getAttribute("href") != null && (!list.get(i).getAttribute("href").contains("javascript"))){
				
				ActiveLinks.add(list.get(i));
				
			}
			
		}
		System.out.println("Active Links:"+ActiveLinks.size());
		
		for(int j=0; j<ActiveLinks.size(); j++){
			
			HttpURLConnection conn = (HttpURLConnection) new URL(ActiveLinks.get(j).getAttribute("href")).openConnection();
			
			conn.connect();
			
			String s1 = conn.getResponseMessage();
			
			conn.disconnect();
			
			
			System.out.println(ActiveLinks.get(j).getAttribute("href")+"--------->"+s1);
		}
		
		
		
		
	}

}
