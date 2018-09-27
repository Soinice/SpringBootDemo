package com.example.demo.listener;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author lvyimeng
 * @version V1.0
 * @Title: springBootDemo
 * @Description: 监听对象的创建与销毁
 * 一次性实现 三个接口
 * @date: 2018/9/27 14:32
 */
public class ListenerDemo implements HttpSessionListener, ServletContextListener, ServletRequestListener {

    /**
     * 创建session
     *
     * @param httpSessionEvent
     */
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        HttpSession session = httpSessionEvent.getSession();
        System.out.println("新建session完成，id为：" + session.getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {

    }

    /**
     * 加载 上下文
     *
     * @param servletContextEvent
     */
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext context = servletContextEvent.getServletContext();
        System.out.println("程序启动" + context.getContextPath());
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

    /**
     * 监听 request
     *
     * @param servletRequestEvent
     */
    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        HttpServletRequest request = (HttpServletRequest) servletRequestEvent.getServletRequest();
        String uri = request.getRequestURI();
        uri = request.getQueryString() == null ? uri : (uri + "?" + request.getQueryString());

        request.setAttribute("dateCreated", System.currentTimeMillis());

        System.out.println("本机IP：" + request.getRemoteAddr() + "请求" + uri);

    }

    /**
     * request 处理完毕销毁前执行
     *
     * @param servletRequestEvent
     */
    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        HttpServletRequest request = (HttpServletRequest) servletRequestEvent.getServletRequest();

        long time = System.currentTimeMillis() - (Long) request.getAttribute("dateCreated");

        System.out.println(request.getRemoteAddr() + "请求处理结束，用时" + time + "毫秒");
    }


}
