package com.webtest.PerOffice2.demo;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class WordLimit_Test extends BaseTest{
@Test
public void testWordLimit1() throws IOException, InterruptedException {
	PageAction action=new PageAction(webtest);
	action.login("admin","123456");
	action.perOffice();
	action.workLog();
	action.limit("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa超过部分");
	Thread.sleep(5000);
	assertFalse(webtest.ifContains("超过部分"));
}
@Test
public void testWordLimit2() throws IOException, InterruptedException {
	PageAction action=new PageAction(webtest);
	action.login("admin","123456");
	action.perOffice();
	action.workLog();
	action.limit("");
	Thread.sleep(5000);
	assertTrue(webtest.ifContains("不可发布空评论"));
}
}
