package com.example.demo.listener;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * @author lvyimeng
 * @version V1.0
 * @Title: springBootDemo
 * @Description: 监听Session 内的对象
 * @date: 2018/9/27 15:30
 */
public class SessionObjectListenerDemo implements HttpSessionActivationListener, HttpSessionBindingListener {


    /**
     * 钝化
     *
     * @param httpSessionEvent
     */
    @Override
    public void sessionWillPassivate(HttpSessionEvent httpSessionEvent) {

    }

    /**
     * 重新加载
     *
     * @param httpSessionEvent
     */
    @Override
    public void sessionDidActivate(HttpSessionEvent httpSessionEvent) {

    }

    /**
     * 对象放进Session
     *
     * @param httpSessionBindingEvent
     */
    @Override
    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {

    }

    /**
     * 对象移除Session
     *
     * @param httpSessionBindingEvent
     */
    @Override
    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {

    }
}
