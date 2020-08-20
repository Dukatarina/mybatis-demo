package com.xxx.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {
    private String id;
    private String name;
    private String email;
    private Integer age;
    private String nickName;
    private Integer dId;
}
