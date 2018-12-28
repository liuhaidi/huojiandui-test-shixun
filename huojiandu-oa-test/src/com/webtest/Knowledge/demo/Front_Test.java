package com.webtest.Knowledge.demo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import com.webtest.core.WebTestListener;
import com.webtest.dataprovider.NSDataProvider;

public class Front_Test extends BaseTest{
	
	@Test(priority=1)
	public void LoginSuccess() throws Exception  {
		Action action =new Action(webtest);
		action.login("admin", "123456");
    	assertTrue(webtest.ifContains("�˳�"));
	}
	@Test(priority=0)
	public void LoginFail() throws Exception  {
		Action action =new Action(webtest);
		action.login("admin", "654321");
		assertTrue(webtest.ifContains("��¼ʧ��111 "));
	}
	@Test(priority=2)
	public void KnowLedge() throws Exception  {
		Action action =new Action(webtest) ;
		action.knowledge();
		assertTrue(webtest.ifContains("֪ʶ����"));
	}
	@Test(priority=3)
	public void Others() throws Exception  {
		Action action =new Action(webtest) ;
		action.others();
		assertTrue(webtest.ifContains("֪ʶ����"));
	}
	@Test(priority=4)
	public void Message() throws Exception  {
		Action action =new Action(webtest) ;
		action.message("aaaaaa");
		assertTrue(webtest.ifContains("���ⲻ��Ϊ��"));
	}
	@Test(priority=5)
	public void Message2() throws Exception  {
		Action action =new Action(webtest) ;
		action.message2("������");
		assertTrue(webtest.ifContains("���ݲ���Ϊ��"));
	}
	@Test(priority=6)
	public void Message3() throws Exception  {
		Action action =new Action(webtest) ;
		action.message3("������","aaaaaa");
		assertTrue(webtest.ifContains("֪ʶ��Ϣ�����ɹ�"));
	}
	@Test(priority=7)
	public void Search() throws Exception  {
		Action action =new Action(webtest) ;
		action.search("������");
		assertTrue(webtest.ifContains("������"));
	}
	@Test(priority=8)
	public void Search2() throws Exception  {
		Action action =new Action(webtest) ;
		action.search2();
		assertTrue(webtest.ifContains("������"));
	}
	@Test(priority=9)
	public void Search3() throws Exception  {
		Action action =new Action(webtest) ;
		action.search3("������");
		assertTrue(webtest.ifContains("������"));
	}
	@Test(priority=10)
	public void DeleteKn() throws Exception  {
		Action action =new Action(webtest) ;
		action.deletekn();
		assertTrue(webtest.ifContains("֪ʶ��Ϣɾ���ɹ�"));
	}
	@Test(priority=11)
	public void Deletekn2() throws Exception  {
		Action action =new Action(webtest) ;
		action.deletekn2();
		assertTrue(webtest.ifContains("������ѡ��һ������"));
	}
	@Test(priority=12)
	public void Tz() throws Exception  {
		Action action =new Action(webtest) ;
		action.tiezi();
		assertTrue(webtest.ifContains("������Ϣ����"));
	}
	@Test(priority=13)
	public void Forum() throws Exception  {
		Action action =new Action(webtest) ;
		action.forum("����Ӳ�������2");
		assertTrue(webtest.ifContains("�����Ϣ�����ɹ�"));
	}
	@Test(priority=14)
	public void Forum2() throws Exception  {
		Action action =new Action(webtest) ;
		action.forum2();
		assertTrue(webtest.ifContains("�����Ϣɾ���ɹ�"));
	}
	@Test(priority=15)
	public void Forum3() throws Exception  {
		Action action =new Action(webtest) ;
		action.forum3();
		assertTrue(webtest.ifContains("�����Ϣ�����ɹ�"));
	}
	@Test(priority=16)
	public void Tz2() throws Exception  {
		Action action =new Action(webtest) ;
		action.tiezi2("�����fighting","����Ӽ��ͣ�");
		assertTrue(webtest.ifContains("��鲻��Ϊ��"));
	}
	@Test(priority=17)
	public void Tz3() throws Exception  {
		Action action =new Action(webtest) ;
		action.tiezi3("����Ӽ��ͣ�");
		assertTrue(webtest.ifContains("���ⲻ��Ϊ��"));
	}
	@Test(priority=18)
	public void Tz4() throws Exception  {
		Action action =new Action(webtest) ;
		action.tiezi4("�����fighting");
		assertTrue(webtest.ifContains("���ݲ���Ϊ��"));
	}
	@Test(priority=19)
	public void Tz5() throws Exception  {
		Action action =new Action(webtest) ;
		action.tiezi5("�����fighting","����Ӽ��ͣ�");
		assertTrue(webtest.ifContains("������Ϣ�����ɹ�"));
	}
	@Test(priority=20)
	public void Tz6() throws Exception  {
		Action action =new Action(webtest) ;
		action.tiezi6();
		assertTrue(webtest.ifContains("������Ϣ����"));
	}
	@Test(priority=26)
	public void Rename() throws Exception  {
		Action action =new Action(webtest) ;
		action.rename("1.4 ̽��ʽ������ԡ���������Է�");
		assertTrue(webtest.ifContains("������Ϣ����"));
	}
	@Test(priority=27)
	public void Deletefile() throws Exception  {
		Action action =new Action(webtest) ;
		action.deletefile();
		assertTrue(webtest.ifContains("ȷ��Ҫɾ���ļ���"));
	}
	@Test(priority=28)
	public void Deletefile2() throws Exception  {
		Action action =new Action(webtest) ;
		action.deletefile2();
		assertTrue(webtest.ifContains("������ѡ��һ���ļ�"));
	}
	@Test(priority=29)
	public void Deletefile3() throws Exception  {
		Action action =new Action(webtest) ;
		action.deletefile3();
		assertTrue(webtest.ifContains("ȷ��Ҫɾ���ļ���"));
	}
	@Test(priority=30)
	public void Share() throws Exception  {
		Action action =new Action(webtest) ;
		action.share();
		assertTrue(webtest.ifContains("����ɹ�"));
	}
	@Test(priority=33)
	public void Newfile() throws Exception  {
		Action action =new Action(webtest) ;
		action.newfile();
		assertTrue(webtest.ifContains("�ļ������Ʋ���Ϊ�գ�������"));
	}
	@Test(priority=34)
	public void Newfile2() throws Exception  {
		Action action =new Action(webtest) ;
		action.newfile2("huojian");
		assertTrue(webtest.ifContains("�ļ����Ѵ��ڣ�����������"));
	}
	@Test(priority=35)
	public void Newfile3() throws Exception  {
		Action action =new Action(webtest) ;
		action.newfile3(" ");
		assertTrue(webtest.ifContains("�ļ������Ʋ���Ϊ��"));
	}
	@Test(priority=36)
	public void Newfile4() throws Exception  {
		Action action =new Action(webtest) ;
		action.newfile4("huojian2");
	}
	@Test(priority=37)
	public void Newfile5() throws Exception  {
		Action action =new Action(webtest) ;
		action.newfile5("huojian3");
	}
	@Test(priority=38)
	public void Deletefile4() throws Exception  {
		Action action =new Action(webtest) ;
		action.deletefile4();
	}
	@Test(priority=39)
	public void Search4() throws Exception  {
		Action action =new Action(webtest) ;
		action.search4();
		assertTrue(webtest.ifContains("������Ҫ��ѯ���ļ�����"));
	}
	@Test(priority=40)
	public void Search5() throws Exception  {
		Action action =new Action(webtest) ;
		action.search5("1.0 ������Ի����γ̻ع�");
		assertTrue(webtest.ifContains("����"));
	}
	@Test(priority=41)
	public void Search6() throws Exception  {
		Action action =new Action(webtest) ;
		action.search6("lalala");
		assertTrue(webtest.ifContains("����"));
	}
	@Test(priority=42)
	public void Move() throws Exception  {
		Action action =new Action(webtest) ;
		action.move();
		assertTrue(webtest.ifContains("����"));
	}
	@Test(priority=43)
	public void Move2() throws Exception  {
		Action action =new Action(webtest) ;
		action.move2();
		assertTrue(webtest.ifContains("����"));
	}
}
