package com.example.demo.listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * @author lvyimeng
 * @version V1.0
 * @Title: springBootDemo
 * @Description: session中的某个对象的状态变化的监听器
 * @date: 2018/9/27 15:13
 */
public class SessionAttributeListerDemo implements HttpSessionAttributeListener {

    /**
     * 添加属性
     *
     * @param httpSessionBindingEvent
     */
    @Override
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
        HttpSession session = httpSessionBindingEvent.getSession();
        String sessionName = httpSessionBindingEvent.getName();

        System.out.println("新Session属性，名称为：" + sessionName + "值为：" + httpSessionBindingEvent.getValue());
    }

    /**
     * 删除属性
     *
     * @param httpSessionBindingEvent
     */
    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {

    }

    /**
     * 修改属性
     *
     * @param httpSessionBindingEvent
     */
    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {

    }
}
