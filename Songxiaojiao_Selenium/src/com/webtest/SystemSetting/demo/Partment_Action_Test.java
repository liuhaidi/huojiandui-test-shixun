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
		action.Add_top("销售部");
		assertTrue(webtest.ifContains("批量部门信息更新成功"));
		webtest.leaveFrame();
	}
	@Test
	public void Add_test() {
		action.Add("营销1","销售部");
		assertTrue(webtest.ifContains("批量部门信息更新成功"));
		webtest.leaveFrame();
	}
	@Test
	public void Detail_test() {
		action.Detail();
		assertTrue(webtest.ifContains("营销"));
		webtest.leaveFrame();
	}
	@Test 
	public void Delete_test() {
		action.Delete(16);
		assertTrue(webtest.ifContains("部门信息删除成功"));
		webtest.leaveFrame();
	}


}
