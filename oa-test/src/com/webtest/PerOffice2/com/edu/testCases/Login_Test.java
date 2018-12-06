package com.edu.testCases;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import com.edu.pageObjects.PageAction;
import com.edu.core.BaseTest;

public class Login_Test extends BaseTest{
    
    
	@Test(priority=1)
    public void testLogin_success() throws Exception {
	   PageAction login=new PageAction(webtest);
	   login.login("admin","123456");
	   assertTrue(webtest.ifContains("ÍË³ö"));
	}	
	
	@Test(priority=0)  
	public void testLogin_failed() throws IOException  {
		PageAction login=new PageAction(webtest);
		login.login("admin", "123123");
		assertTrue(webtest.ifContains("µÇÂ¼Ê§°Ü"));
	}
	
}
