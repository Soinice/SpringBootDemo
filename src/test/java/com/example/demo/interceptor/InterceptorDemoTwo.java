package com.example.demo.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * @author lvyimeng
 * @version V1.0
 * @Title: springBootDemo
 * @Description: 创建InterceptorDemo继承AbstractInterceptor
 * @date: 2018/10/24 13:39
 */
public class InterceptorDemoTwo extends AbstractInterceptor {

    /**
     * Override to handle interception
     *
     * @param invocation
     */
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        //在这里进行需求操作
        return null;
    }
}
