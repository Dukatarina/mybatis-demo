package com.xxx.demo.mapper;

import com.xxx.demo.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface EmployeeQueryMapper {
    Employee selectOne(String id);

    Employee selectWithParam(String name, String nickName);

    Employee selectWithParam2(@Param("name") String name, @Param("nickName") String nickName);

    Employee selectWithEntity(Employee employee);

    Employee selectWithMap(Map<String, String> map);

    List<Employee> employeesByNameLike(String nickName);

}
