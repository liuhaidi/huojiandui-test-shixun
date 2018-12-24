package com.webtest.SystemSetting.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.core.WebTestListener;
@Listeners(WebTestListener.class)
public class Partment_Action_Test extends BaseTest{
	Partment_Action action;
	@BeforeMethod
	public void setup() throws IOException {
		action=new Partment_Action(webtest);
		action.login("admin", "123456");
	}
	@Test
	public void Add_top_test() {
		action.Add_top("���۲�");
		assertTrue(webtest.ifContains("����������Ϣ���³ɹ�"));
		
	}
	@Test
	public void Add_test() {
		action.Add("Ӫ��1","���۲�");
		assertTrue(webtest.ifContains("����������Ϣ���³ɹ�"));
		
	}
	@Test
	public void Detail_test() {
		action.Detail();
		assertTrue(webtest.ifContains("Ӫ��"));
		
	}
	@Test 
	public void Delete_test() {
		action.Delete(16);
		assertTrue(webtest.ifContains("������Ϣɾ���ɹ�"));
		
	}


}
