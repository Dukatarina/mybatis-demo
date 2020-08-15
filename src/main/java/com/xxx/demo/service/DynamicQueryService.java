package com.xxx.demo.service;

import com.xxx.demo.pojo.Employee;

import java.util.List;

public interface DynamicQueryService {
   List<Employee> queryConditions(Employee employee);
}
