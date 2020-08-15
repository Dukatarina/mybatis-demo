package com.xxx.demo.service;

import com.xxx.demo.pojo.Employee;

import java.util.List;

public interface DynamicQueryService {
    List<Employee> queryConditions(Employee employee);

    List<Employee> queryConditionsTrim(Employee employee);

    List<Employee> queryConditionsChoose(Employee employee);

    List<Employee> queryConditionsForeach(List<String> ids);

    Long insertEmployeeBatch(List<Employee> employees);
}
