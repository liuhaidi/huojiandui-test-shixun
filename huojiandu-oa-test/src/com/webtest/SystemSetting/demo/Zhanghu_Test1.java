package com.webtest.SystemSetting.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Zhanghu_Test1 extends BaseTest{
	Zhanghu_Action action;
	@Test
	public void add_test_succeess() throws InterruptedException, IOException {
		action=new Zhanghu_Action(webtest);
		action.login("admin", "123456");
		action.add("YJW", "admin123", "小于");
		assertTrue(webtest.ifContains("成功"));
		
	}

}
