package com.xxx.demo.service;

import com.xxx.demo.pojo.Employee;

import java.util.List;

public interface EmployeeServer {
    Employee selectOne(String id);

    List<Employee> selectList();

    Boolean update(Employee employee);

    Integer insertOne(Employee employee);

    Boolean deleteOne(String id);
}
