package com.webtest.SystemSetting.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.WebTestListener;
@Listeners(WebTestListener.class)
public class Commange_test extends BaseTest {
	Commanage_Action action;
	@BeforeMethod
	public void setup() throws IOException {
		action=new Commanage_Action(webtest);
		action.login("admin", "123456");
	}
	@Test
	public void install_test() {
		action.install(10007);
		assertTrue(webtest.ifContains("成功"));
		webtest.leaveFrame();
		
	}
	@Test
	public void uninstall_test() {
		action.uninstall(10013);
		assertTrue(webtest.ifContains("成功"));
		webtest.leaveFrame();
		
	}
	
	

}
