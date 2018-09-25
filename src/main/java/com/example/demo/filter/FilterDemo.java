package com.example.demo.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author lvyimeng
 * @version V1.0
 * @Title: springBootDemo
 * @Description: filter例子
 * @date: 2018/9/25 11:00
 */
public class FilterDemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("=========初始化过滤器=========");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {

        long start = System.currentTimeMillis();

        filterChain.doFilter(servletRequest, servletResponse);

        System.out.println("filter 耗时：" + (System.currentTimeMillis() - start));
    }

    @Override
    public void destroy() {
        System.out.println("=========销毁过滤器=========");
    }
}
