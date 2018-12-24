package com.webtest.SystemSetting.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Product_test2 extends BaseTest{
	product_Action action;
	@Test
	public void input_test1() throws IOException {
		action=new product_Action(webtest);
		action.login("admin", "123456");
		action.input("1234567894");
		assertTrue(webtest.ifContains("Пе"));
		
		
	}


}
