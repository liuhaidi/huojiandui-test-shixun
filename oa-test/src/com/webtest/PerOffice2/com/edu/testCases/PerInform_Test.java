package com.edu.testCases;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;
import com.edu.pageObjects.PageAction;

public class PerInform_Test extends BaseTest{
@Test
public void test1() throws IOException {
	PageAction action=new PageAction(webtest);
	action.login("admin","123456");
	action.perOffice();
	action.perinform("", "123", "123");
	assertTrue(webtest.ifContains("�ֻ�����Ϊ��"));
}
@Test
public void test2() throws IOException {
	PageAction action=new PageAction(webtest);
	action.login("admin","123456");
	action.perOffice();
	action.perinform("a111", "123", "123");
	assertTrue(webtest.ifContains("�ֻ���ʽ����ȷ"));
}
@Test
public void test3() throws IOException, InterruptedException {
	PageAction action=new PageAction(webtest);
	action.login("admin","123456");
	action.perOffice();
	action.perinform("12222222222", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa��������", "123");
	Thread.sleep(5000);
	assertFalse(webtest.ifContains("��������"));
}
@Test
public void test4() throws IOException, InterruptedException {
	PageAction action=new PageAction(webtest);
	action.login("admin","123456");
	action.perOffice();
	action.perinform("12222222222", "123", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa��������");
	Thread.sleep(5000);
	assertFalse(webtest.ifContains("��������"));
}
}
