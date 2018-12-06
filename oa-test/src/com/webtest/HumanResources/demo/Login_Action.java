package com.webtest.demo;
import com.webtest.core.WebDriverEngine;

public class Login_Action {
	private WebDriverEngine webtest;
	public Login_Action(WebDriverEngine webtest) {
		this.webtest=webtest;
	}
//登录	
	public void login(String email,String password) {
		webtest.type("name=username", email);
		webtest.type("name=password", password);
		webtest.click("link=登录");
	}
//人力资源
	public void resource() {
		webtest.click("link=人力资源");
	}
//考勤管理
	public void Time() {
		webtest.click("id=_M11");
		webtest.click("link=考勤管理");
		webtest.pause(3000);
		webtest.enterFrame("rightMain");
		webtest.click("link=今天");
		webtest.leaveFrame();
	}
	public void ZhouQi(String value,String value1) {
		webtest.click("id=_M11");
		webtest.click("link=考勤管理");
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@name='vstartdate']");
		webtest.typeAndClear("xpath=//input[@name='vstartdate']",value);
		webtest.typeAndClear("xpath=//input[@name='venddate']",value1);
		webtest.click("link=查询");
		}
	public void ShanChuOne() {
		webtest.click("id=_M11");
		webtest.click("link=考勤管理");
		webtest.pause(3000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@value='8']");
		webtest.click("link=清理数据");
	}
	public void ShanChuMore() {
		webtest.click("id=_M11");
		webtest.click("link=考勤管理");
		webtest.pause(3000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@value='8']");
		webtest.click("xpath=//input[@value='3']");
		webtest.click("link=清理数据");
	}
	public void DaoChu() {
		webtest.click("id=_M11");
		webtest.click("link=考勤管理");
		webtest.pause(3000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@name='chkall']");
		webtest.click("id=J-download");
	}
	
	
	
	
	
	
	
//人事合同
	public void BianHaoChaXun(String value) {
		resource();
		webtest.click("link=人事合同");
		webtest.pause(3000);
		webtest.enterFrame("rightMain");
		webtest.type("xpath=//input[@name='number']",value);	
		webtest.click("link=查询");
		
	}
	public void LeiXingChaXun(String value) {
		resource();
		webtest.click("link=人事合同");
		webtest.pause(3000);
		webtest.enterFrame("rightMain");
		webtest.selectByVisibleText("name=type", value);
		webtest.click("link=查询");
		
	}
	public void FaBu(String value,String value1,String value2,String value3,String value4,String value5) {
		resource();
		webtest.click("link=人事合同");
		webtest.pause(3000);
		webtest.enterFrame("rightMain");
		webtest.click("link=发布信息");
		webtest.selectByVisibleText("name=signdate", value);
		webtest.selectByVisibleText("name=testdate", value1);
		webtest.selectByVisibleText("name=testday", value2);
		webtest.selectByVisibleText("name=testenddate", value3);
		webtest.selectByVisibleText("name=signnum", value4);
		webtest.selectByVisibleText("name=signenddate", value5);
		
		
		
		
		
		
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
		webtest.typeAndClear("xpath=//input[@name='channel']",value);
		webtest.click("link=查询");
		
	}
//奖惩记录
		public void JiLu(String value) {
			resource();
			webtest.click("link=奖惩记录");
			webtest.selectByVisibleText("name=channel", value);
			webtest.click("link=查询");
		}
		
		public void FaBuJiangCheng(String value,String value1,String value2,String value3,String value4,String value5) {
			resource();
			webtest.click("link=奖惩记录");
			webtest.pause(3000);
			webtest.enterFrame("rightMain");
			webtest.click("link=发布信息");
			webtest.selectByVisibleText("name=rewardsdate", value);
			webtest.selectByVisibleText("name=rewardskey", value1);
			webtest.selectByVisibleText("name=price", value2);
			webtest.selectByVisibleText("name=project", value3);
			webtest.selectByVisibleText("name=wagesmonth_year", value4);
			webtest.selectByVisibleText("name=wagesmonth_month", value5);
			webtest.click("link=保存");
		}
//基础类别测试
		public void CaiDanTongBu() {
					resource();
					webtest.click("link=招聘渠道");
					webtest.pause(3000);
	
		}
		public void XinJianHeTong(String value) {
			resource();
			webtest.click("link=人事合同类型");
			webtest.enterFrame("rightMain");
			webtest.click("link=增加新人事合同类型");
			webtest.pause(3000);
			webtest.selectByVisibleText("name=newname[]", value);
			webtest.click("link=保存");
}
		public void XueLiShanChu() {
			resource();
			webtest.click("link=学历");
			webtest.enterFrame("rightMain");
			webtest.click("link=删除");
			webtest.pause(3000);
		
}
		
		
						
	
	

	
}
