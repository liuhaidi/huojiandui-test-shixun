package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import com.webtest.core.WebTestListener;
import com.webtest.dataprovider.NSDataProvider;
@Listeners(WebTestListener.class)
public class Test18 extends BaseTest{
	@Test
	public void Tz5() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.tiezi5("�����fighting","����Ӽ��ͣ�");
//		assertTrue(webtest.ifContains("������Ϣ�����ɹ�"));
	}
}
