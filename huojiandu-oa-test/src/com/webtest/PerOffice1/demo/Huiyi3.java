package com.webtest.PerOffice1.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Huiyi3 extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}
	@Test//35
	public void huiyi3() throws IOException {
		action.login("admin", "123456");
		action.huiyi();
		action.enter_ifream();
		action.huiyishenqing("2018-12-10", "2018-12-30", "14", "20", "15", "20", "����1", "74", "����");
		action.leave_ifream();
		action.zhixingren("yuangong1", "123456");//�μ���
		action.enter_ifream();
		assertTrue(webtest.ifContains("����1"));
	}

}
