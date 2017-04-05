package com.westear.ssm.util.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class ReadPropertiesUtil {

	public Map<String, String> getProperties(String filePath, String fileName) throws IOException{
		Map<String, String> map = new HashMap<String, String>();	
		Properties prop = new Properties();
		InputStream in = new FileInputStream(filePath + fileName);
		prop.load(in);
		Iterator<String> it = prop.stringPropertyNames().iterator();
		while(it.hasNext()){
			String key = it.next();
			map.put(key, prop.getProperty(key));
		}
		return map;
	}
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws IOException{
		System.out.println(ReadPropertiesUtil.class.getResource("/"));
		System.out.println(System.getProperty("user.dir"));
//		InputStream in = new FileInputStream("E:\\MavenWorkspace\\ssm-pro\\src\\main\\resources\\configs\\jdbc\\jdbc.properties");
//		String path = ReadPropertiesUtil.class.getClassLoader().getResource("/configs/jdbc/jdbc.properties").getPath();
//		InputStream in = new FileInputStream(path);
		InputStream in = new FileInputStream("E:/MavenWorkspace/ssm-pro/target/classes/configs/jdbc/jdbc.properties");
		Properties prop = new Properties();
		prop.load(in);
		Enumeration enums = prop.propertyNames();
		while(enums.hasMoreElements()){
			String key = (String)enums.nextElement();
			String value = prop.getProperty(key);
			System.out.println(key + " : " + value);
		}
		
		ReadPropertiesUtil propertiesUtil = new ReadPropertiesUtil();
		String filePath = "E:/MavenWorkspace/ssm-pro/target/classes/configs/jdbc/";
		String fileName = "jdbc.properties";
		HashMap<String, String> map = (HashMap<String, String>) propertiesUtil.getProperties(filePath, fileName);
		System.out.println(map);
	}
}
