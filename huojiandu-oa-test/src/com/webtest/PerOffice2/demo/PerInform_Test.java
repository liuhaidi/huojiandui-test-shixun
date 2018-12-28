package com.webtest.PerOffice2.demo;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class PerInform_Test extends BaseTest{
@Test
public void test1() throws IOException {
	PageAction action=new PageAction(webtest);
	action.login("admin","123456");
	action.perOffice();
	action.perinform("", "123", "123");
	assertTrue(webtest.ifContains("手机不能为空"));
}
@Test
public void test2() throws IOException {
	PageAction action=new PageAction(webtest);
	action.login("admin","123456");
	action.perOffice();
	action.perinform("a111", "123", "123");
	assertTrue(webtest.ifContains("手机格式不正确"));
}
@Test
public void test3() throws IOException, InterruptedException {
	PageAction action=new PageAction(webtest);
	action.login("admin","123456");
	action.perOffice();
	action.perinform("12222222222", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa超过部分", "123");
	Thread.sleep(5000);
	assertFalse(webtest.ifContains("超过部分"));
}
@Test
public void test4() throws IOException, InterruptedException {
	PageAction action=new PageAction(webtest);
	action.login("admin","123456");
	action.perOffice();
	action.perinform("12222222222", "123", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa超过部分");
	Thread.sleep(5000);
	assertFalse(webtest.ifContains("超过部分"));
}
}
