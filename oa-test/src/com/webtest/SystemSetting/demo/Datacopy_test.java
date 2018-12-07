package com.webtest.SystemSetting.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.WebTestListener;

public class Datacopy_test extends BaseTest{
	Datacopy_Action action;
	@BeforeMethod
	public void setup() throws IOException {
		action=new Datacopy_Action(webtest);
		action.login("admin", "123456");
	}
	@Test
	public void copy_test() {
		action.copy("toa_ads");
		assertTrue(webtest.ifContains("成功"));
		
	}
	@Test
	public void restore_test() {
		action.restore("tscoa1544062968.sql");
		assertTrue(webtest.ifContains("成功"));
		webtest.leaveFrame();
	}
	@Test
	public void delete_test() {
		action.restore("tscoa1544062968.sql");
		assertTrue(webtest.ifContains("成功"));
		webtest.leaveFrame();
		
	}

}
