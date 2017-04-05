package com.westear.ssm.util.common;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
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
		//如果资源是位于classpath下的不要以 / 开头
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
		
		URL path = PropertiesUtil.class.getResource("");	//当路径信息不以 / 开头时，获取的是相对于当前类所在路径的相对资源
		URL path1 = PropertiesUtil.class.getResource("/");	//当路径信息以 / 开头时，则获取的是当前应用类加载路径下的资源
		System.out.println(path);
		System.out.println(path1);
	}
}
