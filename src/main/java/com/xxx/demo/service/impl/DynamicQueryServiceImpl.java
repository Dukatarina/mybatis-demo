package com.xxx.demo.service.impl;

import com.xxx.demo.mapper.DynamicQueryMapper;
import com.xxx.demo.pojo.Employee;
import com.xxx.demo.service.DynamicQueryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DynamicQueryServiceImpl implements DynamicQueryService {
    private final DynamicQueryMapper mapper;

    public DynamicQueryServiceImpl(DynamicQueryMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<Employee> queryConditions(Employee employee) {
        return mapper.queryConditions(employee);
    }
    @Override
    public List<Employee> queryConditionsTrim(Employee employee) {
        return mapper.queryConditionsTrim(employee);
    }
    @Override
    public List<Employee> queryConditionsChoose(Employee employee) {
        return mapper.queryConditionsChoose(employee);
    }
    @Override
    public List<Employee> queryConditionsForeach(List<String> ids) {
        return mapper.queryConditionsForeach(ids);
    }
    @Override
   public Long insertEmployeeBatch(List<Employee> employees){
       return mapper.insertEmployeeBatch(employees);
   }


}
