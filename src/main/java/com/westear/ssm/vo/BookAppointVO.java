package com.westear.ssm.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.westear.ssm.model.Appointment;
import com.westear.ssm.model.AppointmentKey;

public class BookAppointVO {
	
	private String bookId;

    private String name;

    private Long num;
    
    private Appointment appointment;
    
    private AppointmentKey appointmentKey;

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	public AppointmentKey getAppointmentKey() {
		return appointmentKey;
	}

	public void setAppointmentKey(AppointmentKey appointmentKey) {
		this.appointmentKey = appointmentKey;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return "BookAppointVO [bookId=" + bookId + ", name=" + name + ", num="
				+ num + ", appointment=" + appointment + ", appointmentKey="
				+ appointmentKey + ", appointTime " + sdf.format(appointment.getAppointTime()) + "]";
	}
    
}
