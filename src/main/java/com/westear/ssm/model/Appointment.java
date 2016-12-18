package com.westear.ssm.model;

import java.util.Date;

public class Appointment extends AppointmentKey {
    private Date appointTime;

    private String appointmentId;

    public Date getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(Date appointTime) {
        this.appointTime = appointTime;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId == null ? null : appointmentId.trim();
    }
}