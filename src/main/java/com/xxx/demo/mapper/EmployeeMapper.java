package com.xxx.demo.mapper;

import com.xxx.demo.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    Employee selectOne(String id);

    @Select("select * from mybatis_employee")
    List<Employee> selectList();

    Boolean UpdateEmployee(Employee employee);


    Boolean deleteEmployee(String id);

    Integer insertEmployee(Employee employee);

    Integer insertEmployeeList(List<Employee> employeeList);
}
