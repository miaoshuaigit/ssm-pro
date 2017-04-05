package com.westear.ssm.util.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class PropertiesUtil {
	
	public static Map<String,String> getPropertiesMap(String filePath, String fileName) throws IOException{
		Map<String,String> propMap = new HashMap<String,String>();
		Properties prop = new Properties();
		InputStream in = PropertiesUtil.class.getClassLoader().getResourceAsStream(filePath+fileName);
		prop.load(in);
		Iterator<String> it = prop.stringPropertyNames().iterator();
		while(it.hasNext()){
			String key = it.next();
			propMap.put(key, prop.getProperty(key));
		}
		return propMap;
	}
	
	public static void main(String[] args) throws IOException{
		Properties prop = new Properties();
		InputStream in = PropertiesUtil.class.getClassLoader().getResourceAsStream("configs/jdbc/jdbc.properties");
		prop.load(in);
		Map<String,String> map = new HashMap<String,String>();
		Iterator<String> it = prop.stringPropertyNames().iterator();
		while(it.hasNext()){
			String key = it.next();
			map.put(key, prop.getProperty(key));
			System.out.println(key + " : " + prop.getProperty(key));
		}
		System.out.println("=================================================================");
		System.out.println(PropertiesUtil.getPropertiesMap("configs/jdbc/", "jdbc.properties"));
	}
}
