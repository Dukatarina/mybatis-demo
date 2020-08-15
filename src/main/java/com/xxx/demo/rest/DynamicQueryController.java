package com.xxx.demo.rest;

import com.xxx.demo.pojo.Employee;
import com.xxx.demo.service.DynamicQueryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DynamicQueryController {
    private final DynamicQueryService service;

    public DynamicQueryController(DynamicQueryService service) {
        this.service = service;
    }
    @GetMapping("/dynamic/queryConditions")
    public ResponseEntity<List<Employee>> queryConditions( Employee employee){
        return ResponseEntity.ok(service.queryConditions(employee));
    }
}
