package com.webtest.HumanResources.demo;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class QuanXuanShanChu_Test extends BaseTest{
	
	Login_Action action = null;

	@Test
	public void QuanXuanShanChu_Test() throws IOException {
		action=new Login_Action(webtest);
		action.login("admin", "123456");
		action.QuanXuanShanChu();
		assertTrue(webtest.ifContains("培训信息清理成功！"));
	}
}
