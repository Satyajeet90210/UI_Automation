	package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath= "//span[contains(text(),'s h')]")
	WebElement LoggedInUserName;
	
	@FindBy(partialLinkText ="contacts")
	public WebElement ContactsTab;
	
	@FindBy(partialLinkText ="tasks")
	public WebElement TasksTab;
	
	@FindBy(partialLinkText ="deals")
	public WebElement Deals;
	
	@FindBy(className ="user-display")
	public WebElement UserLable;
	
	public String verifyPageTitle(){
	return (driver.getTitle());
	}
	
	public void ClickOnContacts(){
		ContactsTab.click();
	}
	
	public boolean checkLoggedInUserDisplayed(){
		return UserLable.isDisplayed();
		
	}
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
}
