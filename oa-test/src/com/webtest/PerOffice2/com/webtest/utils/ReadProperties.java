package com.webtest.utils;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadProperties {
public static final String filePath="conf/config.properties";
	

	public static String getPropertyValue(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(filePath);
		prop.load(fis);
		fis.close();
		return prop.getProperty(key);
    }
}
