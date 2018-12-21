package com.webtest.HumanResources.demo;

import java.io.IOException;

import com.webtest.core.WebDriverEngine;
import com.webtest.utils.ReadProperties;

public class Login_Action {
	WebDriverEngine webtest=null;
	public Login_Action (WebDriverEngine webtest) {
		this.webtest=webtest;
	}
//登录	
	public void login(String email,String password) throws IOException {
		webtest.open(ReadProperties.getPropertyValue("base_url"));
		webtest.type("name=username", email);
		webtest.type("name=password", password);
		webtest.click("link=登录");
	}
//人力资源
	public void resource() {
		webtest.click("link=人力资源");
	}
//考勤管理
	public void Time() throws InterruptedException {
		resource();
		webtest.click("link=考勤管理");
		Thread.sleep(3000);
		webtest.enterFrame("rightMain");
		webtest.click("link=今天");
		webtest.leaveFrame();
	}
	public void ZhouQi(String value,String value1) {
		resource();
		webtest.click("link=考勤管理");
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@name='vstartdate']");
		webtest.type("xpath=//input[@name='vstartdate']",value);
		webtest.click("xpath=//input[@name='venddate']");
		webtest.type("xpath=//input[@name='venddate']",value1);
		webtest.click("class=SmallButton");
		}
	public void ShanChuOne() throws InterruptedException {
		resource();
		webtest.click("link=考勤管理");
		Thread.sleep(3000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@value='8']");
		webtest.click("link=清理数据");
	}
	public void ShanChuMore() throws InterruptedException {
		resource();
		webtest.click("link=考勤管理");
		Thread.sleep(3000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@value='8']");
		webtest.click("xpath=//input[@value='3']");
		webtest.click("link=清理数据");
	}
	public void DaoChu() throws InterruptedException {
		resource();
		webtest.click("link=考勤管理");
		Thread.sleep(3000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@name='chkall']");
		webtest.click("id=J-download");
		
	}
	
	
	
	
	
	
	
//人事合同
	public void BianHaoChaXun(String value) throws InterruptedException {
		resource();
		webtest.click("link=人事合同");
		Thread.sleep(3000);
		webtest.enterFrame("rightMain");
		webtest.type("xpath=//input[@name='number']",value);	
		webtest.click("id=do_search");
		
	}
	public void LeiXingChaXun(String value) throws InterruptedException {
		resource();
		webtest.click("link=人事合同");
		Thread.sleep(3000);
		webtest.enterFrame("rightMain");
		webtest.selectByVisibleText("name=type", value);
		webtest.click("link=查询");
		
	}
	public void FaBu(String value,String value1,String value2,String value3,String value4,String value5) throws InterruptedException {
		resource();
		webtest.click("link=人事合同");
		Thread.sleep(3000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=/html/body/div[2]/div/div[1]/button[1]");
		webtest.type("name=signdate", value);
		webtest.type("name=testdate", value1);
		webtest.type("name=testday", value2);
		webtest.type("name=testenddate", value3);
		webtest.type("name=signnum", value4);
		webtest.type("name=signenddate", value5);
		webtest.click("class=BigButtonBHover");
		
		
		
		
		
		
	}
//培训管理
	public void HengChaiDan() {
		resource();
		webtest.click("link=培训管理");
		webtest.enterFrame("rightMain");
		webtest.click("link=我负责的培训");
		
	}
	public void QuanXuanShanChu() {
		resource();
		webtest.click("link=培训管理");
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@name='chkall']");
		webtest.click("link=清理数据");
		
	}
	public void CanYu(String value) {
		resource();
		webtest.click("link=培训管理");
		webtest.enterFrame("rightMain");
		webtest.click("link=我参与的培训");
		webtest.selectByValue("xpath=//select[@name='channel']", value);
		webtest.click("link=查询");
		
	}
//奖惩记录
		public void JiLu(String value) {
			resource();
			webtest.click("link=奖惩记录");
			webtest.selectByValue("xpath=//select[@name='channel']", value);
			webtest.click("link=查询");
		}
		
		public void FaBuJiangCheng(String value,String value1,String value2,String value3,String value4) throws InterruptedException {
			resource();
			webtest.click("link=奖惩记录");
			Thread.sleep(3000);
			webtest.enterFrame("rightMain");
			webtest.click("xpath=//button[@action='new_work']");
			webtest.selectByValue("xpath=//select[@name='project']", value);
			webtest.selectByValue("xpath=//select[@name='wagesmonth_year']", value1);
			webtest.selectByValue("xpath=//select[@name='wagesmonth_month']", value2);
			webtest.type("name=rewardsdate", value3);
			webtest.type("name=price", value4);
			webtest.click("xpath=//input[@value='保存']");
		}
//基础类别测试
		public void CaiDanTongBu() throws InterruptedException {
					resource();
					webtest.click("link=招聘渠道");
					Thread.sleep(3000);
	
		}
		public void XinJianHeTong(String value) throws InterruptedException {
			resource();
			webtest.click("link=人事合同类型");
			webtest.enterFrame("rightMain");
			webtest.click("link=+增加新人事合同类型");
			Thread.sleep(3000);
			webtest.type("name=newname[]", value);
			webtest.click("xpath=//input[@value='保存']");
}
		public void XueLiShanChu() throws InterruptedException {
			resource();
			webtest.click("link=学历");
			webtest.enterFrame("rightMain");
			webtest.click("link=删除");
			Thread.sleep(3000);
		
}
		
		
						
	
	

	
}
