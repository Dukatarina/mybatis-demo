package com.xxx.demo.pojo.po;

import com.xxx.demo.pojo.Dept;
import com.xxx.demo.pojo.Employee;
import lombok.Data;

@Data
public class EmployeeWithDept extends Employee {
    private Dept dept;
}
