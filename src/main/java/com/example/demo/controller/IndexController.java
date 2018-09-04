package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lvyimeng
 * @version V1.0
 * @Title: springBootDemo
 * @Description: 你好，世界。
 * @date: 2018/9/3 16:47
 */
@RestController
@RequestMapping("/index")
public class IndexController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("返回数据"+">>>>>>>>>>>>>>>>>>>>>>>>>>>");
        return "你好，世界。";
    }

    @RequestMapping("")
    public String index(){
        System.out.println("返回页面"+">>>>>>>>>>>>>>>>>>>>>>>>>>>");
        return "/index";
    }
}
