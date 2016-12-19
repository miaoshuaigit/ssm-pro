package com.westear.ssm.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.westear.ssm.dao.AppointmentMapper;
import com.westear.ssm.dao.BookMapper;
import com.westear.ssm.dto.AppointExecution;
import com.westear.ssm.enums.AppointStateEnum;
import com.westear.ssm.model.Appointment;
import com.westear.ssm.model.AppointmentKey;
import com.westear.ssm.model.Book;
import com.westear.ssm.model.BookExample;
import com.westear.ssm.service.IBookService;

@Service
public class BookServiceImpl implements IBookService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private BookMapper bookMapper;
	
	@Autowired
	private AppointmentMapper appointmentMapper;
	
	@Override
	@Transactional
	public void addBook(Book book) {
		bookMapper.insert(book);
	}
	
	public AppointExecution appoint(String bookId, String studentId) {
		Book book = bookMapper.selectByPrimaryKey(bookId);
        try {
        	// 减库存
        	book.setNum(book.getNum() - 1);
        	int update = bookMapper.updateByPrimaryKey(book);
        	if(update <= 0){	//库存不足
        		return new AppointExecution(bookId, AppointStateEnum.NO_NUMBER);
        	}else{
        		//执行预约操作
        		Appointment appointment = new Appointment();
        		appointment.setBookId(bookId);
        		appointment.setStudentId(studentId);
        		appointment.setAppointTime(new Date());
        		int insert = appointmentMapper.insert(appointment);
        		if(insert <= 0){	//重复预约
        			return new AppointExecution(bookId,AppointStateEnum.REPEAT_APPOINT);
        		}else{	//预约成功
        			AppointmentKey key = new AppointmentKey();
        			key.setBookId(bookId);
        			key.setStudentId(studentId);
        			Appointment result = appointmentMapper.selectByPrimaryKey(key);
        			return new AppointExecution(bookId, AppointStateEnum.SUCCESS, result);
        		}
        	}
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            // 所有编译期异常转换为运行期异常
            return new AppointExecution(bookId, AppointStateEnum.INNER_ERROR);
        }
    }

	@Override
	public List<Book> queryBookList() {
		BookExample example = new BookExample();
		return this.bookMapper.selectByExample(example);
	}
}
