package com.webtest.HumanResources.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Front_Login_Test extends BaseTest {
	Login_Action action = null;
 
	@Test
	public void setup() throws IOException {
		action=new Login_Action(webtest);
		action.login("admin", "123456");
		
	}

	
	@Test
	public void Time_Test() throws InterruptedException, IOException {
		action=new Login_Action(webtest);
		action.login("admin", "123456");
	    action.Time();
}
	@Test
	public void ZhouQi_Test() throws IOException {		
		action=new Login_Action(webtest);
		action.login("admin", "123456");
	    action.ZhouQi("2018-12-01","2018-12-05");
}
	@Test
	public void ShanChuOne_Test() throws InterruptedException, IOException {
		action=new Login_Action(webtest);
		action.login("admin", "123456");
		action.ShanChuOne();
		assertTrue(webtest.ifContains("������Ϣ����ɹ���"));
	}
	@Test
	public void ShanChuMore_Test() throws InterruptedException, IOException {
		action=new Login_Action(webtest);
		action.login("admin", "123456");
		action.ShanChuMore();
		assertTrue(webtest.ifContains("������Ϣ����ɹ���"));
	}
	@Test
	public void DaoChu_Test() throws InterruptedException, IOException {
		action=new Login_Action(webtest);
		action.login("admin", "123456");
		action.DaoChu();
		assertTrue(webtest.ifContains("������Ϣ���سɹ���"));
	}
	@Test
	public void BianHaoChaXun_Test() throws IOException, InterruptedException {
		action=new Login_Action(webtest);
		action.login("admin", "123456");
		action.BianHaoChaXun("20181127085529");
	}
		
	@Test
	public void LeiXingChaXun_Test() throws InterruptedException, IOException {
		action=new Login_Action(webtest);
		action.login("admin", "123456");
		action.LeiXingChaXun("����");
		
	}
	@Test
	public void FaBu_Test() throws InterruptedException, IOException {
		action=new Login_Action(webtest);
		action.login("admin", "123456");
		action.FaBu("2018-11-21", "2018-11-30", "5", "2018-12-01", "1", "2018-12-30");
		assertTrue(webtest.ifContains("��λԱ������Ϊ��"));
	}
	@Test
	public void HengChaiDan_Test() {
		action.HengChaiDan();
		
	}
	@Test
	public void QuanXuanShanChu_Test() {
		action.QuanXuanShanChu();
		assertTrue(webtest.ifContains("��ѵ��Ϣ����ɹ���"));
	}
	@Test
	public void CanYu_Test() {
		action.CanYu("�ڲ���ѵ");
		
	}
	@Test
	public void JiLu_Test() {
		action.JiLu("�ڲ���ѵ");
		
	}
	
	@Test
	public void FaBuJiangCheng_Test() throws InterruptedException {
		action.FaBuJiangCheng("2018-11-01", "�ͷ�", "1", "�ٵ�","2018", "12");
		assertTrue(webtest.ifContains("��λԱ������Ϊ��"));
		
	}
	@Test
	public void CaiDanTongBu_Test() throws InterruptedException {
		action.CaiDanTongBu();
		assertTrue(webtest.ifContains("����ͬ��"));
		
	}
	@Test
	public void XinJianHeTong_Test() throws InterruptedException {
		action.XinJianHeTong("���ܺ�ͬ");
		assertTrue(webtest.ifContains("�Ѵ��ڸú�ͬ����"));
		
	}
	@Test
	public void XueLiShanChu() throws InterruptedException {
		action.XueLiShanChu();
		assertTrue(webtest.ifContains("�ɹ�ɾ��"));
		
	}
	
}


