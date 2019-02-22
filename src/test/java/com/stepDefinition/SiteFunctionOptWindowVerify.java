package com.stepDefinition;

import com.Base.Base;
import com.Pages.EntityPage;
import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.Pages.SiteFunctionWin;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SiteFunctionOptWindowVerify extends Base {

	public LoginPage login;
	public HomePage home;
	public EntityPage ent;
	public SiteFunctionWin site;
	
	public SiteFunctionOptWindowVerify() throws Exception {
		super();
		
	}
	
	@Before("@Sixth")
	public void setup() throws Exception{
		
		start();
		
		login = new LoginPage();
		home = login.Login();
		ent = home.EntityTest();
		site = ent.siteFunctionTest();
		
	}
	
	
	@Given("^Click on add button in site Function window$")
	public void Click_on_add_button_in_site_Function_window() throws Throwable {
	    
		site.AddSiteOpt();
		
	}

	@When("^Enter the datas \"([^\"]*)\"$")
	public void Enter_the_datas(String arg1) throws Throwable {
	   
		site.AddData(arg1);
		
	}
	
	@Given("^Enter data and get the error message\"([^\"]*)\"$")
	public void Enter_data_and_get_the_error_message(String arg1) throws Throwable {
	    
		site.DuplicateData(arg1);
		
	}
	
	@Given("^Click on add button in Site Function$")
	public void Click_on_add_button_in_Site_Function() throws Throwable {
	    
		site.Cancel();
		
	}

	@When("^Enter data \"([^\"]*)\" and cancel$")
	public void Enter_data_and_cancel(String arg1) throws Throwable {
	   
		site.Cancel(arg1);
		
	}
	

@Given("^Click on Edit Button in Site function Window$")
public void Click_on_Edit_Button_in_Site_function_Window() throws Throwable {
    
	site.EditBtnClick();
	
}

@When("^get the error message in site function$")
public void get_the_error_message_in_site_function() throws Throwable {
   site.getErrormessage();
	
}

@Given("^Click on Overall checkbox$")
public void Click_on_Overall_checkbox() throws Throwable {
    
	site.OverallCheckBoxTest();
	
	
}

@When("^Click on Individual checkbox$")
public void Click_on_Individual_checkbox() throws Throwable {
    
	
	site.ClickCheckBox();
	
}

@When("^Click on edit button and save$")
public void Click_on_edit_button_and_save() throws Throwable {
   
	site.EditData();
	
	
}

@Given("^Click on Delete button$")
public void Click_on_Delete_button() throws Throwable {
    
	site.Delete();
	
	
}

@When("^validate the error message$")
public void validate_the_error_message() throws Throwable {
   
	site.getErrormessage1();
	
}

@Given("^delete the data$")
public void delete_the_data() throws Throwable {
    
	site.DeleteData();
	
	
}


	@After("@Sixth")
	public void tearDown(){
		
		driver.quit();
		
	}
	
	
	
	
	

}
