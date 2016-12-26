package com.westear.ssm.dao.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.westear.ssm.dao.AppointmentMapper;
import com.westear.ssm.dao.BookMapper;
import com.westear.ssm.model.Appointment;
import com.westear.ssm.model.AppointmentExample;
import com.westear.ssm.model.Book;
import com.westear.ssm.test.DemoTest;
import com.westear.ssm.util.pageUtil.Page;
import com.westear.ssm.vo.BookAppointVO;

public class DemoDaoTest extends DemoTest{

	@Autowired
	private BookMapper bookMapper;
	
	@Autowired
	private AppointmentMapper appointmentMapper;
	
	@Test
	public void addBook() throws Exception{
		String bookName = "设计模式解析（第2版）";
		Long bookNum = new Long(300000);
		Book book = new Book();
		book.setName(bookName);
		book.setNum(bookNum);
		bookMapper.insert(book);
	}
	
	@Test
	public void selectAppoint(){
		int pageNo = 1;
		int pageSize = 10;
		Page<Appointment> page = new Page<Appointment>(pageNo, pageSize);
		AppointmentExample example = new AppointmentExample();
		List<Appointment> appointmentList = appointmentMapper.selectAppointmentByPage(page, example);
		if(appointmentList != null && appointmentList.size() > 0){
			for(Appointment appointment : appointmentList){
				System.out.println(appointment.getStudentId()+" : "+appointment.getBookId());
			}
		}
	}
	
	@Test
	public void selectBookAppoint(){
		int pageNo = 1;
		int pageSize = 10;
		Page<BookAppointVO> page = new Page<BookAppointVO>(pageNo, pageSize);
		List<BookAppointVO> list = appointmentMapper.selectBookAndAppointment(page);
		for(BookAppointVO ba : list){
			System.out.println(ba.toString());
		}
	}
}
