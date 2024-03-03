package com.pageObject_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage 
{
	public WebDriver driver;
	
	//DECLARATION OF THE WEB ELEMENTS
	
	@FindBy(name = "customer")
	public WebElement company;
	
	@FindBy(name = "userId")
	public WebElement userid;
	
	@FindBy(name = "password")
	public WebElement password;
	
	@FindBy (xpath = "//button[@type='submit']")
	public WebElement loginbtn;
	
	//INITIALIZATION OF THE WEB ELEMENTS
	
	public PBLoginPage(WebDriver driver)  
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Utilization of the BUSINESS LOGIC 
	
	public void loginIntoProgramBuilder(String cname,String uname, String pass) throws InterruptedException
	{
		Thread.sleep(4000);
		company.sendKeys(cname);
		userid.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();
	}

	
}
