package com.xxx.demo.rest;

import com.xxx.demo.pojo.Dept;
import com.xxx.demo.service.DeptService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {
    private final DeptService deptService;

    public DeptController(DeptService deptService) {
        this.deptService = deptService;
    }

    @GetMapping("/dept/selectOne/{id}")
    public ResponseEntity<Dept> selectOne(@PathVariable Integer id){
        return ResponseEntity.ok(deptService.selectOne(id));
    }
}
