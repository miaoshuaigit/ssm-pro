package com.westear.ssm.activiti;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;

import com.westear.ssm.util.common.ReadPropertiesUtil;

public class CreateOracleDatabaseTest {

	public static void main(String args[]) throws IOException{
		//创建流程引擎配置信息对象
		ProcessEngineConfiguration pec = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration();
		//设置数据库的类型
		pec.setDatabaseType("oracle");
		//设置创建数据库的方式
		// ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE(true): 如果没有数据库表就会创建数据库表，有的话就修改表结构. 
		// ProcessEngineConfiguration.DB_SCHEMA_UPDATE_FALSE(false): 不会创建数据库表
		// ProcessEngineConfiguration.DB_SCHEMA_UPDATE_CREATE_DROP(create-drop): 先创建、再删除.
		pec.setDatabaseSchemaUpdate("true");
		
		//读取properties文件
		
		//设置数据库的驱动
//		pec.setJdbcDriver(jdbcProp.get("c3p0.driver"));
//		//设置jdbcURL
//		pec.setJdbcUrl(jdbcProp.get("c3p0.url"));
//		//设置用户名
//		pec.setJdbcUsername(jdbcProp.get("c3p0.username"));
//		//设置密码
//		pec.setJdbcPassword(jdbcProp.get("c3p0.password"));
		//构建流程引擎对象
		ProcessEngine pe = pec.buildProcessEngine(); //调用方法才会创建数据表
		//调用close方法时，才会删除
		pe.close();
	}
}
