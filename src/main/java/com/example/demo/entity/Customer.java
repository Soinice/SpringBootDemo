package com.example.demo.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

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
//    @JSONField(format = "yyyy-MM-dd")
    private Date registerTime;
    private String email;
    private String cellphone;
}
