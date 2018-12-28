package com.webtest.PerOffice1.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.WebTestListener;

public class Test2 extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}
	@Test(priority=1)//15
	public void daka5() throws IOException {
	    action.login("admin","123456");
	    action.kaoqin();
	    action.enter_ifream();
	    action.daka();
	    assertTrue(webtest.ifContains("未到下班时间"));
	}

}
