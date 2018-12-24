package com.webtest.HumanResources.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class DaoChu_Test extends BaseTest {
	 Login_Action action = null;
	@Test
	public void DaoChu_Test() throws InterruptedException, IOException {
		action=new Login_Action(webtest);
		action.login("admin", "123456");
		action.DaoChu();
		assertTrue(webtest.ifContains("考勤信息下载成功！"));
	}
}
