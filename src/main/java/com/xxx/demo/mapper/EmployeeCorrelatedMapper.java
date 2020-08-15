package com.xxx.demo.mapper;

import com.xxx.demo.pojo.po.EmployeeWithDept;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface EmployeeCorrelatedMapper {
    EmployeeWithDept selectOne(String id);

    @MapKey("id")
    Map<String, Object> selectMap();

    EmployeeWithDept selectOneStep(String id);
}
