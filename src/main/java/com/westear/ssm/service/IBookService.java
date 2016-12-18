package com.westear.ssm.service;

import com.westear.ssm.dto.AppointExecution;
import com.westear.ssm.model.Book;

public interface IBookService {
	
	void addBook(Book book);
	
	public AppointExecution appoint(String bookId, String studentId);
}
