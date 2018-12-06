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
		action.Add_top("总监");
		assertTrue(webtest.ifContains("批量岗位信息更新成功"));
		webtest.leaveFrame();
	}
	@Test
	public void Add_test() {
		action.Add("助理","总助");
		assertTrue(webtest.ifContains("批量部门信息更新成功"));
		webtest.leaveFrame();
	}
//	@Test
//	public void Detail_test() {
//		action.Detail();
//		assertTrue(webtest.ifContains("营销"));
//		webtest.leaveFrame();
//	}
//	

}
