package com.edu.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;
import com.edu.pageObjects.PageAction;

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
