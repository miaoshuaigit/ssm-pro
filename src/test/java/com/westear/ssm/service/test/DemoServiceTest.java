package com.westear.ssm.service.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.westear.ssm.dto.AppointExecution;
import com.westear.ssm.service.IBookService;
import com.westear.ssm.test.DemoTest;

public class DemoServiceTest extends DemoTest{

	@Autowired
	private IBookService bookService;
	
	@Test
	public void appointBook() throws Exception{
		String bookId = "87BE57662F954A6B894FDC07F8753150";
		String studentId = "JSJ20121205140020";
		AppointExecution execution = bookService.appoint(bookId, studentId);
		System.out.println(execution);
	}
}
