package com.webtest.PerOffice1.demo;

import static org.testng.Assert.assertFalse;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Beizhu2 extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}
	@Test//18��ʧ�ܣ�
	public void beizhu2() throws IOException {
	    action.login("admin","123456");
	    action.kaoqin();
	    action.enter_ifream();
	    action.beizhu("qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklqwertyuiopasdfghjklzxcv��������");
	    assertFalse(webtest.ifContains("��������"));
	}

}
