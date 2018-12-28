package com.webtest.PerOffice1.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test13 extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}
	@Test(priority=12)//34（失败）
	public void huiyi2() throws IOException {
		action.login("admin", "123456");
		action.huiyi();
		action.enter_ifream();
		action.huiyishenqing("2018-12-05", "2018-12-05", "14", "20", "15", "20", "会议", "75", "描述");//添加此时间已有会议的人
		assertTrue(webtest.ifContains("有会议冲突的出席人员"));
	}

}