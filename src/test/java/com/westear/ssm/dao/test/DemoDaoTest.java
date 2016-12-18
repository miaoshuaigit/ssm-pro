package com.westear.ssm.dao.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.westear.ssm.dao.BookMapper;
import com.westear.ssm.model.Book;
import com.westear.ssm.test.DemoTest;

public class DemoDaoTest extends DemoTest{

	@Autowired
	private BookMapper bookMapper;
	
	@Test
	public void addBook() throws Exception{
		String bookName = "设计模式解析（第2版）";
		Long bookNum = new Long(300000);
		Book book = new Book();
		book.setName(bookName);
		book.setNum(bookNum);
		bookMapper.insert(book);
	}
}
