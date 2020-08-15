package com.xxx.demo.service;

import com.xxx.demo.pojo.po.EmployeeWithDept;

import java.util.Map;

public interface EmployeeCorrelatedService {
    EmployeeWithDept selectOne(String id);

    Map<String,Object> selectMap();

    EmployeeWithDept selectOneStep(String id);
}
