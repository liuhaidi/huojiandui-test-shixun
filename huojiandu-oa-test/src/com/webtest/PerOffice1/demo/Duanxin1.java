package com.webtest.PerOffice1.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Duanxin1 extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}
	@Test//38
	public void duanxin1() throws IOException {
		action.login("admin", "123456");
		action.messages();
		action.enter_ifream();
		action.send("����");
		assertTrue(webtest.ifContains("�ֻ����ŷ��ͳɹ�"));
	}

}