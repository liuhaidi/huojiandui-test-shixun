package com.webtest.Knowledge.demo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import com.webtest.core.WebTestListener;
import com.webtest.dataprovider.NSDataProvider;
@Listeners(WebTestListener.class)
public class Test27 extends BaseTest{
	@Test
	public void Deletefile2() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.deletefile2();
//		assertTrue(webtest.ifContains("请至少选中一个文件"));
	}
}
