package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.WebTestListener;
@Listeners(WebTestListener.class)
public class Workposition_test extends BaseTest{
	Workposition_Action action;
	@BeforeMethod
	public void setup() {
		action=new Workposition_Action(webtest);
		webtest.open("http://localhost:8033/tscoa/login.php");
		action.login("admin", "admin123");
	}
	@Test
	public void Add_top_test() {
		action.Add_top("�ܼ�");
		assertTrue(webtest.ifContains("������λ��Ϣ���³ɹ�"));
		webtest.leaveFrame();
	}
	@Test
	public void Add_test() {
		action.Add("����","����");
		assertTrue(webtest.ifContains("����������Ϣ���³ɹ�"));
		webtest.leaveFrame();
	}
//	@Test
//	public void Detail_test() {
//		action.Detail();
//		assertTrue(webtest.ifContains("Ӫ��"));
//		webtest.leaveFrame();
//	}
//	

}
