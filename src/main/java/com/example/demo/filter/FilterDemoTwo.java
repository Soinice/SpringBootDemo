package com.example.demo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 使用注解注册过滤器
 *
 * @author lvyimeng
 * @version V1.0
 * @Title: springBootDemo
 * @Description: @WebFilter将一个实现了javax.servlet.Filter接口的类定义为过滤器
 * 属性filterName声明过滤器的名称, 可选
 * 属性urlPatterns指定要过滤 的URL模式,也可使用属性value来声明.(指定要过滤的URL模式是必选属性)
 * @date: 2018/9/25 11:31
 */
@WebFilter(filterName = "FilterDemoTwo", urlPatterns = "/*")
public class FilterDemoTwo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("=========初始化过滤器 002=========");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {

        long start = System.currentTimeMillis();

        filterChain.doFilter(servletRequest, servletResponse);

        System.out.println("filter 002 耗时：" + (System.currentTimeMillis() - start));
    }

    @Override
    public void destroy() {
        System.out.println("=========销毁过滤器 002=========");
    }
}
