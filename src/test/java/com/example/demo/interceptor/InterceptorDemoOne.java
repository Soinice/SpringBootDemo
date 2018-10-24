package com.example.demo.interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * @author lvyimeng
 * @version V1.0
 * @Title: springBootDemo
 * @Description: 创建InterceptorDemo实现Interceptor
 * @date: 2018/10/24 13:19
 */
public class InterceptorDemoOne implements Interceptor {

    /**
     * Called to let an interceptor clean up any resources it has allocated.
     */
    @Override
    public void destroy() {

    }

    /**
     * Called after an interceptor is created, but before any requests are processed using
     * {@link #intercept(ActionInvocation) intercept} , giving
     * the Interceptor a chance to initialize any needed resources.
     */
    @Override
    public void init() {

    }

    /**
     * Allows the Interceptor to do some processing on the request before and/or after the rest of the processing of the
     * request by the {@link ActionInvocation} or to short-circuit the processing and just return a String return code.
     *
     * @param invocation the action invocation
     * @return the return code, either returned from {@link ActionInvocation#invoke()}, or from the interceptor itself.
     * @throws Exception any system-level error, as defined in {@link Action#execute()}.
     */
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        return null;
    }
}
