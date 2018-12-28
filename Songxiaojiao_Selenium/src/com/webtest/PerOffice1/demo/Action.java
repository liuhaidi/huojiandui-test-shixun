package com.webtest.PerOffice1.demo;

import java.io.IOException;

import com.webtest.core.WebDriverEngine;
import com.webtest.utils.ReadProperties;

public class Action {
	WebDriverEngine webtest = null;
	public Action(WebDriverEngine webtest) {
		this.webtest = webtest;
	}
	//登录
	public void login(String username,String password) throws IOException {
		webtest.open(ReadProperties.getPropertyValue("base_url"));
		webtest.type("id=vipname", username);
		webtest.type("id=vippassword", password);
		webtest.click("link=登录");
		
	}
	//个人办公
	public void perOffice() {
		webtest.click("link=个人办公");
		webtest.pause(3000);
	}
	
	//1.在线考勤
	public void kaoqin() {
		perOffice();
		webtest.click("link=在线考勤");
		
	}
	//打卡
	public void daka() {
		webtest.click("xpath=//input[@value='在线打卡']");
	}
	//提交备注1
	public void beizhu() {
			webtest.click("xpath=//input[@value='提交备注']");
		}
	//提交备注2
	public void beizhu(String beizhu) {
		webtest.click("xpath=//input[starts-with(@name, 'note')]");
		webtest.typeAndClear("xpath=//input[starts-with(@name, 'note')]",beizhu);
		webtest.click("xpath=//input[@value='提交备注']");
		webtest.pause(5000);
	}
	public void beizhu2(String beizhu) {
		webtest.click("xpath=//input[starts-with(@name, 'note')]");
		webtest.typeAndClear("xpath=//input[starts-with(@name, 'note')]",beizhu);
		webtest.click("xpath=//input[@value='提交备注']");
	}
	//2.任务管理
	public void renwuguanli() {
		perOffice();
		webtest.click("link=任务管理");
	}
	//新建任务
	public void xinjianrenwu(String number,String title,String startdate,String enddate,String description) {
		webtest.click("xpath=//button[@action='new_work']");
		webtest.typeAndClear("xpath=//input[@name='number']", number);
		webtest.type("xpath=//input[@name='title']", title);
		webtest.typeAndClear("xpath=//input[@name='startdate']", startdate);
		webtest.typeAndClear("xpath=//input[@name='enddate']", enddate);
		webtest.click("link=+选择执行人");
		webtest.getWindow(1);
		System.out.println(webtest.getText("xpath=//span[@class='big3']"));
		webtest.click("xpath=//div[@title='管理层']/img");
		webtest.click("xpath=//div[@title='人力资源部']/img");
		webtest.click("xpath=//div[@title='人力资源部']/img[@id='tree_16_cb']");
		webtest.click("xpath=//input[@value='确 定']");
		webtest.getWindow(0);
		webtest.click("class=ke-iframe");
		webtest.type("class=ke-iframe", description);
		webtest.click("xpath=//input[@value='保存信息']");
	}
	public void xinjianrenwu1(String number,String title,String startdate) {
		webtest.click("xpath=//button[@action='new_work']");
		webtest.typeAndClear("xpath=//input[@name='number']", number);
		webtest.type("xpath=//input[@name='title']", title);
		webtest.typeAndClear("xpath=//input[@name='startdate']", startdate);
		webtest.click("id=user");
	}
	//新建任务无执行人
	public void xinjianrenwu1(String number,String title,String startdate,String enddate,String description) {
		webtest.click("xpath=//button[@action='new_work']");
		webtest.typeAndClear("xpath=//input[@name='number']", number);
		webtest.type("xpath=//input[@name='title']", title);
		webtest.typeAndClear("xpath=//input[@name='startdate']", startdate);
		webtest.typeAndClear("xpath=//input[@name='enddate']", enddate);
		webtest.click("class=ke-iframe");
		webtest.type("class=ke-iframe", description);
		webtest.click("xpath=//input[@value='保存信息']");
	}
	//编辑任务时间
	public void bianjirenwu(String enddate) {
		webtest.click("xpath=//button[@action='new_work']");
		webtest.typeAndClear("xpath=//input[@name='enddate']", enddate);
		webtest.click("xpath=//input[@value='保存信息']");
	}
	//登录用户组账号
	public void zhixingren(String username,String password) throws IOException {
		webtest.click("link=[退出]");
		login(username, password);
	}
	//执行人任务列表
	public void renwuliebiao1() throws IOException {
		webtest.enterFrame("rightMain");
		webtest.click("link=任务1");
		webtest.leaveFrame();
		webtest.click("link=返回列表页");
	}
	public void renwuliebiao2() throws IOException {
		webtest.enterFrame("rightMain");
		webtest.click("link=任务2");
		webtest.leaveFrame();
		webtest.click("link=返回列表页");
	}
	public void renwuliebiao3() throws IOException {
		webtest.enterFrame("rightMain");
		webtest.click("link=任务3");
		webtest.leaveFrame();
		webtest.click("link=返回列表页");
	}
	public void renwuliebiao4() throws IOException {
		webtest.enterFrame("rightMain");
		webtest.click("link=任务4");
		webtest.leaveFrame();
		webtest.click("link=返回列表页");
	}
	//点击已完成
	public void fanhuiliebiao() {
		webtest.click("link=返回列表页");
	}
	//进度录入
	public void jinduluru() throws IOException {
		webtest.click("link=进度录入");
	}
	//录入进度
	public void lurujindu(String progress,String miaoshu) throws IOException {
		webtest.click("xpath=//input[@value='录入进度']");
		webtest.type("xpath=//input[@name='progress']", progress);
		webtest.click("class=ke-iframe");
		webtest.type("class=ke-iframe", miaoshu);
		webtest.click("xpath=//input[@value='保存信息']");
	}
	//查看已完成列表
	public void yiwanchengrenwu() throws IOException {
		
		webtest.click("link=已完成任务");//网页中已完成的已错误
		
	}
	//查询任务
	public void chaxunrenwu(String number,String title,String vstartdate,String venddate) {
		webtest.type("xpath=//input[@name='number']",number);
		webtest.type("xpath=//input[@name='title']",title);
		webtest.type("xpath=//input[@name='vstartdate']",vstartdate);
		webtest.type("xpath=//input[@name='venddate']",venddate);
		webtest.click("id=do_search");
	}
	//3.个人计划
	public void jihua() {
		perOffice();
		webtest.click("link=工作计划");
	}
	//查看已完成
	public void jihuazhuangtai() {
		webtest.click("link=已完成的计划");//网页中已完成的已错误
	}
	//修改状态
	public void xiugaizhuangtai() {
		webtest.click("link=完成");
		webtest.pause(5000);
	}
	//评论
	public void jihuapinglun(String pinglun) throws IOException {
		webtest.click("link=查看");
		webtest.click("class=ke-iframe");
		webtest.type("class=ke-iframe",pinglun );
		webtest.click("xpath=//input[@value='发起评论']");
	}
	//4.会议管理
	public void huiyi() {
		perOffice();
		webtest.click("link=会议管理");
	}
	//会议申请
	public void huiyishenqing(String startdate,String enddate,String value1,String value2,String value3,String value4,String title,String value5,String miaoshu) {
		webtest.click("xpath=//button[@action='new_work']");
		webtest.typeAndClear("xpath=//input[@name='startdate']",startdate);
		
		webtest.selectByValue("xpath=//select[@name='starttime1']", value1);
		webtest.selectByValue("xpath=//select[@name='starttime2']", value2);
		webtest.typeAndClear("xpath=//input[@name='enddate']",enddate);
		webtest.selectByValue("xpath=//select[@name='endtime1']", value3);
		webtest.selectByValue("xpath=//select[@name='endtime2']", value4);
		
		webtest.click("link=+选择申请人");
		webtest.getWindow(1);
		System.out.println(webtest.getText("xpath=//span[@class='big3']"));
		webtest.click("xpath=//tbody/tr[2]/td[1]/input[4]");
		webtest.click("xpath=//input[@value='确认选择']");
		webtest.getWindow(0);
		
		webtest.click("link=+选择记录员");
		webtest.getWindow(1);
		System.out.println(webtest.getText("xpath=//span[@class='big3']"));
		webtest.click("xpath=//tbody/tr[2]/td[3]/input[4]");
		webtest.click("xpath=//input[@value='确认选择']");
		webtest.getWindow(0);
		
		webtest.click("link=+选择出席人");
		webtest.getWindow(1);
		webtest.click("xpath=//div[@title='管理层']/img");
		webtest.click("xpath=//div[@title='人力资源部']/img");
		webtest.click("xpath=//div[@title='人力资源部']/img[@id='tree_16_cb']");
		webtest.click("xpath=//input[@value='确 定']");
		webtest.getWindow(0);

		webtest.click("link=+选择审批人");
		webtest.getWindow(1);
		System.out.println(webtest.getText("xpath=//span[@class='big3']"));
		webtest.click("xpath=//tbody/tr[2]/td[1]/input[4]");
		webtest.click("xpath=//input[@value='确认选择']");
		webtest.getWindow(0);
		
		webtest.type("xpath=//input[@name='title']",title );
		webtest.selectByValue("xpath=//select[@id='conferenceroom']", value5);
		webtest.click("class=ke-iframe");
		webtest.type("class=ke-iframe", miaoshu);
		webtest.click("xpath=//input[@value='保存']");
		
	}
	//审批
	public void shenpi() {
		webtest.click("link=审批");
	}
	//拒绝
	public void jujue() {
		webtest.click("link=拒绝");
	}
	//5.手机短信
	public void messages() {
		perOffice();
		webtest.click("link=手机短信");
	}
	//发送短信
	public void send(String content) {
		webtest.click("xpath=//button[@action='new_work']");
		//选择接收人
		webtest.click("link=+选 择");
		webtest.getWindow(1);
		System.out.println(webtest.getText("xpath=//span[@class='big3']"));
		webtest.click("xpath=//div[@title='管理层']/img");
		webtest.click("xpath=//div[@title='人力资源部']/img");
		webtest.click("xpath=//div[@title='人力资源部']/img[@id='tree_16_cb']");
		webtest.click("xpath=//input[@value='确 定']");
		webtest.getWindow(0);
		webtest.type("xpath=//textarea[@name='content']",content);
		webtest.click("xpath=//input[@value='发送短信']");
	}
	//6.通讯录
	public void contacts() {
		perOffice();
		webtest.click("link=通迅录");
	}
	//新增通讯录
	public void addContacts(String company,String person,String tel,String phone) {
		webtest.click("xpath=//button[@action='new_work']");
		webtest.type("xpath=//input[@name='company']",company );
		webtest.type("xpath=//input[@name='person']",person );
		webtest.type("xpath=//input[@name='tel']",tel );
		webtest.type("xpath=//input[@name='phone']",phone );
		webtest.click("xpath=//input[@value='女']");
		webtest.click("xpath=//input[@value='保存信息']");
	}
	//选择联系人发送短信
	public void sendMessages() {
		webtest.click("name=chkall");
		webtest.click("xpath=//button[@action='cancel_concern']");
	}
	//选择联系人发送短信
	public void sendMessage1(String content) {
		webtest.click("xpath=//button[@action='cancel_concern']");
		//选择接收人
		webtest.click("link=+选 择");
		webtest.getWindow(1);
		System.out.println(webtest.getText("xpath=//span[@class='big3']"));
		webtest.click("xpath=//div[@title='管理层']/img");
		webtest.click("xpath=//div[@title='人力资源部']/img");
		webtest.click("xpath=//div[@title='人力资源部']/img[@id='tree_16_cb']");
		webtest.click("xpath=//input[@value='确 定']");
		webtest.getWindow(0);
		webtest.type("xpath=//textarea[@name='content']",content);
		webtest.click("xpath=//input[@value='发送短信']");
	}
	//7.清理数据
	public void clear() {
		webtest.click("xpath=//button[@action='cancel_concern']");
	}
	public void enter_ifream() {
		webtest.enterFrame("rightMain");
	}
	public void leave_ifream() {
		webtest.leaveFrame();
	}
	
	
	
}
