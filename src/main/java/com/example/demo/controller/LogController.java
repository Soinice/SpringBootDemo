package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lvyimeng
 * @version V1.0
 * @Title: springBootDemo
 * @Description: 日志演示
 * @date: 2018/9/5 17:34
 */
@Slf4j
@RestController
@RequestMapping("/log")
public class LogController {
    @GetMapping("/Slf4jLog")
    public void log(){
        String name = "imenger";
        int age = 18;

        //日志级别从低到高分为：TRACE < DEBUG < INFO < WARN < ERROR < FATAL
        log.trace("This is trace ...");
        log.debug("This is debugging ...");
        log.info("This is info...");
        log.warn("This is warning...");
        log.error("This is error...");

        //可以使用{} 占位符来拼接字符串，而不需要使用 + 来连接字符串
        log.info("姓名："+name+","+"年龄："+age);
        //等同于
        log.info("姓名：{},年龄：{}",name,age);
    }
}
