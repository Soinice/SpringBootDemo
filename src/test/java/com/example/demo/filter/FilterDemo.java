package com.example.demo.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author lvyimeng
 * @version V1.0
 * @Title: springBootDemo
 * @Description: 简单Filter例子
 * @date: 2018/9/20 16:20
 */
public class FilterDemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest) servletRequest;//获取request对象
        HttpServletResponse response=(HttpServletResponse) servletResponse;//获取response对象

        //设置中文编码
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        HttpSession session=request.getSession();//获取session对象

        //过滤操作代码......
        String path=request.getRequestURI();

        Integer uid=(Integer)session.getAttribute("userid");

        if(path.indexOf("/login.jsp")>-1){//登录页面不过滤
            filterChain.doFilter(request, response);//放行，通过了当前过滤器，递交给下一个filter进行过滤
            return;
        }
        if(path.indexOf("/register.jsp")>-1){//注册页面不过滤
            filterChain.doFilter(request, response);//放行，通过了当前过滤器，递交给下一个filter进行过滤
            return;
        }

        if(uid!=null){//已经登录
            filterChain.doFilter(request, response);//放行，通过了当前过滤器，递交给下一个filter进行过滤
        }else{
            response.sendRedirect("login.jsp");
        }
    }

    @Override
    public void destroy() {

    }
}
