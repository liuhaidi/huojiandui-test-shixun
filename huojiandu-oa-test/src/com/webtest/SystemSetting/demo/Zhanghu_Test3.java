package com.webtest.SystemSetting.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Zhanghu_Test3 extends BaseTest{
	Zhanghu_Action action;
	@Test 
	public void intMessage_test() throws IOException {
		action=new Zhanghu_Action(webtest);
		action.login("admin", "123456");
		action.intMessage("D:\\stady\\userdata.txt");
		assertTrue(webtest.ifContains("³É¹¦"));
	}


}
