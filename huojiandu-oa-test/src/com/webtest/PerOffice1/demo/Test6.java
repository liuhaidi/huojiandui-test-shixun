package com.webtest.PerOffice1.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test6 extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}
	@Test(priority=5)//19£¨Ê§°Ü£©
	public void beizhu3() throws IOException {
	    action.login("admin","123456");
	    action.kaoqin();
	    action.enter_ifream();
	    action.beizhu();
	    assertTrue(webtest.ifContains("ÄúÎ´´ò¿¨"));
	}

}
