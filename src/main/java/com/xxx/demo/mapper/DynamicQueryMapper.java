package com.xxx.demo.mapper;

import com.xxx.demo.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DynamicQueryMapper {
    List<Employee> queryConditions(Employee employee);
}
