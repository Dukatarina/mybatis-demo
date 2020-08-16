package com.xxx.demo.pojo.po;

import com.xxx.demo.pojo.Dept;
import com.xxx.demo.pojo.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeptWithEmployee extends Dept implements Serializable {
    private  List<Employee> employees;
}
