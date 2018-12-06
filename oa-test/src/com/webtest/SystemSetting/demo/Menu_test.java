package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.WebTestListener;
@Listeners(WebTestListener.class)
public class Menu_test extends BaseTest {
	Menu_Action action;
	@BeforeMethod
	public void setup() {
		action=new Menu_Action(webtest);
		webtest.open("http://localhost:8033/tscoa/login.php");
		action.login("admin", "admin123");
	}
	@Test
	public void add_menu_test() {
		action.add_menu("�򿨼�¼", "", "���˰칫");
		assertTrue(webtest.ifContains("�ɹ�"));
		webtest.leaveFrame();
	}

}
