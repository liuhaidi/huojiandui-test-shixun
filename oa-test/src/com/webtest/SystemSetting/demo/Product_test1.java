package com.webtest.SystemSetting.demo;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Product_test1 extends BaseTest{
	product_Action action;
	@Test
	public void qingkong_test() throws IOException {
		action=new product_Action(webtest);
		action.login("admin", "123456");
		action.input("123456789");
		
		
	}


}
