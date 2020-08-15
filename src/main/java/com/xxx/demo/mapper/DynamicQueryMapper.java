package com.xxx.demo.mapper;

import com.xxx.demo.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DynamicQueryMapper {
    List<Employee> queryConditions(Employee employee);
    List<Employee> queryConditionsTrim(Employee employee);
    List<Employee> queryConditionsChoose(Employee employee);
    List<Employee> queryConditionsForeach(List<String> ids);
    Long insertEmployeeBatch(List<Employee> employees);
}
