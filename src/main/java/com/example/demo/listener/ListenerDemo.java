package com.example.demo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author lvyimeng
 * @version V1.0
 * @Title: springBootDemo
 * @Description: listener例子
 * @date: 2018/9/27 17:08
 */
public class ListenerDemo implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("*********初始化监听器*********");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("*********销毁监听器*********");
    }
}
