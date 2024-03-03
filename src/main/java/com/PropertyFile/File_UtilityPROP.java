package com.PropertyFile;

import java.io.FileInputStream;
import java.util.Properties;

public class File_UtilityPROP 
{
	FileInputStream fileConfig;
	
	public String getValuefromPropFile(String key) throws Throwable
	{
		Properties prop = new Properties();
		fileConfig = new FileInputStream("./src/main/java/com/PropertyFile/Config.properties");
		prop.load(fileConfig);
		String value = prop.getProperty(key); //url = prop.getproperty("url") = https://PB
		return value;
	}
}
