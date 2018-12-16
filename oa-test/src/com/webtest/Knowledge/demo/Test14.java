package com.webtest.Knowledge.demo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import com.webtest.core.WebTestListener;
import com.webtest.dataprovider.NSDataProvider;
@Listeners(WebTestListener.class)
public class Test14 extends BaseTest{
	@Test
	public void Forum3() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.forum3();
//		assertTrue(webtest.ifContains("版块信息操作成功"));
	}
}
