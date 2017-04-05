package com.westear.ssm.util.cache;

import java.sql.Connection;
import java.util.Properties;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;

/**
 * 拦截的目标类型是StatementHandler,拦截的方法是名称为prepare参数为Connection类型的方法
 * @author westear
 * @Signature:要拦截的目标类,type只能配置成接口类型
 */
@Intercepts({@Signature(type=StatementHandler.class,method="prepare",args={Connection.class})})
public class DemoInterceptor implements Interceptor {

	@Override
	public Object intercept(Invocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object plugin(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setProperties(Properties arg0) {
		// TODO Auto-generated method stub

	}

}
