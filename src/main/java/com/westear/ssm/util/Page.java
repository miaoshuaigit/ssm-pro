package com.westear.ssm.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

/**
 * 分页工具类
 * @author westear
 * @param <T> 泛型：分页数据Bean
 * oracle分页sql：
	select * from (
	       select A.* ,ROWNUM RN 
	       from (select * from TABLE_NAME) A
	       where ROWNUM <= dataEndNum
	)
	where RN >=dataStartNum;
 * 
 * mysql分页sql:
 	select * from TABLE_NAME limit dataStartNum,dataEndNum;
 */
public class Page<T> extends RowBounds{

	/**
	 * 成员变量
	 */
	protected int pageNo;	//页码
	protected int pageSize;	//页大小，每页数据量
	protected int totalPage; //总页数
	protected int totalCount; //数据总数
	protected int offset;	//数据偏移量(dataStartNum)
	protected int limit;	//页数据限制(dataEndNum)
	
	protected List<T> result = new ArrayList<T>();	//查询结果
	
	/**
	 * 计算偏移量
	 */
	private void calcOffset(){
		this.offset = ((pageNo - 1) * pageSize);
	}
	/**
	 * 获取限定数
	 */
	private void calcLimit(){
		this.limit = pageSize;
	}
	
	/**
	 * 构造器
	 */
	public Page(){
		this.calcOffset();
		this.calcLimit();
	}
	
	public Page(int pageNo, int pageSize){
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.calcOffset();
		this.calcLimit();
	}
	
	/**
	 *getter,setter方法
	 */
	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;	//默认为1
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	//获得总页数
	public int getTotalPage() {
		if (totalCount < 0) {
            return -1;
        }
        int pages = totalCount / pageSize;
        return totalCount % pageSize > 0 ? ++pages : pages;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	//获得数据总数
	public int getTotalCount() {
		return getTotalPage() * getPageSize();
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public List<T> getResult() {
		return result;
	}

	public void setResult(List<T> result) {
		this.result = result;
	}
	
	/**
     * 根据pageNo和pageSize计算当前页第一条记录在总结果集中的位置,序号从1开始.
     */
    public int getStart() {
        return ((pageNo - 1) * pageSize) + 1;
    }
    
}
