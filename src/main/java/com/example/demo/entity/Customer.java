package com.example.demo.entity;

import lombok.Data;

/**
 * @author lvyimeng
 * @version V1.0
 * @Title: springBootDemo
 * @Description: 用户相关信息
 * @date: 2018/9/12 18:06
 */
@Data
public class Customer {
    private String id;
    private String userName;
    private java.sql.Timestamp registerTime;
    private String email;
    private String cellphone;
}
