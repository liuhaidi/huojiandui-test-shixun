package com.webtest.Knowledge.demo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import com.webtest.core.WebTestListener;
import com.webtest.dataprovider.NSDataProvider;
@Listeners(WebTestListener.class)
public class Test32 extends BaseTest{
	@Test
	public void Newfile() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.newfile();
//		assertTrue(webtest.ifContains("文件夹名称不能为空，请输入"));
	}
}
