package com.webtest.SystemSetting.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.WebTestListener;
@Listeners(WebTestListener.class)
public class Data_test extends BaseTest{
	Data_Action action;
	@BeforeMethod
	public void setup() throws IOException {
		action=new Data_Action(webtest);
		action.login("admin", "123456");
	}
	@Test
	public void select_test() {
		action.select("admin");
		assertTrue(webtest.ifContains("admin"));
	}
	
	
}
