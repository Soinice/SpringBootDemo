package com.example.demo.controller;

import com.example.demo.entity.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;

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
     * 跳转JSP界面
     *
     * @param request
     * @return
     */
    @RequestMapping("/helloJSP")
    public String helloJSP(HttpServletRequest request) {
        System.out.println("跳转JSP界面" + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        request.setAttribute("search", "Spring Boot （Web 篇）：支持JSP");
        return "index";
    }

    /**
     * 跳转到FreeMarker页面
     *
     * @return
     */
    @RequestMapping("helloFreeMarker")
    public String helloFreeMarker(Map<String, Object> map) {
        System.out.println("跳转到FreeMarker页面" + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        map.put("search", "Spring Boot （Web 篇）：整合FreeMarker模板");
        return "index";
    }

    /**
     * 跳转到Thymeleaf页面
     *
     * @return
     */
    @RequestMapping("helloThymeleaf")
    public String helloThymeleaf(Map<String, Object> map) {
        System.out.println("跳转到Thymeleaf页面" + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        map.put("search", "Spring Boot （Web 篇）：整合Thymeleaf模板");
        return "thymeleaf/indexThymeleaf";
    }

    /**
     * 返回FastJson
     *
     * @return
     */
    @RequestMapping("helloFastJson")
    @ResponseBody
    public Customer helloFastJson() {
        Customer customer = new Customer();
        customer.setId("0");
        customer.setCellphone("18800008888");
        customer.setEmail("666@163.com");
        customer.setUserName("测试FastJson");
        customer.setRegisterTime(new Date());
        return customer;
    }
}