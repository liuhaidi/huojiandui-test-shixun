package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.WebTestListener;
@Listeners(WebTestListener.class)
public class Data_test extends BaseTest{
	Data_Action action;
	@BeforeMethod
	public void setup() {
		action=new Data_Action(webtest);
		webtest.open("http://localhost:8033/tscoa/login.php");
		action.login("admin", "admin123");
	}
	@Test
	public void select_test() {
		action.select("admin");
		assertTrue(webtest.ifContains("admin"));
		webtest.leaveFrame();
	}
	
	
}
