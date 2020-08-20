package com.xxx.demo.rest;

import com.xxx.demo.pojo.po.EmployeeWithDept;
import com.xxx.demo.service.EmployeeCorrelatedService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class EmployeeCorrelatedController {
    private final EmployeeCorrelatedService service;

    public EmployeeCorrelatedController(EmployeeCorrelatedService service) {
        this.service = service;
    }

    @GetMapping("EmployeeCorrelated/selectOne/{id}")
    public ResponseEntity<EmployeeWithDept> selectOne(@PathVariable String id) {
        return ResponseEntity.ok(service.selectOne(id));
    }

    @GetMapping("EmployeeCorrelated/selectMap/")
    public ResponseEntity<Map<String,Object>> selectMap() {
        return ResponseEntity.ok(service.selectMap());
    }
    @GetMapping("EmployeeCorrelated/selectOneStep/{id}")
    public ResponseEntity<EmployeeWithDept> selectOneStep(@PathVariable String id) {
        return ResponseEntity.ok(service.selectOneStep(id));
    }
}
