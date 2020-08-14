package com.xxx.demo.rest;

import com.xxx.demo.pojo.Employee;
import com.xxx.demo.service.EmployeeQueryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class EmployeeQueryController {
    private final EmployeeQueryService employeeQueryService;

    public EmployeeQueryController(EmployeeQueryService employeeQueryService) {
        this.employeeQueryService = employeeQueryService;
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> employee(@PathVariable String id) {
        return ResponseEntity.ok(employeeQueryService.selectOne(id));
    }

    @GetMapping("/employee/{name}/{nickname}")
    public ResponseEntity<Employee> employeeByName(@PathVariable String name, @PathVariable String nickname) {
        return ResponseEntity.ok(employeeQueryService.selectOne(name, nickname));
    }

    @GetMapping("/employee2/{name}/{nickname}")
    public ResponseEntity<Employee> employeeByName2(@PathVariable String name, @PathVariable String nickname) {
        return ResponseEntity.ok(employeeQueryService.selectOne2(name, nickname));
    }
    @GetMapping("/employee3/{name}/{nickname}")
    public ResponseEntity<Employee> selectWithEntity(@PathVariable String name, @PathVariable String nickname) {
        return ResponseEntity.ok(employeeQueryService.selectWithEntity(name, nickname));
    }
    @GetMapping("/employee4/{name}/{nickname}")
    public ResponseEntity<Employee> selectWithMap(@PathVariable String name, @PathVariable String nickname) {
        return ResponseEntity.ok(employeeQueryService.selectWithMap(name, nickname));
    }

    @GetMapping("/employeesByNameLike/{nickname}")
    public ResponseEntity<List<Employee>> employeesByNameLike(@PathVariable String nickname) {
        return ResponseEntity.ok(employeeQueryService.employeesByNameLike( nickname));
    }
    @GetMapping("/selectOneReturnColumn/{id}")
    public ResponseEntity<Map<String,Object>> selectOneReturnColumn(@PathVariable String id){
        return ResponseEntity.ok(employeeQueryService.selectOneReturnColumn(id));
    }
    @GetMapping("/selectMoreReturnColumn/{nickName}")
    public ResponseEntity<Map<String,Object>> selectMoreReturnColumn(@PathVariable String nickName){
        return ResponseEntity.ok(employeeQueryService.selectMoreReturnColumn(nickName));
    }
}
