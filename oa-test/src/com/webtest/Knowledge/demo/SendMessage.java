package com.webtest.Knowledge.demo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import com.webtest.core.WebTestListener;
import com.webtest.dataprovider.NSDataProvider;
@Listeners(WebTestListener.class)
public class SendMessage extends BaseTest{
	@Test(priority=0)
    public void Message() throws Exception  {
	    Action action =new Action(webtest) ;
	    action.login("admin", "123456");
	    action.message("aaaaaa");
//	    assertTrue(webtest.ifContains("���ⲻ��Ϊ��"));
    }
	@Test(priority=1)
	public void Message2() throws Exception  {
		Action action =new Action(webtest);
		action.login("admin", "123456");
		action.message2("������");
//		assertTrue(webtest.ifContains("���ݲ���Ϊ��"));
	}
	@Test(priority=2)
	public void Message3() throws Exception  {
		Action action =new Action(webtest);
		action.login("admin", "123456");
		action.message3("������","aaaaaa");
//		assertTrue(webtest.ifContains("֪ʶ��Ϣ�����ɹ�"));
	}
}