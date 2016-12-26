package com.westear.ssm.util.pageUtil;
/**
 * Oracle数据库方言
 * @author westear
 *
 */
public class MyOracleDialect extends Dialect {

	@Override
	public String getLimitString(String sql, int offset, int limit) {
		return MyOraclePageHelper.getLimitString(sql, offset, limit);
	}

	@Override
	public String getCountString(String sql) {
		return MyOraclePageHelper.getCountString(sql);
	}

}
