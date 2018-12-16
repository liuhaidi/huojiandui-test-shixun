package com.webtest.Knowledge.demo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import com.webtest.core.WebTestListener;
import com.webtest.dataprovider.NSDataProvider;
@Listeners(WebTestListener.class)
public class Test17 extends BaseTest{
	@Test
	public void Tz4() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.tiezi4("火箭队fighting");
//		assertTrue(webtest.ifContains("内容不能为空"));
	}
}
