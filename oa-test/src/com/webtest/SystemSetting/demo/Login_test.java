package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.WebTestListener;
import com.webtest.dataprovider.NSDataProvider;
@Listeners(WebTestListener.class)
public class Login_test extends BaseTest{
	Login_Action action;
	@BeforeMethod
	public void setup() {
		action=new Login_Action(webtest);
		
	}
	@Test
	public void loginSucess() {
		webtest.open("http://localhost:8033/tscoa/login.php");
		action.login("admin", "admin123");
	}
	@Test(dataProvider="txt",dataProviderClass=NSDataProvider.class)
	public void loginFail(String usename,String password) {
		webtest.open("http://localhost:8033/tscoa/login.php");
		action.login(usename,password);
		assertTrue(webtest.ifContains("µÇÂ¼111"));
		
		
	}
	
	
	

}
