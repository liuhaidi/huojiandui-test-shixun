package com.webtest.PerOffice1.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test4 extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}
	@Test(priority=3)//17
	public void beizhu1() throws IOException {
	    action.login("admin","123456");
	    action.kaoqin();
	    action.enter_ifream();
	    action.beizhu2("");
	    assertTrue(webtest.ifContains("成功更新考勤原因"));
	}

}
