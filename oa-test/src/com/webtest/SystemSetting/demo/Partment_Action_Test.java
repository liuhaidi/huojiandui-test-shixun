package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.core.WebTestListener;
@Listeners(WebTestListener.class)
public class Partment_Action_Test extends BaseTest{
	Partment_Action action;
	@BeforeMethod
	public void setup() {
		action=new Partment_Action(webtest);
		webtest.open("http://localhost:8033/tscoa/login.php");
		action.login("admin", "admin123");
	}
	@Test
	public void Add_top_test() {
		action.Add_top("���۲�");
		assertTrue(webtest.ifContains("����������Ϣ���³ɹ�"));
		webtest.leaveFrame();
	}
	@Test
	public void Add_test() {
		action.Add("Ӫ��1","���۲�");
		assertTrue(webtest.ifContains("����������Ϣ���³ɹ�"));
		webtest.leaveFrame();
	}
	@Test
	public void Detail_test() {
		action.Detail();
		assertTrue(webtest.ifContains("Ӫ��"));
		webtest.leaveFrame();
	}
	@Test 
	public void Delete_test() {
		action.Delete(16);
		assertTrue(webtest.ifContains("������Ϣɾ���ɹ�"));
		webtest.leaveFrame();
	}


}
