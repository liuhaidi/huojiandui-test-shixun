package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import com.webtest.core.WebTestListener;
import com.webtest.dataprovider.NSDataProvider;
@Listeners(WebTestListener.class)
public class Test4 extends BaseTest{
	@Test
	public void Message2() throws Exception  {
		Action action =new Action(webtest);
		action.login("admin", "123456");
		action.message2("啊啊啊");
//		assertTrue(webtest.ifContains("内容不能为空"));
	}
}
