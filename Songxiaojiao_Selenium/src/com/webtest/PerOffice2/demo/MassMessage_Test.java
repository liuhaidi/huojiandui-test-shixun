package com.webtest.PerOffice2.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class MassMessage_Test extends BaseTest{
@Test
public void testMassMsg() throws IOException, InterruptedException {
	PageAction action=new PageAction(webtest);
	action.login("admin","123456");
	action.perOffice();
	action.tel();
	action.checkBox();
	action.sendMessage("�����ֻ��������ݣ���");
	assertTrue(webtest.ifContains("���ŷ��ͳɹ�"));
}
}
