package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.WebTestListener;
@Listeners(WebTestListener.class)
public class QuanXianSet_test extends BaseTest{
	QuanXianSet_action action;
	@BeforeMethod
	public void setup() {
		action=new QuanXianSet_action(webtest);
		webtest.open("http://localhost:8033/tscoa/login.php");
		action.login("admin", "admin123");
		
	}
	@Test
	public void New_test() throws InterruptedException {
		
		action.New("�û���3");
		assertTrue(webtest.ifContains("Ȩ������Ϣ�����ɹ�"));
		webtest.leaveFrame();
	}
//	@Test
//	public void GengZheng_test() throws InterruptedException {
//		
//		action.GengZheng("�û���2");
//		assertTrue(webtest.ifContains("Ȩ������Ϣ�����ɹ�"));
//		webtest.leaveFrame();
//		
//	}
//	@Test
//	public void Delete_test() throws InterruptedException {
//		webtest.open("http://localhost:8033/tscoa/login.php");
//		action.login("admin", "admin123");
//		action.Delete();
//		
//	}
//	@Test void ALLdelete_test() {
//		action.ALLdelete();
//		assertTrue(webtest.ifContains("Ȩ������Ϣɾ���ɹ�"));
//	}

}
