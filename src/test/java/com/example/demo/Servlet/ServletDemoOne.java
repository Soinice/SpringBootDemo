package com.example.demo.Servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author lvyimeng
 * @version V1.0
 * @Title: springBootDemo
 * @Description: 简单Servlet例子
 * @date: 2018/9/17 18:18
 */
public class ServletDemoOne implements Servlet {

    /**
     *  生命周期方法:
     *      当Servlet第一次被创建对象时执行该方法,该方法在整个生命周期中只执行一次
     *
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    /**
     *  当停止tomcat时也就销毁的servlet。
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     *  生命周期方法:
     *      对客户端响应的方法,该方法会被执行多次，每次请求该servlet都会执行该方法
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse)
            throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     *  生命周期方法:
     *      当Servlet被销毁时执行该方法
     */
    @Override
    public void destroy() {

    }
}
