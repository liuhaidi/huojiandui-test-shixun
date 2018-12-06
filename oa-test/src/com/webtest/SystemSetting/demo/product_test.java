package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.WebTestListener;
@Listeners(WebTestListener.class)
public class product_test extends BaseTest{
	product_Action action;
	@BeforeMethod
	public void setup() {
		action=new product_Action(webtest);
		webtest.open("http://localhost:8033/tscoa/login.php");
		action.login("admin", "admin123");
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
