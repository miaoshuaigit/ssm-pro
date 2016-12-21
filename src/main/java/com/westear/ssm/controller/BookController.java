package com.westear.ssm.controller;

import java.util.List;

import javax.xml.ws.RespectBinding;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.westear.ssm.dto.AppointExecution;
import com.westear.ssm.dto.Result;
import com.westear.ssm.model.Book;
import com.westear.ssm.service.IBookService;

@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
	private IBookService bookService;

	@RequestMapping("/addBook")
	public String addBook(@RequestParam("name") String bookName,
			@RequestParam("num") long bookNum) {
		bookName = "Sping 实战（第4版）";
		Book book = new Book();
		book.setName(bookName);
		book.setNum(bookNum);
		bookService.addBook(book);
		return "demo";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String bookList(Model model) {
		List<Book> bookList = bookService.queryBookList();
		model.addAttribute("list", bookList);
		return "demo/bookList";
	}

	// ajax json
	@ResponseBody
	@RequestMapping(value = "/appoint", method = RequestMethod.POST)
	public String appoint(@RequestParam("bookId") String bookId, @RequestParam("studentId") String studentId, Model model) {
		if (studentId == null || studentId.equals("")) {
			return "error";
		}
		AppointExecution execution = bookService.appoint(bookId, studentId);
		return execution.getStateInfo();
	}
	
	@RequestMapping("/queryBookByName")
	public String queryBookByName(@RequestParam("name") String bookName, Model model){
		List<Book> bookList = bookService.queryBookByName(bookName);
		model.addAttribute("list", bookList);
		return "demo/bookList";
	}
}
