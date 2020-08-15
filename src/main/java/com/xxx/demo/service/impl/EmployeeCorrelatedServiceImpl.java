package com.xxx.demo.service.impl;

import com.xxx.demo.mapper.EmployeeCorrelatedMapper;
import com.xxx.demo.pojo.po.EmployeeWithDept;
import com.xxx.demo.service.EmployeeCorrelatedService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class EmployeeCorrelatedServiceImpl implements EmployeeCorrelatedService {
    private final EmployeeCorrelatedMapper mapper;

    public EmployeeCorrelatedServiceImpl(EmployeeCorrelatedMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public EmployeeWithDept selectOne(String id) {
        return mapper.selectOne(id);
    }

    @Override
    public Map<String, Object> selectMap() {
        Map<String, Object> map=mapper.selectMap();
        return map;
    }

    @Override
    public EmployeeWithDept selectOneStep(String id) {
        return mapper.selectOneStep(id);
    }
}
