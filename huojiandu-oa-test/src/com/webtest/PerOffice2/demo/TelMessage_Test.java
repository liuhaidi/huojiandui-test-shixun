package com.webtest.PerOffice2.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class TelMessage_Test extends BaseTest{
@Test(priority=0)
public void testdelfailed() throws IOException {
	PageAction action=new PageAction(webtest);
	action.login("admin","123456");
	action.perOffice();
	action.telMessage();
	action.nodel();
	assertTrue(webtest.ifContains("无可删除信息"));
	}
@Test(priority=1)
public void testdelsuccess() throws IOException {
	PageAction action=new PageAction(webtest);
	action.login("admin","123456");
	action.perOffice();
	action.telMessage();
	action.del();
	assertTrue(webtest.ifContains("手机短信删除成功"));
}
}
