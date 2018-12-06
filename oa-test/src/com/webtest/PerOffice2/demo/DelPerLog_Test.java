package com.edu.testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;
import com.edu.pageObjects.PageAction;

public class DelPerLog_Test extends BaseTest{
@Test
public void testDelPerLog() throws IOException {
	PageAction action=new PageAction(webtest);
	action.login("admin","123456");
	action.perOffice();
	action.perlog();
	assertTrue(webtest.ifContains("��û��Ȩ��"));
}
}