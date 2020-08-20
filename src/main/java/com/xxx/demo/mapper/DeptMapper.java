package com.xxx.demo.mapper;

import com.xxx.demo.pojo.Dept;
import com.xxx.demo.pojo.po.DeptWithEmployee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeptMapper {
    Dept selectOne(Integer id);

    DeptWithEmployee selectOneWithEmployees(Integer id);
}
