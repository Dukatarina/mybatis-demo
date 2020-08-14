package com.xxx.demo.service;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface EmployeeQueryDeepService {
    Map<String, Object> selectOneReturnColumn(String id);
}
