package com.xxx.demo.service.impl;

import com.xxx.demo.mapper.StudentMapper;
import com.xxx.demo.pojo.Student;
import com.xxx.demo.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentMapper studentMapper;


    public StudentServiceImpl(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public Integer insert(Student student) {
        return studentMapper.insert(student);
    }
}
