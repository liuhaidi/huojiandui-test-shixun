package com.webtest.PerOffice2.demo;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddReadTime_Test extends BaseTest{
    @Test
    public void testReadTime() throws IOException {
    	PageAction action=new PageAction(webtest);
    	action.login("admin","123456");
    	action.perOffice();
    	action.workLog();
    	action.readworklog();
    }
}
