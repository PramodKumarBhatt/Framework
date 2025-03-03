package com.learnAutomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties prop;

	public ConfigDataProvider() {
		File src = new File("./Config/Config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			System.out.println("Not able to load file: " + e.getMessage());
		}

	}

	public String getBrowserName() {
		return prop.getProperty("Browser");
		//return prop.getProperty("Browser"); 
	}

	public String getURL() {
		return prop.getProperty("QAURL");
	}

	/*
	 * public String getDataFronConfig(String str) { return prop.getProperty(str); }
	 */
}
