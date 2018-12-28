package com.webtest.SystemSetting.demo;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Zhanghu_Test2 extends BaseTest{
	Zhanghu_Action action;
	@Test
	public void select_test() throws InterruptedException, IOException {
		action=new Zhanghu_Action(webtest);
		action.login("admin", "123456");
		action.select("whx", "王浩馨", "管理层", "管理组");
	}

}
