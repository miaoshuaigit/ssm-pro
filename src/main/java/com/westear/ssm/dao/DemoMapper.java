package com.westear.ssm.dao;

import com.westear.ssm.model.Demo;
import com.westear.ssm.model.DemoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DemoMapper {
    int countByExample(DemoExample example);

    int deleteByExample(DemoExample example);

    int insert(Demo record);

    int insertSelective(Demo record);

    List<Demo> selectByExample(DemoExample example);

    int updateByExampleSelective(@Param("record") Demo record, @Param("example") DemoExample example);

    int updateByExample(@Param("record") Demo record, @Param("example") DemoExample example);
}