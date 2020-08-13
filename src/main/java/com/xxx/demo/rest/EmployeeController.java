package com.xxx.demo.rest;

import com.xxx.demo.pojo.Employee;
import com.xxx.demo.service.EmployeeServer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmployeeController {
    private  final EmployeeServer employeeServer;

    public EmployeeController(EmployeeServer employeeServer) {
        this.employeeServer = employeeServer;
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> employee(@PathVariable String id){
        return ResponseEntity.ok(employeeServer.selectOne(id));
    }
    @GetMapping("/employee/{name}/{nickname}")
    public ResponseEntity<Employee> employeeByName(@PathVariable String name,@PathVariable String nickname){
        return ResponseEntity.ok(employeeServer.selectOne(name,nickname));
    }
    @GetMapping("/employee/list")
    public ResponseEntity<List<Employee>> employeeList(){
        return ResponseEntity.ok(employeeServer.selectList());
    }
    @PutMapping("/employee/update")
    public ResponseEntity<Boolean> employeeUpdate(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeServer.update(employee));
    }
    @PostMapping("/employee/insert")
    public ResponseEntity<Integer> employeeInsert(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeServer.insertOne(employee));
    }
    @DeleteMapping("/employee/{id}")
    public ResponseEntity<Boolean> employeeDelete(@PathVariable String id){
        return ResponseEntity.ok(employeeServer.deleteOne(id));
    }

}
