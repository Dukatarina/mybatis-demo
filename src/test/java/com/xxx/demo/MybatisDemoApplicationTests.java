package com.xxx.demo;

import com.xxx.demo.mapper.EmployeeMapper;
import com.xxx.demo.mapper.EmployeeQueryMapper;
import com.xxx.demo.pojo.Employee;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisDemoApplicationTests {
    @Autowired
    private SqlSession sqlSession;

    @Test
    void contextLoads() {

        Employee employee = sqlSession.selectOne("com.xxx.demo.mapper.EmployeeQueryMapper.selectOne", "1");
        System.out.println(employee);
    }

    @Test
    void contextLoad2() {
        EmployeeQueryMapper mapper = sqlSession.getMapper(EmployeeQueryMapper.class);
        Employee employee = mapper.selectOne("1");
        System.out.println(employee);
    }
    @Test
    void contextLoad3() {
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> employees = mapper.selectList();
        employees.forEach(System.out::println);
    }

}
