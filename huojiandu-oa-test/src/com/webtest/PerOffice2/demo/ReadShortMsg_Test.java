package com.webtest.PerOffice2.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ReadShortMsg_Test extends BaseTest{
@Test
public void testReadShortMsg() throws IOException {
	PageAction action=new PageAction(webtest);
	action.login("admin","123456");
	action.perOffice();
	action.shortMessage();
	assertTrue(webtest.ifContains("短消息操作成功"));
}
}
