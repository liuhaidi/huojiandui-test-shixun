package com.webtest.PerOffice1.demo;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test_Class extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}

	@Test//11
	public void daka1() throws IOException {
	    action.login("admin","123456");
	    action.kaoqin();
	    action.enter_ifream();
	    action.daka();
	    assertTrue(webtest.ifContains("����Ϣ���³ɹ�"));
	}
	@Test//12
	public void daka2() throws IOException {
	    action.login("admin","123456");
	    action.kaoqin();
	    action.enter_ifream();
	    action.daka();
	    assertTrue(webtest.ifContains("����Ϣ���³ɹ�"));
	}
	@Test//13
	public void daka3() throws IOException {
	    action.login("admin","123456");
	    action.kaoqin();
	    action.enter_ifream();
	    action.daka();
	    assertTrue(webtest.ifContains("�벻Ҫ�ظ���"));
	}
	@Test//14
	public void daka4() throws IOException {
	    action.login("admin","123456");
	    action.kaoqin();
	    action.enter_ifream();
	    action.daka();
	    assertTrue(webtest.ifContains("����Ϣ���³ɹ�"));
	}
	@Test//15
	public void daka5() throws IOException {
	    action.login("admin","123456");
	    action.kaoqin();
	    action.enter_ifream();
	    action.daka();
	    assertTrue(webtest.ifContains("δ���°�ʱ��"));
	}
	@Test//16
	public void daka6() throws IOException {
	    action.login("admin","123456");
	    action.kaoqin();
	    action.enter_ifream();
	    action.daka();
	    assertTrue(webtest.ifContains("�벻Ҫ�ظ���"));
	}
	@Test//17
	public void beizhu1() throws IOException {
	    action.login("admin","123456");
	    action.kaoqin();
	    action.enter_ifream();
	    action.beizhu2("");
	    assertTrue(webtest.ifContains("�ɹ����¿���ԭ��"));
	}
	@Test//18��ʧ�ܣ�
	public void beizhu2() throws IOException {
	    action.login("admin","123456");
	    action.kaoqin();
	    action.enter_ifream();
	    action.beizhu("qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklqwertyuiopasdfghjklzxcv��������");
	    assertFalse(webtest.ifContains("��������"));
	}
	@Test//19��ʧ�ܣ�
	public void beizhu3() throws IOException {
	    action.login("admin","123456");
	    action.kaoqin();
	    action.enter_ifream();
	    action.beizhu();
	    assertTrue(webtest.ifContains("��δ��"));
	}
	@Test//20
	public void beizhu4() throws IOException {
	    action.login("admin","123456");
	    action.kaoqin();
	    action.enter_ifream();
	    action.beizhu("���ı�ע");
	    assertTrue(webtest.ifContains("���ı�ע"));
	}
	@Test//29ʧ��
	public void jihua1() throws IOException {
		action.login("admin", "123456");
		action.jihua();
		action.enter_ifream();
		action.xiugaizhuangtai();
		assertTrue(webtest.ifContains("�����"));
	}
	@Test//30
	public void jihua2() throws IOException {
		action.login("admin", "123456");
		action.jihua();
		action.enter_ifream();
		action.jihuazhuangtai();

	}
	@Test//31
	public void jihua3() throws IOException {
		action.login("admin", "123456");
		action.jihua();
		action.enter_ifream();
		action.jihuapinglun("����");
		assertTrue(webtest.ifContains("���۷����ɹ�"));
	}
	@Test//32��ʧ�ܣ�
	public void jihua4() throws IOException {
		action.login("admin", "123456");
		action.jihua();
		action.enter_ifream();
		action.jihuapinglun("");
		assertTrue(webtest.ifContains("�������ݲ���Ϊ��"));
	}
	@Test//33��ʧ�ܣ�
	public void huiyi1() throws IOException {
		action.login("admin", "123456");
		action.huiyi();
		action.enter_ifream();
		action.huiyishenqing("2018-12-05", "2018-12-05", "14", "20", "15", "20", "����", "74", "����");//������е�ʱ��ص�
		assertTrue(webtest.ifContains("�����������ͻ"));
	}
	@Test//34��ʧ�ܣ�
	public void huiyi2() throws IOException {
		action.login("admin", "123456");
		action.huiyi();
		action.enter_ifream();
		action.huiyishenqing("2018-12-05", "2018-12-05", "14", "20", "15", "20", "����", "75", "����");//��Ӵ�ʱ�����л������
		assertTrue(webtest.ifContains("�л����ͻ�ĳ�ϯ��Ա"));
	}
	@Test//35
	public void huiyi3() throws IOException {
		action.login("admin", "123456");
		action.huiyi();
		action.enter_ifream();
		action.huiyishenqing("2018-12-06", "2018-12-06", "14", "20", "15", "20", "����1", "74", "����");
		action.leave_ifream();
		action.zhixingren("yuangong1", "123456");//�μ���
		action.enter_ifream();
		assertTrue(webtest.ifContains("����1"));
	}
	@Test//36(״̬��Ϊ����)ʧ��
	public void huiyi4() throws IOException, Exception {
		action.login("admin", "123456");
		action.huiyi();
		action.enter_ifream();
		action.huiyishenqing("2018-12-05", "2018-12-05", "14", "20", "15", "20", "����2", "74", "����");
		Thread.sleep(5000);
		action.shenpi();
		assertTrue(webtest.ifContains("����"));
	}
	@Test//11005
	public void huiyi5() throws IOException, Exception {
		action.login("admin", "123456");
		action.huiyi();
		action.enter_ifream();
		action.huiyishenqing("2018-12-05", "2018-12-05", "14", "20", "15", "20", "����3", "74", "����");
		Thread.sleep(5000);
		action.jujue();
		assertTrue(webtest.ifContains("�ܾ�"));
	}
	@Test//38
	public void duanxin1() throws IOException {
		action.login("admin", "123456");
		action.messages();
		action.enter_ifream();
		action.send("����");
		assertTrue(webtest.ifContains("�ֻ����ŷ��ͳɹ�"));
	}
	@Test//39
	public void tongxunlu3() throws IOException, InterruptedException {
		action.login("admin", "123456");
		action.contacts();
		action.enter_ifream();
		action.sendMessage1("qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklqwertyuiopasdfghjklzxcvbnshdtkjyfyfrjy��������");
		Thread.sleep(5000);
		assertFalse(webtest.ifContains("��������"));
	}
	@Test//40
	public void tongxunlu1() throws IOException {
		action.login("admin", "123456");
		action.contacts();
		action.enter_ifream();
		action.sendMessages();
		assertTrue(webtest.ifContains(","));
	}
	
	@Test//41ʧ��
	public void tongxunlu2() throws IOException {
		action.login("admin", "123456");
		action.contacts();
		action.enter_ifream();
		action.addContacts("OA", "song", "15222222222", "15222222222");//��ͬ
		assertTrue(webtest.ifContains("�Ѵ��ڸ���ϵ��"));
	}
	@Test//42ʧ��
	public void qingchu() throws IOException {
		action.login("admin", "123456");
		action.huiyi();
		action.enter_ifream();
		action.clear();
		assertTrue(webtest.ifContains("δѡ������"));
	}
	@Test//748ʧ��
	public void xinjianrenwu1() throws IOException {
		Action action =new Action(webtest);
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("20181205141413","����", "2018-12-07", "2018-12-06", "����");
	    assertTrue(webtest.ifContains("ʱ��Ƿ�"));
	}
	@Test//763(youwenti)
	public void xinjianrenwu2() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu1("20181205141413","����1", "2019");
	    assertTrue(webtest.ifContains("���Ϸ�������"));
	}
	@Test//767
	public void xinjianrenwu3() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("20181205141414","&*", "2018-12-07", "2018-12-06", "����");
	    assertTrue(webtest.ifContains("������Ϣ�����ɹ�"));
	}
	@Test//979
	public void xinjianrenwu4() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("","����1", "2018-12-05", "2018-12-05", "dsdf");
	    assertTrue(webtest.ifContains("����Ϊ��"));
	}
	@Test//981
	public void xinjianrenwu5() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("20181205081151","", "2018-12-05", "2018-12-05", "dsdf");
	    assertTrue(webtest.ifContains("����Ϊ��"));	}
	@Test//982
	public void xinjianrenwu6() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("20181205081151","����1", "", "2018-12-05", "dsdf");
	    assertTrue(webtest.ifContains("����Ϊ��"));	}
	@Test//983
	public void xinjianrenwu7() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("20181205081151","����1", "2018-12-05", "", "dsdf");
	    assertTrue(webtest.ifContains("����Ϊ��"));
	}
	@Test//984
	public void xinjianrenwu8() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu1("20181205081151","����1", "2018-12-05", "2018-12-05", "dsdf");//��ִ����
	    assertTrue(webtest.ifContains("����Ϊ��"));
	}
	@Test//986
	public void xinjianrenwu9() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("20181205081151","����1", "2018-12-05", "2018-12-05", "");
	    assertTrue(webtest.ifContains("����Ϊ��"));
	}
	@Test//998ʧ��
	public void xinjianrenwu10() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("20181205141413","����2", "2018-12-05", "2018-12-05", "dsdf");//���е�������
	    assertTrue(webtest.ifContains("���д�������"));
	}
	@Test//1000ʧ��
	public void xinjianrenwu11() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("20181205081151"," ", "2018-12-05", "2018-12-05", "dsdf");
	    assertTrue(webtest.ifContains("����Ϊ��"));
	}
	@Test//716�������⣩
	public void chakanrenwu1() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.chaxunrenwu("", "renwu", "", "");
	    assertTrue(webtest.ifContains("����"));
	}
	@Test//738�������⣩
	public void chakanrenwu2() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.chaxunrenwu("20181205081151", "����2", "", "");//��������Ʋ���
	    assertFalse(webtest.ifContains("����2"));
	}
	@Test//26�������⣩
	public void chakanrenwu3() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.chaxunrenwu("20181205081151", "", "", "");
	    assertTrue(webtest.ifContains("20181205081151"));
	}
	@Test//27
	public void chakanrenwu4() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.chaxunrenwu("", "����", "", "");
	    assertTrue(webtest.ifContains("����2"));
	}
	@Test//28�������⣩
	public void chakanrenwu5() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.chaxunrenwu("", "", "2018-12-05", "2018-12-05");
	}
	@Test//22
	public void zhixingren() throws IOException {
		action.login("admin","123456");
	    action.zhixingren("yuangong1", "123456");
	    assertTrue(webtest.ifContains("����"));
	}
	@Test//23
	public void jindu1() throws IOException {
	    action.login("admin","123456");
	    action.zhixingren("yuangong1", "123456");
	    action.renwuliebiao1();
	    action.jinduluru();
	    action.lurujindu("50","hdjsh");
	    assertTrue(webtest.ifContains("���������Ϣ�����ɹ�"));
	    
	}
	@Test//24(youwenti)
	public void jindu2() throws IOException {
	    action.login("admin","123456");
	    action.zhixingren("yuangong1", "123456");
	    action.renwuliebiao2();
	    action.jinduluru();
	    action.lurujindu("150","hdjsh");
	    action.fanhuiliebiao();
	    action.enter_ifream();
	    assertTrue(webtest.ifContains("����������"));
	}
	@Test//25
	public void jindu3() throws IOException {
	    action.login("admin","123456");
	    action.zhixingren("yuangong1", "123456");
	    action.renwuliebiao1();
	    action.jinduluru();
	    action.lurujindu("100","hdjsh");
	    action.fanhuiliebiao();
	    action.enter_ifream();
	    assertTrue(webtest.ifContains("�����"));
	}
	@Test//775��ʧ�ܣ�
	public void jindu4() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("20181205081159","����3", "2018-12-06", "2018-12-06", "ad");//ʱ��Ϊδ��ʼ
	    action.leave_ifream();
	    action.zhixingren("yuangong1", "123456");
	    action.renwuliebiao3();
	    action.jinduluru();
	    assertFalse(webtest.ifContains("¼�����"));
	}
	@Test//254
	public void jindu5() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("20181205081160","����4", "2018-12-06", "2018-12-06", "ad");//����ʱ��
	    action.leave_ifream();
	    action.zhixingren("yuangong1", "123456");
	    action.renwuliebiao4();
	    action.jinduluru();
	    assertFalse(webtest.ifContains("¼�����"));
	}
	@Test//255�������⣩
	public void renwuzhuangtai() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("20181205081161","����5", "2018-12-01", "2018-12-01", "ad");//����ʱ��
	    action.bianjirenwu("2018-12-20");
	    assertFalse(webtest.ifContains("������"));
	}
	
	

}
