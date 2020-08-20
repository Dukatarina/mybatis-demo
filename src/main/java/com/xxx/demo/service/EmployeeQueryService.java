package com.xxx.demo.service;

import com.xxx.demo.pojo.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeQueryService {
    Employee selectOne(String id);

    Employee selectOne(String name, String nickname);

    Employee selectOne2(String name, String nickname);

    Employee selectWithEntity(String name, String nickname);

    Employee selectWithMap(String name, String nickname);

    List<Employee> employeesByNameLike(String nickname);

    Map<String, Object> selectOneReturnColumn(String id);

    Map<String, Object> selectMoreReturnColumn(String nickName);
}
