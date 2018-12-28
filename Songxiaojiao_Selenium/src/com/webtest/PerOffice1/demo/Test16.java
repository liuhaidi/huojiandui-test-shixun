package com.webtest.PerOffice1.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test16 extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}
	@Test(priority=15)//11005
	public void huiyi5() throws IOException, Exception {
		action.login("admin", "123456");
		action.huiyi();
		action.enter_ifream();
		action.huiyishenqing("2018-12-05", "2018-12-05", "14", "20", "15", "20", "ª·“È3", "74", "√Ë ˆ");
		Thread.sleep(5000);
		action.jujue();
		assertTrue(webtest.ifContains("æ‹æ¯"));
	}

}
