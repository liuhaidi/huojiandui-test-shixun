package com.webtest.PerOffice1.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test19 extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}
	@Test(priority=18)//40
	public void tongxunlu1() throws IOException {
		action.login("admin", "123456");
		action.contacts();
		action.enter_ifream();
		action.sendMessages();
		assertTrue(webtest.ifContains(","));
	}

}