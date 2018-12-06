package com.edu.testCases;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;
import com.edu.pageObjects.PageAction;

public class WordLimit_Test extends BaseTest{
@Test
public void testWordLimit1() throws IOException, InterruptedException {
	PageAction action=new PageAction(webtest);
	action.login("admin","123456");
	action.perOffice();
	action.workLog();
	action.limit("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa��������");
	Thread.sleep(5000);
	assertFalse(webtest.ifContains("��������"));
}
@Test
public void testWordLimit2() throws IOException, InterruptedException {
	PageAction action=new PageAction(webtest);
	action.login("admin","123456");
	action.perOffice();
	action.workLog();
	action.limit("");
	Thread.sleep(5000);
	assertTrue(webtest.ifContains("���ɷ���������"));
}
}
