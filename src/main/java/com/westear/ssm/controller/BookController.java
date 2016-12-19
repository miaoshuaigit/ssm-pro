package com.westear.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String bookList(Model model){
		List<Book> bookList = bookService.queryBookList();
		model.addAttribute("list", bookList);
		return "demo/bookList";
	}
}
