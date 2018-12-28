package com.webtest.SystemSetting.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.WebTestListener;

public class product_test extends BaseTest{
	product_Action action;
	@BeforeMethod
	public void setup() throws IOException {
		action=new product_Action(webtest);
		action.login("admin", "123456");
	}
	@Test
	public void input_test() {
		action.input("1234567894561235");
		assertTrue(webtest.ifContains("³É¹¦"));
		webtest.leaveFrame();
		
		
	}
	@Test
	public void input_test1() {
		action.input("1234567894");
		assertTrue(webtest.ifContains("¿Õ"));
		webtest.leaveFrame();
		
		
	}
	@Test
	public void qingkong_test() {
		action.input("123456789");
		webtest.leaveFrame();
		
	}

}
