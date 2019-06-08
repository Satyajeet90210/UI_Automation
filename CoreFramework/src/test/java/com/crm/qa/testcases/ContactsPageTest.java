package com.crm.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase{
	LoginPage loginPage;
	ContactsPage contactsPage;
	TestUtil testUtil;
	HomePage homePage;
	String sheetName= "Contacts";
	public ContactsPageTest(){
		 super();
	}
	@BeforeMethod
	public void setUp() throws InterruptedException{
		 initialization();
		 loginPage = new LoginPage();
		 contactsPage = new ContactsPage();
		  testUtil = new TestUtil();
		 loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		 Thread.sleep(5000);
		 System.out.println("after setup");
	}
	
	@DataProvider
	public Object[][] getCRMTestData(){
	Object data [][] = TestUtil.getTestData(sheetName);	
		return data;
	}
	@Test(dataProvider="getCRMTestData")
	public void CreateNewContact(String Fname, String Lname) throws InterruptedException{
		contactsPage.ClickOnContactsTab();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		contactsPage.CreateNewContacts(Fname,Lname);
		Assert.assertTrue(driver.getPageSource().contains("Tom"));
}
	}
