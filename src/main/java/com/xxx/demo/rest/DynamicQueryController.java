package com.xxx.demo.rest;

import com.xxx.demo.pojo.Employee;
import com.xxx.demo.service.DynamicQueryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/dynamic/queryConditionsTrim")
    public ResponseEntity<List<Employee>> queryConditionsTrim( Employee employee){
        return ResponseEntity.ok(service.queryConditionsTrim(employee));
    }
    @GetMapping("/dynamic/queryConditionsChoose")
    public ResponseEntity<List<Employee>> queryConditionsChoose( Employee employee){
        return ResponseEntity.ok(service.queryConditionsChoose(employee));
    }

    @GetMapping("/dynamic/queryConditionsForeach")
    public ResponseEntity<List<Employee>> queryConditionsForeach( @RequestParam(value = "ids") List<String> ids){
        return ResponseEntity.ok(service.queryConditionsForeach(ids));
    }
    @PostMapping("employee/insertEmployeeBatch")
    public ResponseEntity<Long> insertEmployeeBatch(@RequestBody List<Employee> employees){
        return ResponseEntity.ok(service.insertEmployeeBatch(employees));
    }
}
