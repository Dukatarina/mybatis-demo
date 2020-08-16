package com.xxx.demo.pojo.po;

import com.xxx.demo.pojo.Dept;
import com.xxx.demo.pojo.Employee;
import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeeWithDept extends Employee implements Serializable {
    private Dept dept;
}
