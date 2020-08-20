package com.xxx.demo.service.impl;

import com.xxx.demo.mapper.DeptMapper;
import com.xxx.demo.pojo.po.DeptWithEmployee;
import com.xxx.demo.service.DeptService;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService {
    private final DeptMapper deptMapper;

    public DeptServiceImpl(DeptMapper deptMapper) {
        this.deptMapper = deptMapper;
    }

    @Override
    public DeptWithEmployee selectOne(Integer id) {
        return deptMapper.selectOneWithEmployees(id);
    }
}
