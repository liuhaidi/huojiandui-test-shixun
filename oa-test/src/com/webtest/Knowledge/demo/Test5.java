package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import com.webtest.core.WebTestListener;
import com.webtest.dataprovider.NSDataProvider;
@Listeners(WebTestListener.class)
public class Test5 extends BaseTest{
	@Test
	public void Message3() throws Exception  {
		Action action =new Action(webtest);
		action.login("admin", "123456");
		action.message3("啊啊啊","aaaaaa");
//		assertTrue(webtest.ifContains("知识信息操作成功"));
	}
}
