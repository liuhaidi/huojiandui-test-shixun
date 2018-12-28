package com.webtest.SystemSetting.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.WebTestListener;

public class commange_test extends BaseTest {
	commanage_Action action;
	@BeforeMethod
	public void setup() throws IOException {
		action=new commanage_Action(webtest);
		action.login("admin", "123456");
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
