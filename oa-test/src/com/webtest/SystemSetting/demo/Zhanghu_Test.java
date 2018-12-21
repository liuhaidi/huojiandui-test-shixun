package com.webtest.SystemSetting.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.WebTestListener;


public class Zhanghu_Test extends BaseTest {
	Zhanghu_Action action;
	
	@Test
	public void add_test_fail() throws InterruptedException, IOException {
		action=new Zhanghu_Action(webtest);
		action.login("admin", "123456");
		action.add("WHX", "admin123", "ÍõºÆÜ°");
		assertTrue(webtest.ifContains("³É¹¦"));
		
		
	}
	


	
	
}
