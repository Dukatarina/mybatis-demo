package com.xxx.demo;

import com.xxx.demo.mapper.DeptMapper;
import com.xxx.demo.mapper.EmployeeMapper;
import com.xxx.demo.mapper.EmployeeQueryMapper;
import com.xxx.demo.pojo.Dept;
import com.xxx.demo.pojo.Employee;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class MybatisDemoApplicationTests {
    @Autowired
    private SqlSession sqlSession;
    @Autowired
    private DataSource dataSource;
@Test
void dataSourceTest() throws SQLException {
    Connection connection = dataSource.getConnection();
    System.out.println(connection);
}
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

    @Test
    void contextLoad4() {
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.selectOne(1);
        System.out.println(dept);
    }

}
