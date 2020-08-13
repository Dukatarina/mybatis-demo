package com.xxx.demo.rest;

import com.xxx.demo.pojo.Student;
import com.xxx.demo.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/student/insert")
    public ResponseEntity<Integer> insert(@RequestBody Student student) {
        studentService.insert(student);
        return ResponseEntity.ok(student.getId());
    }
}
