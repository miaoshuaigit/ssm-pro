package com.westear.ssm.service;

import java.util.List;

import com.westear.ssm.dto.AppointExecution;
import com.westear.ssm.model.Book;

public interface IBookService {
	
	void addBook(Book book);
	
	public AppointExecution appoint(String bookId, String studentId);
	
	public List<Book> queryBookList();
	
	public List<Book> queryBookByName(String name);
}
