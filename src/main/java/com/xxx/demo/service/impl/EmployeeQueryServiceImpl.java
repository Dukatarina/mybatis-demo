package com.xxx.demo.service.impl;

import com.xxx.demo.mapper.EmployeeQueryMapper;
import com.xxx.demo.pojo.Employee;
import com.xxx.demo.service.EmployeeQueryService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeQueryServiceImpl implements EmployeeQueryService {
    private final EmployeeQueryMapper employeeQueryMapper;

    public EmployeeQueryServiceImpl(EmployeeQueryMapper employeeQueryMapper) {
        this.employeeQueryMapper = employeeQueryMapper;
    }

    @Override
    public Employee selectOne(String id) {
        return employeeQueryMapper.selectOne(id);
    }

    @Override
    public Employee selectOne(String name, String nickname) {
        return employeeQueryMapper.selectWithParam(name,nickname);
    }

    @Override
    public Employee selectOne2(String name, String nickname) {
        return employeeQueryMapper.selectWithParam2(name,nickname);
    }

    @Override
    public Employee selectWithEntity(String name, String nickname) {
        Employee employee = new Employee();
        employee.setName(name);
        employee.setNickName(nickname);
        return employeeQueryMapper.selectWithEntity(employee);
    }

    @Override
    public Employee selectWithMap(String name, String nickname) {
        Map<String,String> map=new HashMap<>();
        map.put("name",name);
        map.put("nickName",nickname);
        return employeeQueryMapper.selectWithMap(map);
    }

    @Override
    public List<Employee> employeesByNameLike(String nickname) {
        return employeeQueryMapper.employeesByNameLike("%"+nickname+"%");
    }
    @Override
    public Map<String, Object> selectOneReturnColumn(String id) {
        return employeeQueryMapper.selectOneReturnColumn(id);
    }

    @Override
    public Map<String, Object> selectMoreReturnColumn(String nickName) {
        return employeeQueryMapper.selectMoreReturnColumn("%"+nickName+"%");
    }
}
