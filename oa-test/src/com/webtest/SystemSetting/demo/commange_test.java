package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.WebTestListener;
@Listeners(WebTestListener.class)
public class commange_test extends BaseTest {
	commanage_Action action;
	@BeforeMethod
	public void setup() {
		action=new commanage_Action(webtest);
		webtest.open("http://localhost:8033/tscoa/login.php");
		action.login("admin", "admin123");
	}
	@Test
	public void install_test() {
		action.install(1007);
		assertTrue(webtest.ifContains("成功"));
		webtest.leaveFrame();
		
	}
	@Test
	public void uninstall_test() {
		action.install(10013);
		assertTrue(webtest.ifContains("成功"));
		webtest.leaveFrame();
		
	}
	
	

}
