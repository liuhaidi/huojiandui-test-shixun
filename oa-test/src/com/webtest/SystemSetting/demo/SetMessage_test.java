package com.webtest.demo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.WebTestListener;

@Listeners(WebTestListener.class)
public class SetMessage_test extends BaseTest{
	SetMessage_action action;

	
	@BeforeMethod
	public void setup() {
		action=new SetMessage_action(webtest);
		
	}
	@Test
	public void Set() {
		webtest.open("http://localhost:8033/tscoa/login.php");
		action.login("admin","admin123");
		action.setMessage("天生创想OA协同办公软件","30");
	}

	
	
	

}
