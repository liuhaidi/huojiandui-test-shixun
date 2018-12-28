package com.webtest.office.demo;
import java.io.IOException;

import com.webtest.core.WebDriverEngine;
import com.webtest.utils.ReadProperties;
public class Search_Action {
		private WebDriverEngine webtest;
		  public  Search_Action (WebDriverEngine webtest) {
			  this.webtest=webtest;
		  }
		  public void login(String email,String password) throws IOException 
		  {
			  	webtest.open(ReadProperties.getPropertyValue("base_url"));
				webtest.type("id=vipname", email);
				webtest.type("id=vippassword", password);
				webtest.click("link=��¼");
		  }
		  public void search1(String title) {
			  	webtest.click("id=_M10");
			  	webtest.click("link=ͶƱ");
			  	webtest.enterFrame("rightMain");
			  	webtest.type("xpath=//input[@name='title']", title);
			  	webtest.click("link=�����е�ͶƱ");
			  	webtest.click("xpath=//button[@id='do_search']");
			  	webtest.leaveFrame();
		  }
}