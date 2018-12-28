package com.webtest.SystemSetting.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.WebTestListener;

public class Menu_test extends BaseTest {
	Menu_Action action;
	@BeforeMethod
	public void setup() throws IOException {
		action=new Menu_Action(webtest);
		action.login("admin", "123456");
	}
	@Test
	public void add_menu_test() {
		action.add_menu("打卡记录", "", "个人办公");
		assertTrue(webtest.ifContains("成功"));
		webtest.leaveFrame();
	}

}
