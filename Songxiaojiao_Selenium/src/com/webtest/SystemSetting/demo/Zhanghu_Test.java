package com.webtest.SystemSetting.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.WebTestListener;


public class Zhanghu_Test extends BaseTest {
	Zhanghu_Action action;
	@BeforeMethod
	public void setup() throws IOException {
		action=new Zhanghu_Action(webtest);
		action.login("admin", "123456");
	}
	@Test
	public void add_test_fail() throws InterruptedException {
		action.add("WHX", "admin123", "王浩馨");
		assertTrue(webtest.ifContains("成功"));
		webtest.leaveFrame();
		
	}
	@Test
	public void add_test_succeess() throws InterruptedException {
		action.add("YJW", "admin123", "小于");
		assertTrue(webtest.ifContains("成功"));
		webtest.leaveFrame();
		
	}
	
	@Test
	public void select_test() throws InterruptedException {
		action.select("whx", "王浩馨", "市场部", "用户组2");
	}
	@Test 
	public void intMessage_test() {
		action.intMessage("D:\\test.csv");
		assertTrue(webtest.ifContains("成功"));
	}

}
