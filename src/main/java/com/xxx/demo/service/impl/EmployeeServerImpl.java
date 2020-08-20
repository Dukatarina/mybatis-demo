package com.xxx.demo.service.impl;

import com.xxx.demo.mapper.EmployeeMapper;
import com.xxx.demo.pojo.Employee;
import com.xxx.demo.service.EmployeeServer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServerImpl implements EmployeeServer {
    private final EmployeeMapper employeeMapper;

    public EmployeeServerImpl(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }



    @Override
    public List<Employee> selectList() {
        return employeeMapper.selectList();
    }

    @Override
    public Boolean update(Employee employee) {
        return employeeMapper.UpdateEmployee(employee);
    }

    @Override
    public Integer insertOne(Employee employee) {
        Integer i=employeeMapper.insertEmployee(employee);
        return i;
    }

    @Override
    public Boolean deleteOne(String id) {
        return employeeMapper.deleteEmployee(id);
    }

}
