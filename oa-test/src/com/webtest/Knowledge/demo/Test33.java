package com.webtest.Knowledge.demo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import com.webtest.core.WebTestListener;
import com.webtest.dataprovider.NSDataProvider;
@Listeners(WebTestListener.class)
public class Test33 extends BaseTest{
	@Test
	public void Newfile2() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.newfile2("huojian");
//		assertTrue(webtest.ifContains("文件夹已存在，请重新输入"));
	}
}
