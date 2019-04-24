package com.crm.qa.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	public LoginPageTest(){
		 super();
	}
	@BeforeMethod
	public void setUp(){
		 initialization();
		 loginPage = new LoginPage();
		 System.out.println("after setup");
	}
	@Test
	public void LoginTest() throws InterruptedException{
		 System.out.println("Before Method");
		 loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@AfterMethod
	public void tearDown(){
		 driver.quit();
	}
}