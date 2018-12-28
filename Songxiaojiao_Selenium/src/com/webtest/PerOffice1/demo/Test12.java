package com.webtest.PerOffice1.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test12 extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}
	@Test(priority=11)//33（失败）
	public void huiyi1() throws IOException {
		action.login("admin", "123456");
		action.huiyi();
		action.enter_ifream();
		action.huiyishenqing("2018-12-05", "2018-12-05", "14", "20", "15", "20", "会议", "74", "描述");//添加已有的时间地点
		assertTrue(webtest.ifContains("与其他会议冲突"));
	}

}
