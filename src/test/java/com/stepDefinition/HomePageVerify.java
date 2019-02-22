package com.stepDefinition;
import java.io.IOException;
import java.net.MalformedURLException;

import com.Base.Base;
import com.Pages.HomePage;
import com.Pages.LoginPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class HomePageVerify extends Base{

	public LoginPage login;
	public HomePage home;
	
	public HomePageVerify() throws Exception {
		//super();
		
	}
	
	@Before("@Second")
	public void setUp1() throws Exception{
		
		start();
		
		login = new LoginPage();
		
		home = login.Login();
		
		
	}
	
	@Given("^Verify broken Links$")
	public void Verify_broken_Links() throws MalformedURLException, IOException{
		
		home.BrokenLinksVerify();
	}
	
	@Given("^Click on Entity icon$")
	public void Click_on_Entity_icon() throws Throwable {
	    
		Thread.sleep(10000);
		home.EntityTest();
		Thread.sleep(8000);
		
	}
	
	@Given("^Click on Site Administrator icon$")
	public void Click_on_Site_Administrator_icon() throws Throwable {
		Thread.sleep(10000);
		home.SiteAdminTest();
		Thread.sleep(8000);
		
	}
	
	@Given("^Click on Project Pillar icon$")
	public void Click_on_Project_Pillar_icon() throws Throwable {
		Thread.sleep(10000);
		home.ProjectPillarTest();
		Thread.sleep(8000);
	}
	
	@Given("^Click on Process Activities icon$")
	public void Click_on_Process_Activities_icon() throws Throwable {
		Thread.sleep(10000);
		home.ProcessTest();
		Thread.sleep(8000);
	}
	
	@Given("^Click on Levels icon$")
	public void Click_on_Levels_icon() throws Throwable {
		Thread.sleep(10000);
		home.LevelsTest();
		Thread.sleep(8000);
	}
	
	@Given("^Click on Master Folder Tags icon$")
	public void Click_on_Master_Folder_Tags_icon() throws Throwable {
		Thread.sleep(10000);
		home.FolderTagstest();
		Thread.sleep(8000);
	}
	
	@Given("^Click on Create Department icon$")
	public void Click_on_Create_Department_icon() throws Throwable {
		Thread.sleep(10000);
		home.CreateDepartmentTest();
		Thread.sleep(8000);
	}
	
	@Given("^Click on Assign Department icon$")
	public void Click_on_Assign_Department_icon() throws Throwable {
		Thread.sleep(10000);
		home.AssignDepartmentTest();
		Thread.sleep(8000); 
	}
	
	@Given("^Logout the page$")
	public void Logout_the_page() throws Exception{
		
		home.Logout();
		
	}
	
	@After("@Second")
	public void teardown1(){
		
		driver.quit();
		
		
	}
	
	
	
	
	
	
}
