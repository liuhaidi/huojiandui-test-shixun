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
	    assertTrue(webtest.ifContains("打卡信息更新成功"));
	}
	@Test//12
	public void daka2() throws IOException {
	    action.login("admin","123456");
	    action.kaoqin();
	    action.enter_ifream();
	    action.daka();
	    assertTrue(webtest.ifContains("打卡信息更新成功"));
	}
	@Test//13
	public void daka3() throws IOException {
	    action.login("admin","123456");
	    action.kaoqin();
	    action.enter_ifream();
	    action.daka();
	    assertTrue(webtest.ifContains("请不要重复打卡"));
	}
	@Test//14
	public void daka4() throws IOException {
	    action.login("admin","123456");
	    action.kaoqin();
	    action.enter_ifream();
	    action.daka();
	    assertTrue(webtest.ifContains("打卡信息更新成功"));
	}
	@Test//15
	public void daka5() throws IOException {
	    action.login("admin","123456");
	    action.kaoqin();
	    action.enter_ifream();
	    action.daka();
	    assertTrue(webtest.ifContains("未到下班时间"));
	}
	@Test//16
	public void daka6() throws IOException {
	    action.login("admin","123456");
	    action.kaoqin();
	    action.enter_ifream();
	    action.daka();
	    assertTrue(webtest.ifContains("请不要重复打卡"));
	}
	@Test//17
	public void beizhu1() throws IOException {
	    action.login("admin","123456");
	    action.kaoqin();
	    action.enter_ifream();
	    action.beizhu2("");
	    assertTrue(webtest.ifContains("成功更新考勤原因"));
	}
	@Test//18（失败）
	public void beizhu2() throws IOException {
	    action.login("admin","123456");
	    action.kaoqin();
	    action.enter_ifream();
	    action.beizhu("qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklqwertyuiopasdfghjklzxcv超过部分");
	    assertFalse(webtest.ifContains("超过部分"));
	}
	@Test//19（失败）
	public void beizhu3() throws IOException {
	    action.login("admin","123456");
	    action.kaoqin();
	    action.enter_ifream();
	    action.beizhu();
	    assertTrue(webtest.ifContains("您未打卡"));
	}
	@Test//20
	public void beizhu4() throws IOException {
	    action.login("admin","123456");
	    action.kaoqin();
	    action.enter_ifream();
	    action.beizhu("更改备注");
	    assertTrue(webtest.ifContains("更改备注"));
	}
	@Test//29失败
	public void jihua1() throws IOException {
		action.login("admin", "123456");
		action.jihua();
		action.enter_ifream();
		action.xiugaizhuangtai();
		assertTrue(webtest.ifContains("已完成"));
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
		action.jihuapinglun("评论");
		assertTrue(webtest.ifContains("评论发布成功"));
	}
	@Test//32（失败）
	public void jihua4() throws IOException {
		action.login("admin", "123456");
		action.jihua();
		action.enter_ifream();
		action.jihuapinglun("");
		assertTrue(webtest.ifContains("评论内容不能为空"));
	}
	@Test//33（失败）
	public void huiyi1() throws IOException {
		action.login("admin", "123456");
		action.huiyi();
		action.enter_ifream();
		action.huiyishenqing("2018-12-05", "2018-12-05", "14", "20", "15", "20", "会议", "74", "描述");//添加已有的时间地点
		assertTrue(webtest.ifContains("与其他会议冲突"));
	}
	@Test//34（失败）
	public void huiyi2() throws IOException {
		action.login("admin", "123456");
		action.huiyi();
		action.enter_ifream();
		action.huiyishenqing("2018-12-05", "2018-12-05", "14", "20", "15", "20", "会议", "75", "描述");//添加此时间已有会议的人
		assertTrue(webtest.ifContains("有会议冲突的出席人员"));
	}
	@Test//35
	public void huiyi3() throws IOException {
		action.login("admin", "123456");
		action.huiyi();
		action.enter_ifream();
		action.huiyishenqing("2018-12-06", "2018-12-06", "14", "20", "15", "20", "会议1", "74", "描述");
		action.leave_ifream();
		action.zhixingren("yuangong1", "123456");//参加人
		action.enter_ifream();
		assertTrue(webtest.ifContains("会议1"));
	}
	@Test//36(状态变为己批)失败
	public void huiyi4() throws IOException, Exception {
		action.login("admin", "123456");
		action.huiyi();
		action.enter_ifream();
		action.huiyishenqing("2018-12-05", "2018-12-05", "14", "20", "15", "20", "会议2", "74", "描述");
		Thread.sleep(5000);
		action.shenpi();
		assertTrue(webtest.ifContains("已批"));
	}
	@Test//11005
	public void huiyi5() throws IOException, Exception {
		action.login("admin", "123456");
		action.huiyi();
		action.enter_ifream();
		action.huiyishenqing("2018-12-05", "2018-12-05", "14", "20", "15", "20", "会议3", "74", "描述");
		Thread.sleep(5000);
		action.jujue();
		assertTrue(webtest.ifContains("拒绝"));
	}
	@Test//38
	public void duanxin1() throws IOException {
		action.login("admin", "123456");
		action.messages();
		action.enter_ifream();
		action.send("短信");
		assertTrue(webtest.ifContains("手机短信发送成功"));
	}
	@Test//39
	public void tongxunlu3() throws IOException, InterruptedException {
		action.login("admin", "123456");
		action.contacts();
		action.enter_ifream();
		action.sendMessage1("qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklqwertyuiopasdfghjklzxcvbnshdtkjyfyfrjy超出部分");
		Thread.sleep(5000);
		assertFalse(webtest.ifContains("超出部分"));
	}
	@Test//40
	public void tongxunlu1() throws IOException {
		action.login("admin", "123456");
		action.contacts();
		action.enter_ifream();
		action.sendMessages();
		assertTrue(webtest.ifContains(","));
	}
	
	@Test//41失败
	public void tongxunlu2() throws IOException {
		action.login("admin", "123456");
		action.contacts();
		action.enter_ifream();
		action.addContacts("OA", "song", "15222222222", "15222222222");//相同
		assertTrue(webtest.ifContains("已存在该联系人"));
	}
	@Test//42失败
	public void qingchu() throws IOException {
		action.login("admin", "123456");
		action.huiyi();
		action.enter_ifream();
		action.clear();
		assertTrue(webtest.ifContains("未选中数据"));
	}
	@Test//748失败
	public void xinjianrenwu1() throws IOException {
		Action action =new Action(webtest);
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("20181205141413","任务", "2018-12-07", "2018-12-06", "描述");
	    assertTrue(webtest.ifContains("时间非法"));
	}
	@Test//763(youwenti)
	public void xinjianrenwu2() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu1("20181205141413","任务1", "2019");
	    assertTrue(webtest.ifContains("不合法的日期"));
	}
	@Test//767
	public void xinjianrenwu3() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("20181205141414","&*", "2018-12-07", "2018-12-06", "描述");
	    assertTrue(webtest.ifContains("任务信息操作成功"));
	}
	@Test//979
	public void xinjianrenwu4() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("","任务1", "2018-12-05", "2018-12-05", "dsdf");
	    assertTrue(webtest.ifContains("不能为空"));
	}
	@Test//981
	public void xinjianrenwu5() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("20181205081151","", "2018-12-05", "2018-12-05", "dsdf");
	    assertTrue(webtest.ifContains("不能为空"));	}
	@Test//982
	public void xinjianrenwu6() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("20181205081151","任务1", "", "2018-12-05", "dsdf");
	    assertTrue(webtest.ifContains("不能为空"));	}
	@Test//983
	public void xinjianrenwu7() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("20181205081151","任务1", "2018-12-05", "", "dsdf");
	    assertTrue(webtest.ifContains("不能为空"));
	}
	@Test//984
	public void xinjianrenwu8() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu1("20181205081151","任务1", "2018-12-05", "2018-12-05", "dsdf");//无执行人
	    assertTrue(webtest.ifContains("不能为空"));
	}
	@Test//986
	public void xinjianrenwu9() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("20181205081151","任务1", "2018-12-05", "2018-12-05", "");
	    assertTrue(webtest.ifContains("不能为空"));
	}
	@Test//998失败
	public void xinjianrenwu10() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("20181205141413","任务2", "2018-12-05", "2018-12-05", "dsdf");//已有的任务编号
	    assertTrue(webtest.ifContains("已有此任务编号"));
	}
	@Test//1000失败
	public void xinjianrenwu11() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("20181205081151"," ", "2018-12-05", "2018-12-05", "dsdf");
	    assertTrue(webtest.ifContains("不能为空"));
	}
	@Test//716（有问题）
	public void chakanrenwu1() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.chaxunrenwu("", "renwu", "", "");
	    assertTrue(webtest.ifContains("任务"));
	}
	@Test//738（有问题）
	public void chakanrenwu2() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.chaxunrenwu("20181205081151", "任务2", "", "");//编号与名称不符
	    assertFalse(webtest.ifContains("任务2"));
	}
	@Test//26（有问题）
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
	    action.chaxunrenwu("", "任务", "", "");
	    assertTrue(webtest.ifContains("任务2"));
	}
	@Test//28（有问题）
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
	    assertTrue(webtest.ifContains("任务"));
	}
	@Test//23
	public void jindu1() throws IOException {
	    action.login("admin","123456");
	    action.zhixingren("yuangong1", "123456");
	    action.renwuliebiao1();
	    action.jinduluru();
	    action.lurujindu("50","hdjsh");
	    assertTrue(webtest.ifContains("任务进度信息操作成功"));
	    
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
	    assertTrue(webtest.ifContains("超出来进度"));
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
	    assertTrue(webtest.ifContains("已完成"));
	}
	@Test//775（失败）
	public void jindu4() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("20181205081159","任务3", "2018-12-06", "2018-12-06", "ad");//时间为未开始
	    action.leave_ifream();
	    action.zhixingren("yuangong1", "123456");
	    action.renwuliebiao3();
	    action.jinduluru();
	    assertFalse(webtest.ifContains("录入进度"));
	}
	@Test//254
	public void jindu5() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("20181205081160","任务4", "2018-12-06", "2018-12-06", "ad");//超过时间
	    action.leave_ifream();
	    action.zhixingren("yuangong1", "123456");
	    action.renwuliebiao4();
	    action.jinduluru();
	    assertFalse(webtest.ifContains("录入进度"));
	}
	@Test//255（有问题）
	public void renwuzhuangtai() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("20181205081161","任务5", "2018-12-01", "2018-12-01", "ad");//超过时间
	    action.bianjirenwu("2018-12-20");
	    assertFalse(webtest.ifContains("进行中"));
	}
	
	

}
