package com.xxx.demo.mapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface EmployeeQueryDeepMapper {

    Map<String, Object> selectOneReturnColumn(String id);

    @MapKey("id")
    Map<String, Object> selectMoreReturnColumn(String nickname);
}
