package com.stepDefinition;
import com.Base.Base;
import com.Pages.LoginPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;


public class LoginPageVerify extends Base {
	
	public LoginPageVerify() throws Exception {
		super();
		
	}

	public LoginPage login;
	
	
	@Before("@First")
	public void setUp() throws Exception{

		start();
		login = new LoginPage();
	
		
	}
	
	
	
	@Given("^Get the ActiveLinks Inside the page$")
	public void Get_the_ActiveLinks_Inside_the_page() throws Throwable {
	    
		login.BrokenTest();
		
	}
	
	@Given("^Enter the \"([^\"]*)\" and \"([^\"]*)\" and get the error message$")
	public void Enter_the_and_and_get_the_error_message(String arg1, String arg2) throws Throwable {
	    
		login.Login(arg1, arg2);
		
	}
	
	@Given("^Enter the username and password$")
	public void Enter_the_username_and_password() throws Throwable {
	  login.Login();
	}

	
	
	@After("@First")
	public void tearDown(){
		
		driver.quit();
	}


}
