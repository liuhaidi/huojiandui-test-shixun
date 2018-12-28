package com.webtest.PerOffice1.demo;

import static org.testng.Assert.assertFalse;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test18 extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}
	@Test(priority=17)//39
	public void tongxunlu3() throws IOException, InterruptedException {
		action.login("admin", "123456");
		action.contacts();
		action.enter_ifream();
		action.sendMessage1("qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklqwertyuiopasdfghjklzxcvbnshdtkjyfyfrjy超出部分");
		Thread.sleep(5000);
		assertFalse(webtest.ifContains("超出部分"));
	}

}
