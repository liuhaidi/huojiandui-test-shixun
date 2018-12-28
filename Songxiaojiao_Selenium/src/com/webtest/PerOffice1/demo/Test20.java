package com.webtest.PerOffice1.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test20 extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}
	@Test(priority=19)//41失败
	public void tongxunlu2() throws IOException {
		action.login("admin", "123456");
		action.contacts();
		action.enter_ifream();
		action.addContacts("OA", "song", "15222222222", "15222222222");//相同
		assertTrue(webtest.ifContains("已存在该联系人"));
	}

}
