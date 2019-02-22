package com.Pages;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.Base.Base;
import com.Utilities.BrokenLinks;

public class HomePage extends Base {
	
	public HomePage() throws Exception{
		
		//super();
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@title='Entity']")
	WebElement Entity;
	
	@FindBy(xpath="//a[@title='Modules']")
	WebElement Modules;
	
	@FindBy(xpath="//a[@title='Site Administrator']")
	WebElement SiteAdministrator;
	
	@FindBy(xpath="//a[@title='Project Pillar']")
	WebElement ProjectPillar;
	
	@FindBy(xpath="//a[@title='Process / Activities']")
	WebElement ProcessActivities;
	
	@FindBy(xpath="//a[@title='Levels']")
	WebElement Levels;
	
	@FindBy(xpath="//a[@title='Master Folder Tags']")
	WebElement MasterFolderTags ;
	
	@FindBy(xpath="//a[@title='Create Department']")
	WebElement CreateDepartment ;
	
	@FindBy(xpath="//a[@title='Assign Department']")
	WebElement AssignDepartment ;
	
	@FindBy(id="logout")
	WebElement logout;
	
	public void BrokenLinksVerify() throws MalformedURLException, IOException{
		
		BrokenLinks.Broken();
		
		
	}
	public EntityPage EntityTest() throws Exception{
		
		Entity.click();
		
		return new EntityPage();
	}

	public ModulesPage ModuleTest(){
		
		Modules.click();
		
		return new ModulesPage();
		
	}
	
	public SiteAdminPage SiteAdminTest(){
		
		SiteAdministrator.click();
		
		return new SiteAdminPage();
		
	}
	
	public ProjectPillarPage ProjectPillarTest(){
		
		ProjectPillar.click();
		
		return new ProjectPillarPage();
		
	}
	
	public ProcessPage ProcessTest(){
		
		ProcessActivities.click();
		
		return new ProcessPage();
		
	}
	
	public LevelsPage LevelsTest(){
		
		Levels.click();
		
		return new LevelsPage();
		
	}
	
	public FolderTagsPage FolderTagstest(){
		
		MasterFolderTags.click();
		
		return new FolderTagsPage();
		
	}
	
	public CreateDepartmentPage CreateDepartmentTest(){
		
		CreateDepartment.click();
		
		return new CreateDepartmentPage();
		
	}
	
	public AssignDepartmentPage AssignDepartmentTest(){
		
		AssignDepartment.click();
		
		return new AssignDepartmentPage();
		
	}
	
	public LoginPage Logout() throws Exception{
		Thread.sleep(4000);
		Screen s = new Screen();
		
		Pattern p = new Pattern("C:\\SikuliImages\\Logout.PNG");
		
		s.click(p);
	
		Thread.sleep(4000);
		
		logout.click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		return new LoginPage();
		
		
	}
	
}

	
	