package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.WebTestListener;


@Listeners(WebTestListener.class)
public class Front_Login_Test extends BaseTest {

	Login_Action action;
	@BeforeMethod
	public void setup() {
		action=new Login_Action(webtest);
		webtest.open("http://localhost:8032/tscoa/login.php");
		action.login("admin", "123456");
		
	}

	
//	@Test
//	public void Time_Test() {
//	    action.Time();
//}
//	@Test
//	public void ZhouQi_Test() {
//		action=new Login_Action(webtest);
//	    action.ZhouQi("2018-12-01","2018-12-05");
//}
//	@Test
//	public void ZhouQi_Test() {
//		action.ZhouQi();
//	}
//	@Test
//	public void ShanChuOne_Test() {
//		action.ShanChuOne();
//		assertTrue(webtest.ifContains("考勤信息清理成功！"));
//	}
//	@Test
//	public void ShanChuMore_Test() {
//		action.ShanChuMore();
//		assertTrue(webtest.ifContains("考勤信息清理成功！"));
//	}
//	@Test
//	public void DaoChu_Test() {
//		action.DaoChu();
//		assertTrue(webtest.ifContains("考勤信息下载成功！"));
//	}
//	@Test
//	public void BianHaoChaXun_Test() {
//		action.BianHaoChaXun("20181127085529");
//		
//	}
//	@Test
//	public void LeiXingChaXun_Test() {
//		action.LeiXingChaXun("其它");
//		
//	}
//	@Test
//	public void FaBu_Test() {
//		action.FaBu("2018-11-21", "2018-11-30", "5", "2018-12-01", "1", "2018-12-30");
//		assertTrue(webtest.ifContains("单位员工不能为空"));
//	}
	@Test
	public void HengChaiDan_Test() {
		action.HengChaiDan();
		
	}
	@Test
	public void QuanXuanShanChu_Test() {
		action.QuanXuanShanChu();
		assertTrue(webtest.ifContains("培训信息清理成功！"));
	}
	@Test
	public void CanYu_Test() {
		action.CanYu("内部培训");
		
	}
	@Test
	public void JiLu_Test() {
		action.JiLu("内部培训");
		
	}
	
	@Test
	public void FaBuJiangCheng_Test() {
		action.FaBuJiangCheng("2018-11-01", "惩罚", "1", "迟到","2018", "12");
		assertTrue(webtest.ifContains("单位员工不能为空"));
		
	}
	@Test
	public void CaiDanTongBu_Test() {
		action.CaiDanTongBu();
		assertTrue(webtest.ifContains("横纵同步"));
		
	}
	@Test
	public void XinJianHeTong_Test() {
		action.XinJianHeTong("保密合同");
		assertTrue(webtest.ifContains("已存在该合同类型"));
		
	}
	@Test
	public void XueLiShanChu() {
		action.XueLiShanChu();
		assertTrue(webtest.ifContains("成功删除"));
		
	}
	
}


