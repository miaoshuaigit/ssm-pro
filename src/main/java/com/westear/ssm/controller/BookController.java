package com.westear.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.westear.ssm.model.Book;
import com.westear.ssm.service.IBookService;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private IBookService bookService;
	
	@RequestMapping("/addBook")
	public String addBook(@RequestParam("name") String bookName,@RequestParam("num") long bookNum){
		bookName = "Sping 实战（第4版）";
		Book book = new Book();
		book.setName(bookName);
		book.setNum(bookNum);
		bookService.addBook(book);
		return "demo";
	}
}
