package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import com.webtest.core.WebTestListener;
import com.webtest.dataprovider.NSDataProvider;
@Listeners(WebTestListener.class)
public class SendPost extends BaseTest{
	@Test(priority=0)
	public void Tz() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.tiezi();
	}
	@Test(priority=1)
	public void Tz2() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.tiezi2("�����fighting","����Ӽ��ͣ�");
//		assertTrue(webtest.ifContains("��鲻��Ϊ��"));
	}
	@Test(priority=2)
	public void Tz3() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.tiezi3("����Ӽ��ͣ�");
//		assertTrue(webtest.ifContains("���ⲻ��Ϊ��"));
	}
	@Test(priority=3)
	public void Tz4() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.tiezi4("�����fighting");
//		assertTrue(webtest.ifContains("���ݲ���Ϊ��"));
	}
	@Test(priority=4)
	public void Tz5() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.tiezi5("�����fighting","����Ӽ��ͣ�");
//		assertTrue(webtest.ifContains("������Ϣ�����ɹ�"));
	}
	@Test(priority=5)
	public void Tz6() throws Exception  {
		Action action =new Action(webtest) ;
		action.login("admin", "123456");
		action.tiezi6();
	}
}
