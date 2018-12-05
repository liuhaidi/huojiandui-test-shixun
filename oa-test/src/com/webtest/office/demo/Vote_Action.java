package com.webtest.demo;
import java.io.IOException;
import com.webtest.core.WebDriverEngine;
import com.webtest.utils.ReadProperties;
public class Vote_Action {
	private WebDriverEngine webtest;
	  public Vote_Action(WebDriverEngine webtest) {
		  this.webtest=webtest;
	  }
	  public void login(String email,String password) throws IOException 
	  {
		  	webtest.open(ReadProperties.getPropertyValue("base_url"));
			webtest.type("id=vipname", email);
			webtest.type("id=vippassword", password);
			webtest.click("link=��¼");
	  }
	  public void title(String title,String content,String option) {
		  	webtest.click("id=_M10");
		  	webtest.click("link=ͶƱ");
		  	webtest.enterFrame("rightMain");
		  	webtest.click("xpath=//button[@action='new_work']");
		  	webtest.type("name=title", title);
		  	webtest.type("name=content", content);
		  	webtest.click("link=+ѡ��ͶƱ��Ա");
		  	webtest.type("name=option", option);
		  	webtest.click("xpath=//input[@value='����']");
		  	webtest.leaveFrame();
	  }
	  public void content(String title,String content,String option) {
		  	webtest.click("id=_M10");
		  	webtest.click("link=ͶƱ");
		  	webtest.enterFrame("rightMain");
		  	webtest.click("xpath=//button[@action='new_work']");
		  	webtest.type("name=title", title);
		  	webtest.type("name=content", content);
		  	webtest.click("link=+ѡ��ͶƱ��Ա");
		  	webtest.type("name=option", option);
		  	webtest.click("xpath=//input[@value='����']");
	  }
	  public void option1(String title,String content,String option1) {
		  	webtest.click("id=_M10");
		  	webtest.click("link=ͶƱ");
		  	webtest.enterFrame("rightMain");
		  	webtest.click("xpath=//button[@action='new_work']");
		  	webtest.type("name=title", title);
		  	webtest.type("name=content", content);
		  	webtest.click("link=+ѡ��ͶƱ��Ա");
		  	webtest.type("name=option", option1);
		  	webtest.click("xpath=//input[@value='����']");
	  }
	  public void option2(String title,String content,String option1,String option2) {
		  	webtest.click("id=_M10");
		  	webtest.click("link=ͶƱ");
		  	webtest.enterFrame("rightMain");
		  	webtest.click("xpath=//button[@action='new_work']");
		  	webtest.type("name=title", title);
		  	webtest.type("name=content", content);
		  	webtest.click("link=+ѡ��ͶƱ��Ա");
		  	webtest.type("name=option", option1);
		  	webtest.click("link=+���Ӹ���ѡ��");
		  	webtest.type("name=new_option[]", option2);
		  	webtest.click("xpath=//input[@value='����']");
	  }
}
