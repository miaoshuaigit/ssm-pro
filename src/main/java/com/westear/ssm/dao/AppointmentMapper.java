package com.westear.ssm.dao;

import com.westear.ssm.model.Appointment;
import com.westear.ssm.model.AppointmentExample;
import com.westear.ssm.model.AppointmentKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
}