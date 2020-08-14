package com.xxx.demo.service.impl;

import com.xxx.demo.mapper.EmployeeQueryDeepMapper;
import com.xxx.demo.service.EmployeeQueryDeepService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class EmployeeQueryDeepServiceImpl implements EmployeeQueryDeepService {
    private final EmployeeQueryDeepMapper deepMapper;

    public EmployeeQueryDeepServiceImpl(EmployeeQueryDeepMapper deepMapper) {
        this.deepMapper = deepMapper;
    }

    @Override
    public Map<String, Object> selectOneReturnColumn(String id) {
        return deepMapper.selectOneReturnColumn(id);
    }

    @Override
    public Map<String, Object> selectMoreReturnColumn(String nickName) {
        return deepMapper.selectMoreReturnColumn("%"+nickName+"%");
    }
}
