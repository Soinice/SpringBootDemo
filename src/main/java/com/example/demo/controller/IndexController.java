package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lvyimeng
 * @version V1.0
 * @Title: springBootDemo
 * @Description: 你好，世界。
 * @date: 2018/9/3 16:47
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    /**
     * 返回数据
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("返回数据" + ">>>>>>>>>>>>>>>>>>>>>>>>>>>");
        return "你好，世界。";
    }

    /**
     *  跳转JSP界面
     *
     * @param request
     * @return
     */
    @RequestMapping("/helloJSP")
    public String helloJSP(HttpServletRequest request) {
        System.out.println("跳转JSP界面" + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        request.setAttribute("search","Spring Boot （Web 篇）：支持JSP");
        return "indexJSP";
    }
}
