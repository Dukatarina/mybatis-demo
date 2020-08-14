package com.xxx.demo.rest;

import com.xxx.demo.service.EmployeeQueryDeepService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class EmployeeQueryDeepController {
    private final EmployeeQueryDeepService deepService;

    public EmployeeQueryDeepController(EmployeeQueryDeepService deepService) {
        this.deepService = deepService;
    }
    @GetMapping("/selectOneReturnColumn/{id}")
    public ResponseEntity<Map<String,Object>> selectOneReturnColumn(@PathVariable String id){
        return ResponseEntity.ok(deepService.selectOneReturnColumn(id));
    }
}
