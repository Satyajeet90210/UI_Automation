package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class ContactsPage extends TestBase{
	
	@FindBy(partialLinkText = "Contacts")
	public WebElement linkContactsTab;
	
	@FindBy(partialLinkText= "New")
	WebElement btnCreateNewContact;
	
	@FindBy(name= "first_name")
	WebElement txtFirstName;
	
	@FindBy(name= "last_name")
	WebElement txtLastName;
	
	@FindBy(className= "save")
	WebElement btnSavecontacts;
	
	
	
	public  void ClickOnContactsTab(){
		linkContactsTab.click();
		
	}
	
	public void CreateNewContacts(String Fname, String Lname){
		btnCreateNewContact.click();
		txtFirstName.sendKeys(Fname);
		txtLastName.sendKeys(Lname);
		btnSavecontacts.click();
	}
	
	public ContactsPage(){
		PageFactory.initElements(driver, this);
	}
	
	

}
