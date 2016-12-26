package com.westear.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.westear.ssm.model.Appointment;
import com.westear.ssm.model.AppointmentExample;
import com.westear.ssm.model.AppointmentKey;
import com.westear.ssm.util.pageUtil.Page;
import com.westear.ssm.vo.BookAppointVO;

public interface AppointmentMapper {
    int countByExample(AppointmentExample example);

    int deleteByExample(AppointmentExample example);

    int deleteByPrimaryKey(AppointmentKey key);

    int insert(Appointment record);

    int insertSelective(Appointment record);

    List<Appointment> selectByExample(AppointmentExample example);

    Appointment selectByPrimaryKey(AppointmentKey key);

    int updateByExampleSelective(@Param("record") Appointment record, @Param("example") AppointmentExample example);

    int updateByExample(@Param("record") Appointment record, @Param("example") AppointmentExample example);

    int updateByPrimaryKeySelective(Appointment record);

    int updateByPrimaryKey(Appointment record);
    
    //分页查询
    List<Appointment> selectAppointmentByPage(Page<Appointment> page,AppointmentExample example);
    //图书和预约关联查询
    List<BookAppointVO> selectBookAndAppointment(Page<BookAppointVO> page);
}