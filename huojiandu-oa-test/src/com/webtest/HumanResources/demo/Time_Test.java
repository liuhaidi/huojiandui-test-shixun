package com.webtest.HumanResources.demo;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Time_Test extends BaseTest {

       Login_Action action = null;

		@Test
		public void Time_Test1() throws InterruptedException, IOException {
			action=new Login_Action(webtest);
			action.login("admin", "123456");
		    action.Time();


}
}